package uistore;

import org.openqa.selenium.By;

public class FitnessMachinesLocators {
public static By avonfitness=By.xpath("//a[text()='Avon Fitness Machines']");
public static By popUp=By.xpath("//button[@data-dismiss='modal']");
public static By domesticGym=By.xpath("//a[text()='Domestic Gym ']");
public static By cardioLine=By.xpath("(//span[text()='Cardio Line'])[2]");
public static By treadmills=By.xpath("(//a[text()='Treadmills '])[2]");
public static By firstProduct=By.xpath("(//a[text()='Enquire Now'])[1]");
public static By specifications=By.xpath("//h3[text()='Specifications']");
public static By enquireNow=By.cssSelector("button[class='btnCustom blackBtn cartaddbtn uc w-100']");
public static By productName=By.cssSelector("#product_enquiry_pname");
public static By productModel=By.cssSelector("#product_enquiry_model");
public static By name=By.cssSelector("#product_enquiry_name");
public static By email=By.cssSelector("input[name='product_enquiry_email']");
public static By phoneNumber=By.xpath("//input[@id='product_enquiry_phone']");
public static By city=By.xpath("//input[@id='product_enquiry_city']");
public static By submit=By.xpath("(//button[text()='Submit'])[1]");
}
