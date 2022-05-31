package com.cydeo.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName

    public static String returnOrderDate(WebDriver driver, String customerName){
        driver.get("https://practice.cydeo.com/web-tables");
        String xpath = "//td[.='" + customerName + "']//following-sibling::td[3]";
        WebElement orderDateCell = driver.findElement(By.xpath(xpath));

        return orderDateCell.getText();
    }

    //This method should accept a costumerName and return the costumer order date
    //as a String.

    //Name: orderVerify ()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //• Arg3: String expectedOrderDate

    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){
        driver.get("https://practice.cydeo.com/web-tables");
        String xpath = "//td[.='" + customerName + "']//following-sibling::td[3]";
        WebElement orderDateCell = driver.findElement(By.xpath(xpath));

        Assert.assertEquals(orderDateCell.getText(), expectedOrderDate);

    }

    //This method should accept above mentioned arguments and internally assert
    //expectedOrderDate matching actualOrderDate.
    //


}
