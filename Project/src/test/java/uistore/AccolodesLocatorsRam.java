package uistore;

import org.openqa.selenium.By;

/*
 * Class Name: AccolodesLocatorsRam
 * Author Name: Ramavathar
 * Description: This class contains locators for elements on the "Accolodes" page.
 */

public class AccolodesLocatorsRam { 
    public static By accolode = By.xpath("//a[text()='Accolodes/Award']") ;
    public static By blog = By.xpath("//a[text()='Blogs']") ;
    public static By warranty = By.xpath("//a[text()='Warranty Policy']");
    public static By terms = By.xpath("//a[text()='Terms & Conditions']");
    public static By dealer = By.xpath("(//a[text()='Dealer Locator'])[1]");
    public static By state = By.xpath("(//select[@class='form-control '])[1]");
    public static By city = By.xpath("(//select[@class='form-control '])[2]");
    public static By dealLocator = By.xpath("//li[text()='Dealer Locator']"); 
    public static By logo = By.xpath("(//img[@class='img-fluid'])[1]");
    public static By cookies=By.cssSelector("button[class='accept btn']");
}

