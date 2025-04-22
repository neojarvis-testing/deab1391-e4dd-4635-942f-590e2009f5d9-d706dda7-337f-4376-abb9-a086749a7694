package runner;
  
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.BusinessPageActions;
import pages.CyclesPageActions;
import utils.Base;
import utils.Reporter;
 
 
public class TestRunner extends Base {
    ExtentReports report;
    ExtentTest test;
    BusinessPageActions businesspageactions;
    CyclesPageActions cyclespageactions;


    @BeforeClass

     public void setup(){
         report= Reporter.createReport("Avon Cycles Report");
     }
 
    @BeforeMethod
    public void launch(){
        openBrowser();        
    }
 
    @Test
    public void testcase4(){
        test = report.createTest("Test Case 4");
        businesspageactions = new BusinessPageActions(test);
        businesspageactions.testCase4();
    }

    @Test
    public void testcase9(){
        test = report.createTest("Test Case 9");
        cyclespageactions = new CyclesPageActions(test);
        cyclespageactions.testCase9();
    }

    @AfterMethod
    public void tear(){
                driver.quit();
    }

    @AfterClass
     public void terminate(){
         report.flush();

     }
}




// package runner;
 
 
// import org.testng.annotations.AfterClass;

// import org.testng.annotations.AfterMethod;

// import org.testng.annotations.BeforeClass;

// import org.testng.annotations.BeforeMethod;

// import org.testng.annotations.Test;
 
// import com.aventstack.extentreports.ExtentReports;

// import com.aventstack.extentreports.ExtentTest;

// import pages.AccolodesActionsRam;

// import pages.HomePageActionsRam;

// import utils.Base;

// import utils.Reporter;
 
 
// public class TestRunner extends Base { 

//     ExtentReports report;

//     ExtentTest test; 

//     HomePageActionsRam hpa;

//     AccolodesActionsRam aar;
 
 
//     @BeforeClass

//     public void setup(){

//         report= Reporter.createReport("Avon Cycles Report");

//     }
 
//     @BeforeMethod 

//     public void launch(){

//         openBrowser();

//         hpa = new HomePageActionsRam();

//         aar = new AccolodesActionsRam();

//     }
 
//     @Test

//     public void testCase2(){ 

//         hpa.test1();

//     }  
 
//     @Test

//     public void testCase7(){ 

//         aar.test2();  

//     }
 
//     @AfterMethod

//     public void tear(){

//         driver.quit();

//     }
 
//     @AfterClass

//     public void terminate(){

//         report.flush();

//     }
 
// }

 


