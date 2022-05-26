package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.CRM_Utilities;
import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_Login {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void crm_login_test(){
        driver.get("https://login1.nextbasecrm.com");

        CRM_Utilities.crm_login(driver,"helpdesk1@cybertekschool.com", "UserUser");

        //verify title as expected "Portal"

        BrowserUtils.verifyTitle(driver, "Portal");

    }
}
