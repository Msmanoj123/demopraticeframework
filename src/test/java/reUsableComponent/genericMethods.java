package reUsableComponent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class genericMethods {
public static WebDriver driver;

    public static WebDriver launchBrowser() throws IOException {

        if(propertiesFileSetup.propertiesFile().getProperty("browser").equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
             return driver;
        } else if (propertiesFileSetup.propertiesFile().getProperty("browser").equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            return driver;
        } else if (propertiesFileSetup.propertiesFile().getProperty("browser").equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            return driver;
        }
        else
        {
            throw new RuntimeException("Enter valid driver name");
        }
    }

    public static void screenShot(String imageName) throws IOException {
        if(driver!=null & imageName!=null)
        {
            FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir") + "\\src\\test\\screenshots\\" + imageName));
        }
        else if (driver==null || imageName==null)
        {
            throw new RuntimeException("driver is null Please provide valid driver");
        }
    }

    public static JavascriptExecutor javaScriptExecutor(WebDriver driver)
    {
        if(driver!=null)
        {
            return ((JavascriptExecutor)driver);
        }
        else
        {
            throw new RuntimeException("driver is null");
        }
    }

    public static void tearDown(String userInput)
    {
        if(userInput.contains("tabs"))
        {
            driver.quit();
        }
        else if (userInput.contains("tab"))
        {
        driver.close();
        }
    }

    public static Actions mouseActions(WebDriver driver)
    {
        Actions actions = new Actions(driver);
        return actions;
    }
    public static void staticDropdown(WebElement element,String operation,Object obj)
    {
        Select select = new Select(element);
        if(operation.contains("select")) {
            if (obj instanceof Integer) {
                select.selectByIndex((Integer) obj);
            } else if (obj instanceof String) {
                select.selectByVisibleText((String) obj);
            } else {
                throw new RuntimeException("give proper instruction");
            }
        }
        else
        {
            if (obj instanceof Integer) {
                select.deselectByIndex((Integer) obj);
            } else if (obj instanceof String) {
                select.deselectByVisibleText((String) obj);
            } else {
                throw new RuntimeException("give proper instruction");
            }
        }
    }

    public static void navigateUrl(String url) throws IOException {
        driver.get(propertiesFileSetup.propertiesFile().getProperty(url));
        driver.manage().window().maximize();
    }
    public static void windowHandling(WebDriver driver)
    {
        String parent = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        while (iterator.hasNext())
        {
            String child = iterator.next();
            if (child.equals(parent))
            {
                driver.switchTo().window(child);
            }
        }
    }
}
