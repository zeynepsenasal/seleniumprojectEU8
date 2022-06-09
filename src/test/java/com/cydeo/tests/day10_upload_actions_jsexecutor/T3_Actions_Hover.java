package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {
    @Test
    public void hovering_test(){
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers ");
        //2. Hover over to first image
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement user1= Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2= Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3= Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        //2. Hover over to first image
        Actions actions = new Actions(Driver.getDriver());

        BrowserUtils.sleep(2);
        actions.moveToElement(img1).perform();

        //3. Assert “name: user1” is displayed and “view profile” is displayed
        Assert.assertTrue(user1.isDisplayed());



        //4. Hover over to second image
        BrowserUtils.sleep(2);
        actions.moveToElement(img2).perform();

        //3. Assert “name: user2” is displayed and “view profile” is displayed
        Assert.assertTrue(user2.isDisplayed());

        //6. Hover over to third image
        BrowserUtils.sleep(2);
        actions.moveToElement(img3).perform();

        //3. Assert “name: user3” is displayed and “view profile” is displayed
        Assert.assertTrue(user3.isDisplayed());

    }
}
