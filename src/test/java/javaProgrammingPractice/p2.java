package javaProgrammingPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class p2 {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://easyupload.io/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.cssSelector(".dz-default.dz-message"));
        String filePath="C:\\Users\\manoj.ms\\eclipse\\Selenium\\src\\test\\java\\javaProgrammingPractice\\dummy.png";


        // Click on the element to open the file dialog
        element.click();

        // Create a StringSelection object with the file path
        StringSelection stringSelection = new StringSelection(filePath);

        // Copy the file path to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Create an instance of Robot class
        Robot robot = new Robot();
        Thread.sleep(1000);

        // Simulate Ctrl + V to paste the file path into the file dialog
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press Enter to confirm the file upload
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Optionally, you can add some delay or wait for the file to upload
        // Perform other actions after file upload if needed

    }
}
