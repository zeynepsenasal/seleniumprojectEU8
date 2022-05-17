package com.cydeo.reviewWithOscar.Avengers;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
    WebDriver driver; // Declare your variable global
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome"); // initialize your variable
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test1() {
        driver.get("http://automationexercise.com");

        // Verify that home page is visible successfully : What they mean? --> Verify that you have Hope Page URL and Title, another option verify that test cases button is displayed
        String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();
        // verify Title
        Assert.assertEquals(actualTitle, expectedTitle, "Home Page is NOT displayed");

        driver.findElement(By.partialLinkText("Signup")).click();
        String name = "zeyno";
        String email = "zeyno@gmail.com";

        WebElement newUser = driver.findElement(By.xpath("//h2[.='New User Signup!']"));
        Assert.assertTrue(newUser.isDisplayed());

        WebElement nameBox = driver.findElement(By.xpath("//input[@name='name']"));
        WebElement emailBox = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));

        nameBox.sendKeys(name);
        emailBox.sendKeys(email);

        WebElement signUpButton = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
        signUpButton.click();

    }

    }

