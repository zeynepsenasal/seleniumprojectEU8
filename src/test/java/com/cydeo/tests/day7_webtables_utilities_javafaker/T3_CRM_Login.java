package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.CRM_Utilities;
import com.cydeo.tests.base.TestBase;
import org.testng.annotations.Test;

public class T3_CRM_Login extends TestBase {

    @Test
    public void crm_login_test(){
        driver.get("https://login1.nextbasecrm.com");

        CRM_Utilities.crm_login(driver,"helpdesk1@cybertekschool.com", "UserUser");

        //verify title as expected "Portal"

        BrowserUtils.verifyTitle(driver, "Portal");

    }
}
