package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assertion {

    public static void verifyText(By locator, String expected) { 
        try{
        WebElement ele = Base.driver.findElement(locator);
        String actual = ele.getText();
        Assert.assertEquals(actual, expected); 
        }
        catch(Exception e){
            e.getMessage();   //use logs
        }
    }

    public static void verifyPartialText(By locator, String expected) {
        try{
        WebElement ele = Base.driver.findElement(locator);
        String actual = ele.getText();
        Assert.assertTrue(actual.contains(expected));
        }
        catch(Exception e){
            e.getMessage();
        }
    }

    public static void verifyUrl(String expected) { 
        try{
        String actual = Base.driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
        }
        catch(Exception e){
            e.getMessage();
        }
    }
    public static void verifyTitle(String expected) { 
        try {
            String actual = Base.driver.getTitle();
            Assert.assertEquals(actual, expected);
        } catch (Exception e) {
            e.getMessage();
        }
       
    }

}
