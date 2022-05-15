package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_DropdownTask {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown  ");
    }

    @Test
    public void dropDownSelectionTest(){
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
//3. Select Illinois
        stateDropdown.selectByValue("IL");
//4. Select Virginia
        stateDropdown.selectByVisibleText("Virginia");
//5. Select California
        stateDropdown.selectByIndex(5);
//6. Verify final selected option is California.
        String actualSelectedOption = stateDropdown.getFirstSelectedOption().getText();
        String expectedSelectedOption = "California";
        Assert.assertEquals(actualSelectedOption,expectedSelectedOption);
//Use all Select options. (visible text, value, index)



    }


}
//TC #5: Selecting state from State dropdown and verifying result
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
