package com.cydeo.tests.day9_javafaker_testbase_driver;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task2 {


    //5-Verify that all 10 suggesstions contain your search term
    //Optional:
    //6-Verify the same steps with the search term "java" (here you need to make your code dynamic)
    //Optional 2:
    //Follow the same steps for each of the browser types with same steps. Here, you will make your code more dynamic.
    //You will do the same test for each of the browser types but you will use the same code only.
   @Test
    public void amazon_task(){

       //1-Open the browser
       //2-Navigate to https://www.amazon.com/
       Driver.getDriver().get("https://www.amazon.com/");

       //3-Write "selenium" in the search box

       WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

       searchBox.sendKeys("selenium");

       //4-Verify that you see 10 suggesstions as dropdown
       Select select = new Select(Driver.getDriver().findElement(By.xpath("//div[@class='s-suggestion-container']")));

       List<WebElement> list = select.getOptions();

       Assert.assertTrue(list.size()==10, "Actual size:");

   }
}
