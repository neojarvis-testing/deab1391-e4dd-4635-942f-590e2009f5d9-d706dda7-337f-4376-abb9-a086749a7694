package uistore;

import org.openqa.selenium.By;

/*
 * Class Name: HomePageLocatorsRam
 * Author Name: Ramavathar
 * Description: This class contains locators for elements on the "Home Page" page.
 */

public class HomePageLocatorsRam { 
    public static By biycle = By.xpath("(//a[@class='nav-link'])[3]");
    public static By electric = By.xpath("(//a[@class='dropdown-item'])[5]");
    public static By price = By.xpath("//p[text()='Price']");
    public static By review = By.xpath("//p[text()='Review']");
    public static By reviewFirst = By.cssSelector("input[id='radio4']");
    public static By size = By.xpath("//p[text()='Size']");
    public static By sizeFirst = By.cssSelector("input[id='radio8']");
    public static By height = By.xpath("//p[text()='Height (in feets)']");
    public static By heightFirst = By.cssSelector("input[id='radio9']");
    public static By age = By.xpath("//p[text()='Age']");
    public static By ageFirst = By.cssSelector("input[id='radio10']");
    public static By color = By.xpath("//p[text()='Color Swatches']");
    public static By colorFirst = By.cssSelector("input[id='radio12']");
    public static By clear = By.xpath("//button[text()='Clear Filter']");
    public static By categories = By.xpath("//a[text()='Categories']");
    public static By bCategory = By.xpath("//a[text()='Bicycle Category']");
    public static By biCategory = By.xpath("//li[text()='Bicycle Category']");



}

