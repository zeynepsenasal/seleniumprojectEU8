package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_AlertPractice {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }
    //TC #2: Confirmation alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts

    @Test
    public void alertVerification(){
        WebElement JSConfirmButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        JSConfirmButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultMesagge= driver.findElement(By.xpath("//p[@id='result']"));

        String actualMesagge= resultMesagge.getText();
        String expectedMesagge= "You clicked: Ok";

        System.out.println("actualMesagge = " + actualMesagge);
        System.out.println("expectedMesagge = " + expectedMesagge);

        Assert.assertEquals(actualMesagge,expectedMesagge, "The result mesagge is not as expected");

    }

    //3. Click to “Click for JS Confirm” button
    //4. Click to OK button from the alert
    //5. Verify “You clicked: Ok” text is displayed.
}
