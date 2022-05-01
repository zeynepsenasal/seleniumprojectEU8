package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1-Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2-create instance for chrome
        WebDriver driver = new ChromeDriver();

        //3-test the driver is working as expected
         driver.get("https://www.google.com");

    }
}
