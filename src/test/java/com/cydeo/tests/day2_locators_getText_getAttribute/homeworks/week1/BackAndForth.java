package com.cydeo.tests.day2_locators_getText_getAttribute.homeworks.week1;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BackAndForth {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://google.com
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        WebElement gmailButton = driver.findElement(By.className("gb_d"));
        gmailButton.click();
        //4- Verify title contains://Expected: Gmail

        String expectedTitle = "Gmail";
        String actualTitle= driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("GMAIL Title Verification PASSED");
        }else{
            System.out.println("GMAIL Title Verification FAILED");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google

        String expectedTitle2 = "Google";
        String actualTitle2= driver.getTitle();

        if(actualTitle2.equals(expectedTitle2)){
            System.out.println("GOOGLE Title Verification PASSED");
        }else{
            System.out.println("GOOGLE Title Verification FAILED");
        }

    }
}
