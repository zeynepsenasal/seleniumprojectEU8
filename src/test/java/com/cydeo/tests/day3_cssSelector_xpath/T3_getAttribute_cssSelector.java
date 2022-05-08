package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {
        //
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
       WebDriver driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
        //1- Open a chrome browser
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //CSS Selector : tagname[attribute='value']
        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));

        String expectedLoginButtonText= "Log In";
        String actualLoginButtonText = loginButton.getAttribute("value"); //WE ARE USING GETATTIRBUTE BECAUSE
        // THE TEXT IS GIVEN IN THE VALUE ATTRIBUTE
        System.out.println("actualLoginButtonText = " + actualLoginButtonText);

        if(actualLoginButtonText.equals(expectedLoginButtonText)){
            System.out.println("Login Button verification PASSED");
        }else{
            System.out.println("Login Button verification FAILED");
        }







        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from


    }
}
