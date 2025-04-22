package utils;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {

    WebDriver driver;

    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementToBeVisible(By locator, int time) {
        new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementToBeClickable(By locator, int time) {
        new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void clickOnElement(By locator) {
        waitForElementToBeVisible(locator, 5);
        waitForElementToBeClickable(locator, 5);
        driver.findElement(locator).click();
    }

    public void typeInElement(By locator, String str) {
        waitForElementToBeVisible(locator, 5);
        driver.findElement(locator).sendKeys(str);
    }

    public void hoverOverElement(By locator) {
        waitForElementToBeVisible(locator, 5);
        waitForElementToBeClickable(locator, 5);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).perform();
    }

    public void enter(By locator) {
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    public void scroll(By locator) {
        waitForElementToBeVisible(locator, 5);
        WebElement elem = driver.findElement(locator);
        Actions action = new Actions(driver);
        action.moveToElement(elem).build().perform();
    }

    public void switchWindow() {
        String currWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for (String win : windows) {
            if (!win.equals(currWindow)) {
                driver.switchTo().window(win);
                break;
            }
        }

    }

    public void scrollBy(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }

    public List<WebElement> getElementsByXPath(String str) {
        return driver.findElements(By.xpath(str));
    }

    public void iterate(String str, String str1) {
        List<WebElement> list1 = getElementsByXPath(str);
        for (WebElement ele : list1) {
            String text = ele.getText();
            LoggerHandler.logInfo(text);
            if (text.contains(str1)) {
                ele.click();
            }
        }
    }

    public void sortFilter(By locator, String str) {
        WebElement ele = driver.findElement(locator);
        Select select = new Select(ele);
        select.selectByVisibleText(str);
    } 

    // public String readdata(int r,int c){
    //     try{
    //     String data=ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx","Sheet1", r, c);
    //     return data;
    //     }
    //     catch(Exception e){
    //       e.printStackTrace();
    //       return null;
    //     }
    //   }

}
