package testCases;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.IOException;

public class reportLog  {
  public static ExtentReports report;
  public static WebDriver driver;

  @BeforeTest
    public static void reportSetup() throws IOException {
      System.out.println("hi im report");
         report = new ExtentReports(System.getProperty("user.dir") + "\\extentReports\\"+reUsableComponent.propertiesFileSetup.propertiesFile().getProperty("reportName"));
    }
    public static void logging(String testCaseName,boolean value) throws IOException {
      ExtentTest test = report.startTest(testCaseName);
      if(value)
      {
        test.log(LogStatus.PASS,"conditions is satisfied");
      }
      else
      {
        test.log(LogStatus.FAIL,"condition is not satisfied");
        reUsableComponent.genericMethods.screenShot("error"+System.currentTimeMillis()+".png");
      }
    }
    @AfterTest
    public static void reportTeardown()
    {
      report.close();
    }
}
