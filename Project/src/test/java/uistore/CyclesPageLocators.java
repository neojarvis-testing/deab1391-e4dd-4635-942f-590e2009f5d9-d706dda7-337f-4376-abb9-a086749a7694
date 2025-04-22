package uistore;

import org.openqa.selenium.By;

public class CyclesPageLocators {
    public static By cycles = By.xpath("//a[text()='MTB Cycles (Single Speed)']");
    public static By cyclux = By.xpath("(//a[text()='Cyclux'])[2]");
    public static By avon = By.xpath("(//a[text()='Avon'])[2]");
    public static By price = By.xpath("//p[text()='Price']");
    public static By review = By.xpath("//p[text()='Review']");
    public static By firstreview = By.xpath("//input[@id='radio4']");
    public static By size = By.xpath("//p[text()='Size']");
    public static By firstsize = By.xpath("//input[@id='radio8']");
    public static By color = By.xpath("//p[text()='Color Swatches']");
    public static By clear = By.xpath("//button[text()='Clear Filter']");
    public static By sort = By.xpath("//div[text()='Sort']");
    public static By sortfirst =By.xpath("//span[text()='Price ascending']");
    public static By firstprod = By.xpath("(//img[@class='img-fluid'])[7]");
    public static By add = By.xpath("(//a[text()='Add to cart'])[1]");
}
