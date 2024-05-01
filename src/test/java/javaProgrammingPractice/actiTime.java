package javaProgrammingPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class actiTime {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/men-tshirts");
        driver.findElement(By.xpath("//h4[.='Solid Round Neck T-shirt']")).click();
        String parent = driver.getWindowHandle();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        while(it.hasNext())
        {
            String child = it.next();
            if(child!=parent)
            {
                driver.switchTo().window(child);
            }
        }
        Assert.assertEquals(driver.findElement(By.cssSelector(".pdp-title")).getText(),"Roadster");
        driver.quit();
    }
}
