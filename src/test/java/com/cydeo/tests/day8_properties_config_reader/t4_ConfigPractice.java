package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class t4_ConfigPractice {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        String browser = Configiration_Reader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }

    @Test
    public void google_search_test(){
        WebElement googleSearchBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

        googleSearchBox.sendKeys("apple" + Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Google Search

    }

}
