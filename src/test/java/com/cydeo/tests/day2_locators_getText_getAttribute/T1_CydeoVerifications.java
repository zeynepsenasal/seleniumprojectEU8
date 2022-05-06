package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class T1_CydeoVerifications {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //go to the page
        driver.navigate().to("https://practise.cydeo.com");

        String expectedURL= "cydeo";
        String actualURL=driver.getCurrentUrl();

        if(actualURL.contains(actualURL))
        {
            System.out.println("URL Test PASSED");
        }else{
            System.out.println("URL Test FAİLED");
        }

        String expectedTitle= "Practise";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification PASSED");
        }





    }
}
