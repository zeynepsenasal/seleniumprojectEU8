package com.cydeo.tests.day8_properties_config_reader;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTitleOrderVerify {
WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void order_name_verify_test(){
        //Locate the cell that has Bob Martin in it
        WebElement BobMartinCell = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody//tr[7]//td[.='Bob Martin']"));

        String expectedBobText= "Bob Martin";
        String actualBobName = BobMartinCell.getText();

        Assert.assertEquals(actualBobName,expectedBobText);

        // verify oder date

        WebElement bobsOrderDate = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody//tr[7]//td[.='Bob Martin']/following-sibling::td[3]"));

        String expectedBobOrderDate = "12/31/2021";
        String actualBobOrderDate= bobsOrderDate.getText();

        Assert.assertEquals(actualBobOrderDate,expectedBobOrderDate);


    }

}
