package com.cydeo.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    public static void crm_login(WebDriver driver){
        //enter valid username and password
        WebElement inputUsername= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

        WebElement inputPassword= driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));

        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        inputPassword.sendKeys("UserUser");

        //click login button
        logInButton.click();
    }
    public static void crm_login(WebDriver driver, String username, String password){
        //enter valid username and password
        WebElement inputUsername= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

        WebElement inputPassword= driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));

        inputUsername.sendKeys(username);

        inputPassword.sendKeys(password);

        //click login button
        logInButton.click();
    }
}
