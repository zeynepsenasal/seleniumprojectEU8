package com.cydeo.tests.day4_findElements_checboxes_radio;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceException {
    public static void main(String[] args) {
        //TC #6: StaleElementReferenceException Task
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest ");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink= driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
        //4- Refresh the page.
        driver.navigate().refresh();
        //5- Verify it is displayed, again.

        // We are refreshing the the web element reference by re-assigning(re-locating) the web element
        cydeoLink= driver.findElement(By.xpath("//a[text()='CYDEO']"));

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


        //This is a simple StaleElementReferenceException to understand what is
        //this exception and how to handle it.
    }
}
