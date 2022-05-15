package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_simpleDropDowns {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }
    //TC#4: Verifying “Simple dropdown” and “State selection” dropdown

    @Test
    public void simpleDropDownTest(){
        //            3. Verify “Simple dropdown” default selected value is correct
        Select simpleDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

      WebElement currentlySelectedOption= simpleDropDown.getFirstSelectedOption();

      String actualSDText =currentlySelectedOption.getText();

        //    Expected: “Please select an option”
        String expectedSDText = "Please select an option";

        Assert.assertEquals(actualSDText,expectedSDText);

        //            4. Verify “State selection” default selected value is correct
        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedStateDropDownText = "Select a State";
        String actualStateDropDownText= stateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualStateDropDownText,expectedStateDropDownText);




        //    Expected: “
        //    Select a State”

    }


    //    default values

}
