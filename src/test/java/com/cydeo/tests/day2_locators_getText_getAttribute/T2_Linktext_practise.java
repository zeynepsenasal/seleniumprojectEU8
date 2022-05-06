package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Linktext_practise {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

       //2- Go to: https://practice.cydeo.com
       driver.get("https://practice.cydeo.com");

       //3- Click to A/B Testing from top of the list.

      WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));

      abTestLink.click(); //more practicle


//4- Verify title is:
//  Expected: No A/B Test
        String expectedTitle= "No A/B Test";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification PASSED");
        }

      //  5- Go back to home page by using the .back();

        driver.navigate().back();

        String expectedTitle2= "Practice";
        String actualTitle2 = driver.getTitle();

        if(expectedTitle2.equals(actualTitle2)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification PASSED");
        }

        /*
        TC #2: Back and forth navigation

1- Open a chrome browser

3- Click to A/B Testing from top of the list.


6- Verify title equals:
  Expected: Practice
         */


    }

}
