package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setUpClass(){
        System.out.println("BeforeClass is running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("AfterClass is running");
    }


    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running");
    }

    @Test (priority = 1)
    public void test1(){
        System.out.println("Test1 is running...");

        //ASSERT EQUALS: compare 2 of same things
        String actual= "apple";
        String expected = "apple1";
        Assert.assertEquals(actual, expected);
    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("Test2 is running...");

        //AssertTrue
        String actual= "apple";
        String expected = "apple1";

        Assert.assertTrue(actual.equals(expected));
    }



}
