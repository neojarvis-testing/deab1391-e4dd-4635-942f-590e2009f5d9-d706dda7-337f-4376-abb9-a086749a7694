package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assertion {

    public static void verifyText(By locator, String expected) {
        WebElement ele = Base.driver.findElement(locator);
        String actual = ele.getText();
        Assert.assertEquals(actual, expected);
    }

    public static void verifyPartialText(By locator, String expected) {
        WebElement ele = Base.driver.findElement(locator);
        String actual = ele.getText();
        Assert.assertTrue(actual.contains(expected));
    }

    public static void verifyUrl(String expected) {
        String actual = Base.driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
    }

    public static void verifyTitle(String expected) {
        String actual = Base.driver.getTitle();
        Assert.assertEquals(actual, expected);
    }

}
