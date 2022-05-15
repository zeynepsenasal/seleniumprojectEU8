package com.cydeo.homeworks.week03;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaleElementReferenceException extends Throwable {
    public static void main(String[] args) {
        //   //Test Case 2
        //        //1.    Go to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        //        //2.    Login with-----Username: Tester, password: test
        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));

        usernameInput.sendKeys("Tester");
        passwordInput.sendKeys("test");

        WebElement logInButton = driver.findElement(By.xpath("//input[@value='Login']"));
        logInButton.click();
        //        //3.    Select one of the checkbox and delete one person
        WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        WebElement deleteButton = driver.findElement(By.xpath("//input[@value='Delete Selected']"));
        deleteButton.click();
        //        //4.    Then verify that deleted item is no longer exists

        try{
            System.out.println("checkbox.isDisplayed() = " + checkbox.isDisplayed());
        }catch (org.openqa.selenium.StaleElementReferenceException e){
            System.out.println("Checkbox is no longer exsist");
        }



    }
}
