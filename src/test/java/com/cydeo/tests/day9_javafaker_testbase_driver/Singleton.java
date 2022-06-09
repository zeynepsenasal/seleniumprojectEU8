package com.cydeo.tests.day9_javafaker_testbase_driver;

public class Singleton {

    //1-
    private Singleton(){

    }

    private static String word;

    public static String getWord(){

        if(word==null){
            System.out.println("First Time Call. Word object is null." + "Assign value to it now!");
            word= "something";
        }

return word;
    }











}
