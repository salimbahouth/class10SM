import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

public class Class10HomeWork {
    private static ChromeDriver  driver;
    private static NgWebDriver ngWebDriver;

    @BeforeClass
    public static void runOnceBeforeClass(){
        System.setProperty("webdriver.chrome.driver", "/Users/cupra/Desktop/chromedriver.exe");
        driver = new ChromeDriver();
        NgWebDriver ngWebDriver = new NgWebDriver(driver);
//        driver.get("https://dgotlieb.github.io/Selenium/synchronization.html");
    }

//    @Test
//    public static void test01_Show() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.id("btn")).click();
//        driver.findElement(By.id("message")).isDisplayed();

//        driver.findElement(By.id("hidden")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.id("finish1")).isDisplayed();

//        WebDriverWait wait = new WebDriverWait(driver,10);
//        driver.findElement(By.id("rendered")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish2")));
//        driver.findElement(By.id("finish2")).isDisplayed();
//        String txt = driver.findElement(By.id("finish2")).getText();
//        assertEquals(txt,"This is a new element");

//    }

//    @Test
//    public static void test02_NG()  {
//        driver.get("https://dgotlieb.github.io/AngularJS/main.html");
//        driver.findElement(ByAngular.model("firstName")).clear();
//        driver.findElement(ByAngular.model("firstName")).sendKeys("salim");
//        String assrt = driver.findElement(By.className("ng-binding")).getText();
//        assertEquals(assrt, "salim");
//
//    }

//    Q3
//    משתמשים ב PageLoadTimeOut כאשר נרצה להגדיר זמן מסויין לדף להיטען ואחרי הזמן התוכנית תזרוק exception


//    @Test
//    public static void test04_Tech()  {
//        driver.get("https://dgotlieb.github.io/WebCalculator/");
////        System.out.println(driver.findElement(By.id(Constants.LOCATOR7_ID)).getSize());
////        System.out.println(driver.findElement(By.id("six")).isDisplayed());
//
//
//        String num = driver.findElement(By.id("nine")).getText();
//        driver.findElement(By.id("six")).click();
//        driver.findElement(By.id("add")).click();
//        driver.findElement(By.id("three")).click();
//        driver.findElement(By.id("equal")).click();
//        assertEquals(num, "9");
//
//    }

    @Test
    public static void test05_Chalenge()  {
        driver.get("https://google.com/");
        driver.executeScript("window.open('https://youtube.com/', '_blank');");
        driver.executeScript("window.open('https://translate.google.com/', '_blank');");
        driver.switchTo().window("https://google.com/");
        driver.switchTo().window("https://youtube.com/");

    }


}
