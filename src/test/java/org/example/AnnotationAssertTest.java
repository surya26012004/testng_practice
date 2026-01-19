package org.example;

//import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AnnotationAssertTest {
    private static WebDriver driver;

    @BeforeClass()
    public void createDriver() {
        // Code to initialize WebDriver
        driver=new ChromeDriver();
    }

//    @Given("User is on Amazon homepage")
    @Test(priority = 1)
    public void openAmazon() {
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        System.out.println("The Webpage is opened");
    }
    @Test(priority = 1)
    //searching items
    public void searchItem() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook laptop", Keys.ENTER);
        System.out.println("The item is searched");
    }
    @AfterClass
    public void closeBrowser() {
        driver.quit();
        System.out.println("The browser is closed");
    }
}

