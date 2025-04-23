package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

public class Screenshot extends Base {

     /*
         * Method Name: takeScreenshot
         * Author Name: Venkatanarayana
         * Description: This method captures a screenshot, names it with a timestamp, and saves it to a specified directory.
         * Return Type: void
         * Parameter List: String filename - The base name for the screenshot file.
         */
    public static void takeScreenshot(String filename) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/screenshots/";
        try {
            FileUtils.copyFile(screenshot, new File(path + name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}