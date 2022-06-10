package com.cydeo.tests.day8_properties_config_reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configiration_Reader {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file= new FileInputStream("configuration.properties");
            properties.load(file);
            //close the file
            file.close();

        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
