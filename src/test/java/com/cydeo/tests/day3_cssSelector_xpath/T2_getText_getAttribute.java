package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel="Remember me on this computer";
        String actualRememberMeLabel =rememberMeLabel.getText();

        if(actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification PASSED");
        }else{
            System.out.println("Label verification FAILED");
        }


        //Verify forgot password link text

        WebElement forgotPasswordLink= driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLink= "Forgot your password?";
        String actualForgotPasswordLink= forgotPasswordLink.getText();

        if(actualForgotPasswordLink.equals(expectedForgotPasswordLink)){
            System.out.println("Forgot your password link verification PASSED");
        }else{
            System.out.println("actualForgotPasswordLink = " + actualForgotPasswordLink);
            System.out.println("expectedForgotPasswordLink = " + expectedForgotPasswordLink);
            System.out.println("Forgot your password link verification FAILED");
        }

        // VERIFY "FORGOT PASSWORD" HREF ATTRIBUTE'S VALUE




    }
}
