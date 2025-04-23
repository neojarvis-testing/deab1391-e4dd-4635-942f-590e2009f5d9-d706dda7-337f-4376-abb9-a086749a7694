package uistore;

import org.openqa.selenium.By;

/*
 * Class Name: CambioLocators
 * Author Name: Sharmila Abdul
 * Description: Contains locators for elements on the Cambio Bikes page.
 */

public class CambioLocators {
    public static By cambio = By.cssSelector("a.link[href='https://cambiobikes.com/']");
    public static By Bikes = By.xpath("//span[text()='Bikes']");
    public static By BestSellers = By.xpath("//span[text()='Best Sellers']");
    public static By productCategories = By.xpath("//span[text()='Product categories']");
    public static By size = By.cssSelector(".ridez-button-type:first-of-type");
    public static By best = By.xpath("//h1[contains(text(), 'Best Selling Bicycle')]");
    public static By firstProduct = By.cssSelector("div.product-block:first-of-type");
    public static By selectOptions = By.xpath("(//a[text()='Select options'])[1]");
    public static By verify26T = By.xpath("//h1[@class='product_title entry-title']");
    public static By addtocart = By.cssSelector("button.single_add_to_cart_button.button.alt");
    public static By viewCart = By.cssSelector("a[class='button wc-forward']");
    public static By cartTotals = By.xpath("//h2[text()='Cart totals']");
    public static By proceedCheckOut = By.xpath("(//a[@href='https://cambiobikes.com/checkout/'])[1]");

}
