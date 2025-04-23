package uistore;

import org.openqa.selenium.By;

/*
 * Class Name: NewLaunchLocators
 * Author Name: Sharmila Abdul
 * Description: Contains locators for elements on the New Launch page.
 */

public class NewLaunchLocators {

    public static By newLaunch = By.cssSelector("a[href='https://avoncycles.com/category/new-launches.html']");
    public static By heartIcon = By.xpath("(//span[@class='icon-heart'])[1]");
    public static By loginTitle = By.xpath("//h1[text()='Login account']");
    public static By email = By.cssSelector("input[placeholder='Email']");
    public static By password = By.cssSelector("input[placeholder='Password']");
    public static By login = By.name("SubmitLogin");
    public static By errorMsg = By.cssSelector("span[class='help-block']");
    public static By createAccount = By.xpath("//a[text()='New to here? Create an account']");
    public static By firstName = By.cssSelector("input[placeholder='First name']");
    public static By lastName = By.cssSelector("input[placeholder='Last name']");
    public static By registerEmail = By.cssSelector("input[placeholder='Email']");
    public static By phone = By.cssSelector("input[placeholder='Phone']");
    public static By registerPassword = By.cssSelector("input[placeholder='Password']");
    public static By signUp = By.name("SubmitCreate");

}
