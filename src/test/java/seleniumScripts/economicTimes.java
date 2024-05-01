package seleniumScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class economicTimes {
    public static void main(String[] args) throws WebDriverException, IOException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://economictimes.indiatimes.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(By.xpath("(//td[@class='stockValue'])"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        //js.executeScript("window.scrollBy(0,4000)","");
        Set<Object> s = new TreeSet<Object>();
        List<Double> l = new ArrayList<Double>();
        int arr[]=new int[10];
        for(int i=1;i<5;i++)
        {
            System.out.println(driver.findElement(By.xpath("(//td[@class='stockValue'])["+i+"]")).getText());
            String value = driver.findElement(By.xpath("(//td[@class='stockValue'])["+i+"]")).getText();
            s.add(Double.parseDouble(value));
            l.add(Double.parseDouble(value));
            arr[i]=(int) Double.parseDouble(value);
        }
        System.out.println("After sorting");
        for(Object k :s)
        {
            System.out.println(k);
        }
        System.out.println("before sorting of list");
        for(double k :l)
        {
            System.out.println(k);
        }
        System.out.println("After sorting of list");
        Collections.sort(l);
        for(double k:l)
        {
            System.out.println(k);
        }
        System.out.println("arrayy before sort");
        for(int k:arr)
        {
            System.out.println(k);
        }
        System.out.println("arrayy after sort");
        Arrays.sort(arr);
        for(int k:arr)
        {
            System.out.println(k);
        }
        WebElement element1 = driver.findElement(By.xpath("	//img[@src='https://economictimes.indiatimes.com/thumb/width-320,height-240,resizemode-8,imgsize-112392,msid-104945394/indias-most-generous-women-who-donated-rs-261-crore-in-a-year.jpg']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element1);
        FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("target//image.png"));
        driver.quit();
    }
}
