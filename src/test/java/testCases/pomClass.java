package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class pomClass {

    public static WebDriver driver;
    public pomClass(WebDriver driver1) {
        driver=driver1;
    }

    public WebElement findingElements(String locatorName, String locator) throws IOException {
        switch (locatorName) {
            case "xpath":
                return driver.findElement(By.xpath(locator));
            case "css":
                return driver.findElement(By.cssSelector(locator));
            case "id":
                return driver.findElement(By.id(locator));
            case "classname":
                return driver.findElement(By.className(locator));
            case "linktext":
                return driver.findElement(By.linkText(locator));
            case "partiallinktext":
                return driver.findElement(By.partialLinkText(locator));
            default:
                throw new RuntimeException("Provide valid locatorname");
        }
    }
}
