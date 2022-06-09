package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_RegistrationForm {
    @Test
    public void registration_form_test(){
        //TC#1: Registration form confirmation
        //Note: Use JavaFaker OR read from configuration.properties file when possible.
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.url"));

        Faker faker= new Faker();


        //3. Enter first name
        WebElement nameInput= Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        String fakerName= faker.name().firstName();
        nameInput.sendKeys(fakerName);

        //4. Enter last name
        WebElement lastNameInput= Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        String fakerLastName= faker.name().lastName();
        lastNameInput.sendKeys(fakerLastName);
        //5. Enter username
        WebElement userNameInput= Driver.getDriver().findElement(By.xpath("//input[@name='username']"));

        String userName= faker.bothify("helpdesk###");
        userNameInput.sendKeys(userName);

        //6. Enter email address
        WebElement emailAdressInput= Driver.getDriver().findElement(By.xpath("//input[@name='email']"));

        emailAdressInput.sendKeys(userName+ "@email.com");

        //7. Enter password
        WebElement passwordInput= Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys(faker.numerify("#########"));

        //8. Enter phone number
        WebElement phoneNumberInput= Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumberInput.sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons
        WebElement inputGender= Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        //10. Enter date of birth
        WebElement dateOfBirth=   Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
      // faker.number().numberBetween(2004,1920);
        dateOfBirth.sendKeys("02/04/1998");

        //11. Select Department/Office

        Select department= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        department.selectByIndex(faker.number().numberBetween(1,9));


        //12. Select Job Title
        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,8));

        //13. Select programming language from checkboxes
        WebElement programmingLanguage= Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        programmingLanguage.click();

        //14. Click to sign up button
        WebElement signUpButton= Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        signUpButton.click();

        //15. Verify success message “You’ve successfully completed registration.” is
        //displayed.

        WebElement messagge= Driver.getDriver().findElement(By.tagName("p"));

        Assert.assertEquals(messagge.getText(),"You’ve successfully completed registration!" );


        //
    }
}
