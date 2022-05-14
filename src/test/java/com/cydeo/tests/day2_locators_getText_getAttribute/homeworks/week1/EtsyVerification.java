package com.cydeo.tests.day2_locators_getText_getAttribute.homeworks.week1;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EtsyVerification {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //1. Open Chrome browser
        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //3. Search for “wooden spoon”
        WebElement searchButton = driver.findElement(By.name("search_query"));
        searchButton.sendKeys("Wooden Spoon"+ Keys.ENTER);

        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        //4. Verify title:
        //Expected: “Wooden spoon | Etsy

        if(expectedTitle.equals(actualTitle))
        {
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
        }

    }
}
