package uistore;

import org.openqa.selenium.By;

public class HomePageLocatorsVenkat {

  public static By CycleByBrand=By.xpath("(//a[@class='nav-link'])[4]");
  public static By Avon=By.xpath("(//a[text()='Avon'])[1]");
  public static By Avonverify=By.cssSelector("h1[class='heading mb-0']");
  public static By Sort=By.cssSelector("div[class='filter-option-inner-inner']");
  public static By PriceAscending=By.xpath("//span[text()='Price ascending']");
  public static By Compare=By.xpath("(//span[@class='icon-flip'])[1]");
  public static By Cart=By.xpath("(//span[@class='icon-ShoppingCart'])[2]");
  public static By Plus=By.cssSelector("img[alt='plus']");
  public static By Delete=By.cssSelector("span[class='icon-remove']");
  public static By Checkout=By.cssSelector("button[id='checkout_btn']");
  public static By SelectAddress=By.xpath("//p[text()='Select Address']");
  public static By PriceDetail=By.cssSelector("h1[class='heading mb-0']");
  public static By SelectPaymentMethod=By.xpath("//p[text()='Select Payment Method']");
  public static By BackToCart=By.cssSelector("button[class='default-btn  button button-lg ']");
  


}
