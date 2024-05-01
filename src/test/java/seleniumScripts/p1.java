package seleniumScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class p1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.findElement(By.xpath("(//a[@href='https://www.irctc.co.in/online-charts/'])[1]")).click();
        String parent = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        while (it.hasNext()) {
            String child = it.next();
            if (windows.size() == 5) {
                driver.switchTo().window(child);
            }
        }
        System.out.println(driver.findElement(By.xpath("//h6[.='RESERVATION CHART']")).getText());
    }
}
