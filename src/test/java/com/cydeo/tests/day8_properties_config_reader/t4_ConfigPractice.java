package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class t4_ConfigPractice {
  /*
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        String browser = Configiration_Reader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }
*/
    @Test
    public void google_search_test(){
        Driver.getDriver().get("https://google.com");
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@class='gLFyf gsfi']"));

        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue"));

        //4- Verify title:
        //Expected: apple - Google Search

    }

}
