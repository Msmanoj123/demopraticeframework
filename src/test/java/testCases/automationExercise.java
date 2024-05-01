package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import reUsableComponent.genericMethods;
import reUsableComponent.propertiesFileSetup;

import java.io.IOException;
import java.util.Properties;

public class automationExercise extends reportLog {
    public WebDriver driver;
    public pomClass pom;
    String email;
    String pwd;
    public SoftAssert soft = new SoftAssert();
    Properties prop = propertiesFileSetup.propertiesFile();

    public automationExercise() throws IOException {
    }

    @Test(enabled = true)
    public void testCase_1() throws IOException {
        driver = reUsableComponent.genericMethods.launchBrowser();
        pom = new pomClass(driver);
        genericMethods.navigateUrl("loginUrl");
        reportLog.logging(getClass().getName(), pom.findingElements("css", ".logo.pull-left").isDisplayed());
        pom.findingElements("xpath", "//a[@href='/login']").click();
        pom.findingElements("css", ".signup-form>h2").isDisplayed();
        pom.findingElements("css", ".signup-form>form>input:nth-child(2)").sendKeys(requiredMethods.randomPasswordGeneration());
        email = requiredMethods.randomEmailGeneration();
        pom.findingElements("css", ".signup-form>form>input:nth-child(3)").sendKeys(email);
        pom.findingElements("css", ".signup-form>form>button").click();
        pom.findingElements("id", "uniform-id_gender1").click();
        pwd = requiredMethods.randomPasswordGeneration();
        pom.findingElements("css", "#password").sendKeys(pwd);
        reUsableComponent.genericMethods.staticDropdown(pom.findingElements("css", "#days"), "select", "1");
        reUsableComponent.genericMethods.staticDropdown(pom.findingElements("css", "#months"), "select", 7);
        reUsableComponent.genericMethods.staticDropdown(pom.findingElements("css", "#years"), "select", "1999");
        pom.findingElements("css", "#newsletter").click();
        pom.findingElements("css", "#first_name").sendKeys(prop.getProperty("userName"));
        pom.findingElements("css", "#last_name").sendKeys(prop.getProperty("lastName"));
        pom.findingElements("css", "#address1").sendKeys(prop.getProperty("address"));
        reUsableComponent.genericMethods.staticDropdown(pom.findingElements("css", "#country"), "select", "India");
        pom.findingElements("css", "#state").sendKeys(prop.getProperty("state"));
        pom.findingElements("css", "#city").sendKeys(prop.getProperty("city"));
        pom.findingElements("css", "#zipcode").sendKeys(prop.getProperty("zipcode"));
        pom.findingElements("css", "#mobile_number").sendKeys(prop.getProperty("mobile_number"));
        pom.findingElements("xpath", "//button[.='Create Account']").click();
        reportLog.logging(getClass().getName(), pom.findingElements("css", ".title.text-center>b").getText().equals("ACCOUNT CREATED!"));
        Assert.assertEquals(true, pom.findingElements("css", ".title.text-center>b").getText().equalsIgnoreCase("ACCOUNT CREATED!"));
        reUsableComponent.genericMethods.tearDown("tabs");
    }

    @Test
    public void testcas_2() throws IOException {
        driver = reUsableComponent.genericMethods.launchBrowser();
        pom = new pomClass(driver);
        genericMethods.navigateUrl("loginUrl");
        reportLog.logging(getClass().getName(), pom.findingElements("xpath", "//h2[.='Login to your account']").isDisplayed());
        pom.findingElements("css", ".login-form>form>input:nth-child(2)").sendKeys(email);
        pom.findingElements("css", ".login-form>form>input:nth-child(3)").sendKeys(pwd);
        pom.findingElements("css", ".login-form>form>button").click();
        reportLog.logging(getClass().getName(), pom.findingElements("css", ".nav.navbar-nav>li:nth-child(10)").getText().contains("Tester"));
        pom.findingElements("css", ".nav.navbar-nav>li:nth-child(5)").click();
        reportLog.logging(getClass().getName(), pom.findingElements("css", ".title.text-center>b").getText().contains("ACCOUNT DELETED!"));
        reUsableComponent.genericMethods.tearDown("tabs");
    }

