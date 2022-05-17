package com.cydeo.reviewWithOscar.week02;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    public static void main(String[] args) {
        // Verify confirmation message
        //        open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //        go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        //        enter any email
        WebElement emailInputButton= driver.findElement(By.cssSelector("input[name='email']"));
        emailInputButton.sendKeys("zeynep@gmail.com");
       String expectedDisplay = "zeynep@gmail.com";
       String actualDisplay =emailInputButton.getAttribute("value");
        //        verify that email is displayed in the input box
        if(actualDisplay.equals(expectedDisplay)){
            System.out.println("email verification passed");
        }else{
            System.out.println("email verification failed");
        }
        //        click on Retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button[id='form_submit']"));
        retrievePasswordButton.click();
        //        verify that confirmation message says 'Your e-mail's been sent!'

        String actualConfirmationMesagge= driver.findElement(By.xpath("//h4[@name='confirmation_message']")).getText();
        String expectedConfirmationMesagge= "Your e-mail's been sent!";

        if(actualDisplay.equals(expectedDisplay)){
            System.out.println("confirmation mesagge VERIFIED");
        }else{
            System.out.println("verification FAILED");
        }

    }
}
