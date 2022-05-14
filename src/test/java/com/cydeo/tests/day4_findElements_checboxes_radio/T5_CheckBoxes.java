package com.cydeo.tests.day4_findElements_checboxes_radio;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1. Go to http://practice.cydeo.com/checkboxes
        driver.get("http://practice.cydeo.com/checkboxes ");

            //We have to locate checkboxes
        WebElement checbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checbox1.isSelected(), expecting false = " + checbox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checbox2.isSelected(), expecting true = " + checbox2.isSelected());

        System.out.println("-----------------------------------------------------");
        //4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checbox1.click();

        //5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checbox2.click();
        //6. Confirm checkbox #1 is SELECTED.
        //2. Confirm checkbox #1 is NOT selected by default

        System.out.println("checbox1.isSelected(), expecting true = " + checbox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checbox2.isSelected(), expecting false = " + checbox2.isSelected());

        //7. Confirm checkbox #2 is NOT selected
    }
}