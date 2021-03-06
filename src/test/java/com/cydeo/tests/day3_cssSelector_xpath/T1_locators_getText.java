package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");



        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement inputUserName= driver.findElement(By.className("login-inp"));

        inputUserName.sendKeys("incorrect");

        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");


        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //VERIFY ERROR MESSAGE AS ITS EXPECTED

        WebElement errorMessagge = driver.findElement(By.className("errortext"));

        String expectedErrorMessage= "Incorrect login or password";
        String actualErrorMessagge= errorMessagge.getText();

        if(expectedErrorMessage.equals(actualErrorMessagge)){
            System.out.println("Erro Message Verification PASSED");
        }else{
            System.out.println("Erro Message Verification FAILED");
        }

    }
}
