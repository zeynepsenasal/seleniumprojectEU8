package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.Utilities.Driver;
import com.cydeo.pages.LibraryLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;

    @Test
    public void required_field_errormessage_test(){
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com ");

        //3- Do not enter any information 4- Click to “Sign in” button

        LibraryLoginPage libraryLoginPage= new LibraryLoginPage();

        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void invalid_email_errormessage_test(){
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com ");

        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.username.sendKeys("somethingwrong");

        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        Driver.closeDriver();


    }

    @Test
    public void library_negative_login_test(){
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com ");
        //3- Enter incorrect username or incorrect password

        libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.username.sendKeys("wrong@username.com");
        libraryLoginPage.password.sendKeys("wrong");

        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password

        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());

    }









}
