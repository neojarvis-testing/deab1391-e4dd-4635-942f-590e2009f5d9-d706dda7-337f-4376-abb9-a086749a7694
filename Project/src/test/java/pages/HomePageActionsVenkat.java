package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.HomePageLocatorsVenkat;
import utils.Assertion;
import utils.Base;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageActionsVenkat {
 WebDriverHelper helper;
 ExtentTest test;
 public HomePageActionsVenkat(ExtentTest test){
    this.test=test;
    helper=new WebDriverHelper(Base.driver);
 }
 public void hoverOnCycleByBrand(){
    helper.hoverOverElement(HomePageLocatorsVenkat.CycleByBrand);
 }
 public void clickOnAvon(){
    helper.clickOnElement(HomePageLocatorsVenkat.Avon);
 }

 public void verifyAvon(){
    Assertion.verifyText(HomePageLocatorsVenkat.Avonverify, "Avon");
}

public void clickOnSort(){
    helper.clickOnElement(HomePageLocatorsVenkat.Sort);
}

public void clickonPriceAscending(){
    helper.clickOnElement(HomePageLocatorsVenkat.PriceAscending);
}

public void clickOnCompare(){
    helper.clickOnElement(HomePageLocatorsVenkat.Compare);
}

public void clickOnCart(){
    helper.clickOnElement(HomePageLocatorsVenkat.Cart);
}

public void clickOnPlus(){
    helper.clickOnElement(HomePageLocatorsVenkat.Plus);
}

public void clickOnDelete(){
    helper.clickOnElement(HomePageLocatorsVenkat.Delete);
}

public void dismissAlert(){
 helper.alertDismiss();
}

public void clickonCheckout(){
    helper.clickOnElement(HomePageLocatorsVenkat.Checkout);
}

public void verifyUrl(){
    Assertion.verifyUrl("https://avoncycles.com/checkout.html");
}
public void verifySelectAddress(){
    Assertion.verifyText(HomePageLocatorsVenkat.SelectAddress, "Select Address");
}

public void verifyPriceDetail(){
    Assertion.verifyText(HomePageLocatorsVenkat.PriceDetail, "Price Details");
}

public void verifySelectPaymentMethod(){
    Assertion.verifyText(HomePageLocatorsVenkat.SelectPaymentMethod, "Select Payment Method");
}

public void verifyBackToCart(){
    Assertion.verifyText(HomePageLocatorsVenkat.BackToCart, "BACK TO CART");
}

public void testAll(){
    hoverOnCycleByBrand();
    clickOnAvon();
    verifyAvon();
    clickOnSort();
    clickonPriceAscending();
    clickOnCompare();
    clickOnCart();
    clickOnPlus();
    clickOnDelete();
    dismissAlert();
    clickonCheckout();
    verifyUrl();
    verifySelectAddress();
    verifyPriceDetail();
    verifySelectPaymentMethod();
    verifyBackToCart();
    Screenshot.takeScreenshot("testcase3");
    Reporter.addScreenshot("testcase3", test, null);
}

}
