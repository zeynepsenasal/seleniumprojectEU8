package com.cydeo.homeworks.ReviewWeek;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegisterUser {
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
         driver= WebDriverFactory.getDriver("chrome");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("http://automationexercise.com");
    }

    @Test
    public void test_user_register(){

        //4. Click on 'Signup / Login' button
        WebElement loginButton = driver.findElement(By.xpath("//a[@href='/login']"));
        loginButton.click();
        //5. Verify 'New User Signup!' is visible

        //6. Enter name and email address
        WebElement nameInput = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        WebElement emailInput = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));

        nameInput.sendKeys("zeynep");

        emailInput.sendKeys("zeynepssaltik@gmail.com");

        //7. Click 'Signup' button
        WebElement signUpButton = driver.findElement(By.xpath("//button[.='Signup']"));
        signUpButton.click();
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccountInfoText = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(enterAccountInfoText.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

        name.sendKeys("zeynep");
        email.sendKeys("zeynepssaltik@gmail.com");
        password.sendKeys("123456");

        Select day = new Select(driver.findElement(By.xpath("//select[@id='days']")));
        Select month = new Select(driver.findElement(By.xpath("//select[@id='months']")));
        Select year = new Select(driver.findElement(By.xpath("//select[@id='years']")));

        day.selectByValue("2");
        month.selectByValue("4");
        year.selectByValue("1998");


        //10. Select checkbox 'Sign up for our newsletter!'

        WebElement newsletter = driver.findElement(By.xpath("//input[@name='newsletter']"));

        //11. Select checkbox 'Receive special offers from our partners!'
        WebElement specialOffer = driver.findElement(By.xpath("//input[@name='optin']"));
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //13. Click 'Create Account button'
        //14. Verify that 'ACCOUNT CREATED!' is visible
        //15. Click 'Continue' button
        //16. Verify that 'Logged in as username' is visible
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }

}
