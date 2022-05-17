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

public class T1_alertPractices {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void alert_test1(){
        driver.get("http://practice.cydeo.com/javascript_alerts");
        WebElement informationAllertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAllertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //In the assertTrue method, the mesagge is shown in case of the FAIL
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed");

        String expectedMessage="You successfully clicked an alert";
        String actualMessage= resultText.getText();

        Assert.assertEquals(actualMessage, expectedMessage, "Mesagge is not as expected");

    }

}
//Open browser
//2. Go to website: http://practice.cydeo.com/javascript_alerts
//3. Click to “Click for JS Alert” button
//4. Click to OK button from the alert
//5. Verify “You successfully clicked an alert” text is displayed.
