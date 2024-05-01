package seleniumScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class IRCTC {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(1));
        driver.findElement(By.xpath("(//label[ @class='search_btn' and .='CHARTS / VACANCY'])[1]")).click();
        String parent = driver.getWindowHandle();
        Set<String> allwindow = driver.getWindowHandles();
        Iterator<String> it = allwindow.iterator();
        while (it.hasNext())
        {
            String child = it.next();
            if(child!=parent)
            {
                driver.switchTo().window(child);
            }
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='jss466 jss451 jss471']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='jss511 jss600 jss597']"))).click();

//        driver.findElement(By.xpath("//button[@class='jss511 jss600 jss597']")).click();
//        driver.findElement(By.xpath("//button[@class='jss511 jss600 jss613 jss616' and @tabindex='0']")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='jss511 jss600 jss613 jss616' and @tabindex='0']"))).click();
    }
}
