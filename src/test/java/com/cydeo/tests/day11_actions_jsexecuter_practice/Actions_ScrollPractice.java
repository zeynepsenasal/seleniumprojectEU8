package com.cydeo.tests.day11_actions_jsexecuter_practice;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_ScrollPractice {
    @Test
    public void scroll_test(){
        //TC #4: Scroll practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”

        Actions actions= new Actions(Driver.getDriver());

        WebElement poweredByCydeo= Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));

        //4- Scroll using Actions class “moveTo(element)” method

        BrowserUtils.sleep(1);
        actions.moveToElement(poweredByCydeo).perform();


        //2- Scroll back up to “Home” link using PageUP button

        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();


    }
}
