package utils;

import java.io.FileInputStream;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class Base {
    public static WebDriver driver;
    public static Properties prop;

    public void openBrowser() {
        String propertiesPath = System.getProperty("user.dir") + "/config/config.properties";
        prop = new Properties();
        FileInputStream fis;
        try {
            fis = new FileInputStream(propertiesPath);
            prop.load(fis);

            ChromeOptions options = new ChromeOptions();
            driver = new RemoteWebDriver(new URL(prop.getProperty("gridurl")), options);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
            driver.get(prop.getProperty("url"));

        } catch (Exception e) {
            e.printStackTrace();
        }

        WebDriverListener listener = new EventHandler();
        driver = new EventFiringDecorator<>(listener).decorate(driver);
    }
}
