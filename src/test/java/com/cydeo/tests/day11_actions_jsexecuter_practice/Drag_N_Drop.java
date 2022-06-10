package com.cydeo.tests.day11_actions_jsexecuter_practice;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Drag_N_Drop {
    @Test
    public void drag_n_drop_test(){
        //TC #: Drag and drop
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement acceptAlert= Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));

        acceptAlert.click();

        //2. Drag and drop the small circle to bigger circle.
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions= new Actions(Driver.getDriver());

    //   actions.dragAndDrop( smallCircle , bigCircle).perform();

      actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”

        WebElement bigCircle2 = Driver.getDriver().findElement(By.id("droptarget"));

        Assert.assertEquals(bigCircle2.getText(), "You did great!");


    }
}
