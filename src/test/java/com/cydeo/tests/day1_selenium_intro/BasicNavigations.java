package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  BasicNavigations{
    public static void main(String[] args) throws InterruptedException {
        //1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2-This line will open an empty browser
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize(); //maximizes browser size

        //3-go to tesla.com
        driver.get("https://www.tesla.com");

        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        Thread.sleep(3000); //wait 3 sec

        driver.navigate().forward(); //navigate forward

        //stop code execution for 3 second
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //use navigate.to
        driver.navigate().to("https://www.google.com");

        //get the title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());

        currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        
        currentURL= driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

    }
}
