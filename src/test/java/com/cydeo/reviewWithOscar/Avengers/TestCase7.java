package com.cydeo.reviewWithOscar.Avengers;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase7 {
    //. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationexercise.com");
    }

    @Test
    public void Test7(){
        //3. Verify that home page is visible successfully
        String expectedTitle= "Automation Exercise";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Home page is not visible");
        //4. Click on 'Test Cases' button
        WebElement testCaseButton= driver.findElement(By.xpath("(//button[.='Test Cases'])[1]"));
        testCaseButton.click();
        //5. Verify user is navigated to test cases page successfully

        String expectedURL = "https://automationexercise.com/test_cases";
        String actualURL= driver.getCurrentUrl();

        Assert.assertEquals(actualURL,expectedURL);

    }

}
