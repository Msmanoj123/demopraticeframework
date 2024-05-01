package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reUsableComponent.genericMethods;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class indianEconomic {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
        driver = genericMethods.launchBrowser();
        pomClass pom = new pomClass(driver);
        genericMethods.navigateUrl("economicUrl");
        genericMethods.javaScriptExecutor(driver).executeScript("arguments[0].click();", pom.findingElements("xpath", "//a[.='Cryptocurrency']"));
        genericMethods.windowHandling(driver);
        Map<String,String> map = new HashMap<>();
        for (int i = 1; i <= driver.findElements(By.xpath("//div[@class='content tabsContent']//ul//li//table//tbody//tr//td[1]")).size(); i++) {
            String key = driver.findElement(By.xpath("//div[@class='content tabsContent']//ul//li//table//tbody//tr[" + i + "]//td[1]")).getText();
            String value = driver.findElement(By.xpath("//div[@class='content tabsContent']//ul//li//table//tbody//tr[ " + i + "]//td[2]")).getText();
            map.put(key,value);
        }
        for (Map.Entry<String,String> m:map.entrySet())
        {
            System.out.println(m.getKey()+"         "+m.getValue());
        }
    }
}
