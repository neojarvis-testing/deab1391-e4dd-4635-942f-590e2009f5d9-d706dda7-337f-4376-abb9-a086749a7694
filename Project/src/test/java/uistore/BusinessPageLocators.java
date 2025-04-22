package uistore;

import org.openqa.selenium.By;

public class BusinessPageLocators {
    public static By business = By.xpath("//a[text()='International Business']");
    public static By image = By.xpath("//img[@src='img/avon-int-logo.jpg']");
    public static By emaillabel = By.xpath("//label[text()='Email ID (required)']");
    public static By email = By.xpath("(//input[@class='form-control'])[1]");
    public static By phonelabel = By.xpath("//label[text()='Ph. No (required)']");
    public static By phone = By.xpath("(//input[@class='form-control'])[2]");
    public static By countrylabel = By.xpath("//label[text()='Country ']");
    public static By country = By.xpath("(//input[@class='form-control'])[3]");
    public static By companylabel = By.xpath("//label[text()='Company Name ']");
    public static By company = By.xpath("(//input[@class='form-control'])[4]");
    public static By addresslabel = By.xpath("//label[text()='Address ']");
    public static By address = By.xpath("(//input[@class='form-control'])[5]");
    public static By subjectlabel = By.xpath("//label[text()='Subject ']");
    public static By subject = By.xpath("(//input[@class='form-control'])[6]");
    public static By messagelabel = By.xpath("//label[text()='Your Message']");
    public static By message = By.xpath("//textarea[@class='form-control']");
    public static By send = By.xpath("//input[@class='btn btn-primary']");
    public static By certifications = By.xpath("//div[text()='Certifications']");
}
