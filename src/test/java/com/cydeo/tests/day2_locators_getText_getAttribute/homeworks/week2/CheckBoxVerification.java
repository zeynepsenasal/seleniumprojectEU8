package com.cydeo.tests.day2_locators_getText_getAttribute.homeworks.week2;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxVerification {
    public static void main(String[] args) {
        //1.    Go to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        //2.    Login with-----Username: Tester, password: test
        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));

        usernameInput.sendKeys("Tester");
        passwordInput.sendKeys("test");

        WebElement logInButton = driver.findElement(By.xpath("//input[@value='Login']"));
        logInButton.click();

        //3.    Click on check all button verify all the checkboxes are checked
        WebElement checkAllButton = driver.findElement(By.xpath("//a[.='Check All']"));
        checkAllButton.click();

        List<WebElement> checkboxes = driver.findElements(By.tagName("input"));

        boolean checkboxesAreSelected=false;

        for (WebElement checkbox : checkboxes) {
            if(checkbox.isSelected()) {
                checkboxesAreSelected = true;
            }
        }

        System.out.println("checkboxesAreSelected = " + checkboxesAreSelected);


        //4.    Click on uncheck all button verify that all the checkboxes are unchecked
        WebElement unCheckAllButton = driver.findElement(By.xpath("//a[.='Uncheck All']"));
        unCheckAllButton.click();

        checkboxes = driver.findElements(By.tagName("input"));
        boolean checkboxesAreNOTselected = false;
        for (WebElement checkbox : checkboxes) {
            if(!checkbox.isSelected()){
                checkboxesAreNOTselected=true;
            }else{
                checkboxesAreNOTselected=false;
            }
        }
        System.out.println("checkboxesAreNOTselected = " + checkboxesAreNOTselected);



    }
}
