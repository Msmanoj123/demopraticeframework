package testCases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Practice {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        p1 p1 = new p1(driver);
        driver.manage().window().maximize();
        TakesScreenshot tg = (TakesScreenshot) driver;
        FileUtils.copyFile(tg.getScreenshotAs(OutputType.FILE),new File(System.getProperty("user.dir")+"\\src\\test\\screenshots\\name1.png" ));
    }
}
