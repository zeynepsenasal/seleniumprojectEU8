package com.cydeo.tests.day4_findElements_checboxes_radio;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_FindElements {
    public static void main(String[] args) {


        //TC #4: FindElements Task
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //PROVIDING EXTRA WAIT TIME FOR OUR DRIVER BEFORE IT THROWS NOSUCHELEMENT EXCEPTION
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
        //3- Locate all the links in the page.
        // shortcut : windows= alt+enter mac=option+enter
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());

        //5- Print out the texts of the links.
        for (WebElement each : allLinks) {
            System.out.println("Text of link: " + each.getText());
            System.out.println("HREF Values: " + each.getAttribute("href"));
        }
        //6- Print out the HREF attribute values of the links




    }
}