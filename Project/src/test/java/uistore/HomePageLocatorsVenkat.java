package uistore;
 
import org.openqa.selenium.By;
/*
 * Class Name: AboutUsLocatorsVenkat
 * Author Name: Venkatanarayana
 * Description: This class contains locators for elements on the Home page.
 */
 
public class HomePageLocatorsVenkat {
 
  public static By cycleByBrand=By.xpath("(//a[@class='nav-link'])[4]");
  public static By avon=By.xpath("(//a[text()='Avon'])[1]");
  public static By avonVerify=By.cssSelector("h1[class='heading mb-0']");
  public static By sort=By.cssSelector("div[class='filter-option-inner-inner']");
  public static By priceAscending=By.xpath("//span[text()='Price ascending']");
  public static By compare=By.xpath("(//span[@class='icon-flip'])[1]");
  public static By cart=By.xpath("(//span[@class='icon-ShoppingCart'])[2]");
  public static By plus=By.cssSelector("img[alt='plus']");
  public static By delete=By.cssSelector("a[alt='Remove Item']");
  public static By checkout=By.cssSelector("button[id='checkout_btn']");
  public static By selectAddress=By.xpath("//p[text()='Select Address']");
  public static By priceDetail=By.cssSelector("h1[class='heading mb-0']");
  public static By selectPaymentMethod=By.xpath("//p[text()='Select Payment Method']");
  public static By backToCart=By.cssSelector("button[class='default-btn  button button-lg ']");
 
}
 
 
 
 
 
 