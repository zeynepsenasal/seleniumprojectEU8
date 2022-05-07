package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttirbute {
    public static void main(String[] args) {
      //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        //  Expected: Registration form
        WebElement headerText =driver.findElement(By.tagName("h2"));
        String expectedText = "Registration form";
        String actuaHeaderText = headerText.getText();

        if(actuaHeaderText.equals(expectedText)){
            System.out.println("Header Text Verification PASSED");
        }else{
            System.out.println("Header Text Verification FAILED");
        }

        //4- Locate “First name” input box
        WebElement firstNameInput = driver.findElement(By.name("firstname"));

        String expectedPlaceHolder= "first name";
        String actualPlaceholder = firstNameInput.getAttribute("placeholder");

        if(expectedPlaceHolder.equals(actualPlaceholder)){
            System.out.println("Placeholder verification PASSED");
        }else{
            System.out.println("Placeholder verification PASSED");
        }

        driver.close();



    }

}
/*
TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
  Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
  Expected: first name
 */