    @Test
    public void testcase_3() throws IOException {
        driver = reUsableComponent.genericMethods.launchBrowser();
        pom = new pomClass(driver);
        genericMethods.navigateUrl("loginUrl");
        pom.findingElements("css", ".nav.navbar-nav>li:nth-child(8)>a").click();
        reportLog.logging(getClass().getName(), pom.findingElements("css", ".contact-form>h2").getText().equalsIgnoreCase("GET IN TOUCH"));
        pom.findingElements("css", "input[name='name']").sendKeys(prop.getProperty("Name"));
        pom.findingElements("css", "input[name='email']").sendKeys(prop.getProperty("Email"));
        pom.findingElements("css", "input[name='subject']").sendKeys(prop.getProperty("Subject"));
        pom.findingElements("css", "#message").sendKeys(prop.getProperty("Message"));
        pom.findingElements("css", "input[name='submit']").sendKeys(prop.getProperty("Path"));
        driver.switchTo().alert().accept();
        reportLog.logging(getClass().getName(), pom.findingElements("css", ".status.alert.alert-success").getText().contains("Success"));
        pom.findingElements("css", ".nav.navbar-nav>li:nth-child(1)>a").click();
        soft.assertEquals(driver.getCurrentUrl(), prop.getProperty("HomeUrl"));
        reUsableComponent.genericMethods.tearDown("tabs");
    }

    @Test
    public void testcase_4() throws IOException {
        driver = reUsableComponent.genericMethods.launchBrowser();
        pom = new pomClass(driver);
        genericMethods.navigateUrl("loginUrl");
        pom.findingElements("css", ".nav.navbar-nav>li:nth-child(2)>a").click();
        soft.assertEquals(pom.findingElements("css", ".title.text-center").getText(), "ALL PRODUCTS");
        pom.findingElements("css", "a[href='/product_details/1']").click();
        reportLog.logging(getClass().getName(), driver.getCurrentUrl().contains("product_details"));
        soft.assertEquals(pom.findingElements("css", ".product-information>h2").getText(), "Blue Top");
        System.out.println(pom.findingElements("xpath", "(//div[@class='product-information']/p)[1]").getText());
        System.out.println(pom.findingElements("xpah", "(//div[@class='product-information']/p)[2]").getText());
        reUsableComponent.genericMethods.tearDown("tabs");
    }

    @Test
    public void testcase_5() throws IOException {
        driver = reUsableComponent.genericMethods.launchBrowser();
        pom = new pomClass(driver);
        genericMethods.navigateUrl("loginUrl");
        pom.findingElements("css", ".nav.navbar-nav>li:nth-child(1)").click();
        soft.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/");
        reUsableComponent.genericMethods.javaScriptExecutor(driver).executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
        reportLog.logging(getClass().getName(), pom.findingElements("css", ".single-widget>h2").getText().equalsIgnoreCase("SUBSCRIPTION"));
        pom.findingElements("css", ".single-widget>form>#susbscribe_email").sendKeys(prop.getProperty("UN"));
        pom.findingElements("css", ".single-widget>form>button").click();
        reportLog.logging("checking the alert message", pom.findingElements("css", ".alert-success.alert").isDisplayed());
        reUsableComponent.genericMethods.tearDown("tabs");
    }

    @Test
    public void testcase_6() throws IOException {
        driver = reUsableComponent.genericMethods.launchBrowser();
        pom = new pomClass(driver);
        genericMethods.navigateUrl("loginUrl");
        pom.findingElements("css", ".nav.navbar-nav>li:nth-child(3)").click();
        reUsableComponent.genericMethods.javaScriptExecutor(driver).executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
        reportLog.logging(getClass().getName(), pom.findingElements("css", ".single-widget>h2").getText().equalsIgnoreCase("SUBSCRIPTION"));
        pom.findingElements("css", ".single-widget>form>#susbscribe_email").sendKeys(prop.getProperty("UN"));
        pom.findingElements("css", ".single-widget>form>button").click();
        reportLog.logging("checking the alert message", pom.findingElements("css", ".alert-success.alert").isDisplayed());
        reUsableComponent.genericMethods.tearDown("tabs");
    }

