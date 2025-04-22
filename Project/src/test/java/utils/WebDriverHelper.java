package utils;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
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
        try {
            new WebDriverWait(driver, Duration.ofSeconds(time))
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public void waitForElementToBeClickable(By locator, int time) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public void clickOnElement(By locator) {
        try {
            waitForElementToBeVisible(locator, 5);
            waitForElementToBeClickable(locator, 5);
            driver.findElement(locator).click();
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public void typeInElement(By locator, String str) {
        try {
            waitForElementToBeVisible(locator, 5);
            driver.findElement(locator).sendKeys(str);
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public void hoverOverElement(By locator) {
        try {
            waitForElementToBeVisible(locator, 5);
            waitForElementToBeClickable(locator, 5);
            Actions actions = new Actions(driver);
            actions.moveToElement(driver.findElement(locator)).perform();
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public void enter(By locator) {
        try {
            driver.findElement(locator).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public void scroll(By locator) {
        try {
            waitForElementToBeVisible(locator, 5);
            WebElement elem = driver.findElement(locator);
            Actions action = new Actions(driver);
            action.moveToElement(elem).build().perform();
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public void switchWindow() {
        try {
            String currWindow = driver.getWindowHandle();
            Set<String> windows = driver.getWindowHandles();
            for (String win : windows) {
                if (!win.equals(currWindow)) {
                    driver.switchTo().window(win);
                    break;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public void scrollBy(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }

    public List<WebElement> getElementsByXPath(String str) {
        try {
            return driver.findElements(By.xpath(str));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }

    } 

    
        

    public void alertDismiss(){
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
    }
    public void navigateBack(){
        driver.navigate().back();
    }

    public void iterate(String str, String str1) {
        try {
            List<WebElement> list1 = getElementsByXPath(str);
            for (WebElement ele : list1) {
                String text = ele.getText();
                LoggerHandler.logInfo(text);
                if (text.contains(str1)) {
                    ele.click();
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public void sortFilter(By locator, String str) {
        WebElement ele = driver.findElement(locator);
        Select select = new Select(ele);
        select.selectByVisibleText(str);
    }

    public void navigateBack(){
        driver.navigate().back();
    } 

    public void alertDismiss(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }  

    public void dropdown(By locator, String str) {
        try {
            List<WebElement> list = new Select(driver.findElement(locator)).getOptions();
            for (WebElement ele : list) {
                String value = ele.getText();
                if (value.equalsIgnoreCase(str)) {
                    new Select(driver.findElement(locator)).selectByVisibleText(value);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
    }
}
