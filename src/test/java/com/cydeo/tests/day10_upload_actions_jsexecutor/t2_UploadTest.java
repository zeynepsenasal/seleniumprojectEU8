package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class t2_UploadTest {
    @Test
    public void upload_test(){
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //2. Find some small file from your computer, and get the path of it.
        String path= "C:\\Users\\Zeynep Sena\\Desktop\\Ekran görüntüsü 2022-06-03 214653.png";
        //3. Upload the file.

        WebElement fileUpload= Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));

        BrowserUtils.sleep(1);
        fileUpload.sendKeys(path);

        WebElement uploadButton= Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));
        uploadButton.click();

        //4. Assert:
        //-File uploaded text is displayed on the page
        //
    }
}
