package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void seleniumTest(){
        //Create browser driver setup
        //Open the browser, get google

        driver.get("https://www.google.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google1223";

        Assert.assertEquals(driver.getTitle(), "Google", "Title is not matching");



    }
}