    @Test
    public void testcase_7() throws IOException {
        driver = reUsableComponent.genericMethods.launchBrowser();
        pom = new pomClass(driver);
        genericMethods.navigateUrl("loginUrl");
        pom.findingElements("css", ".nav.navbar-nav>li:nth-child(1)").click();
        soft.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/");
        pom.findingElements("css", ".nav.navbar-nav>li:nth-child(2)").click();
        reUsableComponent.genericMethods.mouseActions(driver).moveToElement(pom.findingElements("css", "img[src='/get_product_picture/1']")).build().perform();
        reUsableComponent.genericMethods.mouseActions(driver).click(pom.findingElements("css", ".product-overlay>div>a[data-product-id='1']")).build().perform();
        pom.findingElements("css", ".btn.btn-success.close-modal.btn-block").click();
        reUsableComponent.genericMethods.mouseActions(driver).moveToElement(pom.findingElements("css", "img[src='/get_product_picture/2']")).build().perform();
        reUsableComponent.genericMethods.mouseActions(driver).click(pom.findingElements("css", ".product-overlay>div>a[data-product-id='2']")).build().perform();
        pom.findingElements("xpath", "(//a[@href='/view_cart'])[2]").click();
        soft.assertEquals(driver.findElements(By.xpath("//tbody/tr")).size(), 2);
        genericMethods.tearDown("tabs");
    }

    @Test
    public void testcase_8() throws IOException {
        driver = reUsableComponent.genericMethods.launchBrowser();
        pom = new pomClass(driver);
        genericMethods.navigateUrl("loginUrl");
        pom.findingElements("css", ".nav.navbar-nav>li:nth-child(1)").click();
        soft.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/");
        reUsableComponent.genericMethods.javaScriptExecutor(driver).executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
        reportLog.logging(getClass().getName(), pom.findingElements("css", ".single-widget>h2").getText().equalsIgnoreCase("SUBSCRIPTION"));
        pom.findingElements("css", "#scrollUp").click();
        reportLog.logging("verifyScrollUpVisibility", pom.findingElements("xpath", "//h2[.='Full-Fledged practice website for Automation Engineers']").isDisplayed());
        genericMethods.tearDown("tabs");
    }

    @Test
    public void testcase_9() throws IOException {
        driver = reUsableComponent.genericMethods.launchBrowser();
        pom = new pomClass(driver);
        genericMethods.navigateUrl("loginUrl");
        pom.findingElements("css", ".nav.navbar-nav>li:nth-child(1)").click();
        soft.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/");
        reUsableComponent.genericMethods.javaScriptExecutor(driver).executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
        reportLog.logging(getClass().getName(), pom.findingElements("css", ".single-widget>h2").getText().equalsIgnoreCase("SUBSCRIPTION"));
        reUsableComponent.genericMethods.javaScriptExecutor(driver).executeScript("window.scrollTo(0,0)", "");
        reportLog.logging("verifyScrollUpVisibility", pom.findingElements("xpath", "//h2[.='Full-Fledged practice website for Automation Engineers']").isDisplayed());
        genericMethods.tearDown("tabs");
    }

    @Test
    public void testcase_10() throws IOException {
        driver = genericMethods.launchBrowser();
        pom = new pomClass(driver);
        genericMethods.navigateUrl("HomeUrl");
        WebElement element = pom.findingElements("css", ".recommended_items>h2");
        genericMethods.javaScriptExecutor(driver).executeScript("arguments[0].scrollIntoView(true);",element);
        soft.assertEquals("RECOMMENDED ITEMS",element.getText());
        genericMethods.tearDown("tabs");
    }
    @Test
    public void testcase_11() throws IOException {
        driver = genericMethods.launchBrowser();
        pom = new pomClass(driver);
        genericMethods.navigateUrl("HomeUrl");
    }
}
