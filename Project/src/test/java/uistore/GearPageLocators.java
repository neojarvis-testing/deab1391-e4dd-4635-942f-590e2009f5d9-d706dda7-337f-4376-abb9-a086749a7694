package uistore;

import org.openqa.selenium.By;

public class GearPageLocators {
public static By accept=By.xpath("//button[@id='acceptCookies']");
public static By searchIcon=By.xpath("(//span[@class='icon-icon-Search'])[1]");
public static By searchBar=By.xpath("//input[@placeholder='Input keyword']");
public static By firstProduct=By.xpath("(//div[@class='product-name'])[1]");
public static By buyNow=By.cssSelector("#productBuyNow");
public static By firstName=By.cssSelector("input[placeholder='First name']");
public static By lastName=By.cssSelector("input[placeholder='Last name']");
public static By email=By.cssSelector("input[name='email']");
public static By phoneNumber=By.xpath("//input[@placeholder='Phone']");
public static By postcode=By.cssSelector("input[placeholder='Post code']");
public static By state=By.xpath("//input[@name='address1']");
public static By city=By.xpath("//input[@name='address2']");
public static By address=By.cssSelector(("input[placeholder='Address']"));
public static By coupon=By.xpath("//input[@placeholder='Your coupon']");
public static By apply=By.cssSelector("#coupon-button");
public static By razorPay=By.xpath("//label[@class='radio-inline']/input[@value='Razorpay']");
public static By confirmCheckout=By.cssSelector("#sc_button-form-process");
public static By proceedToPayment=By.xpath(("//button[text()='Proceed To Payment']"));
}
