package config;

import test.FirstSeleniumTest;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {

    static Properties prop = new Properties();

    public static void main(String[] args) {
        readPropertiesFile();
        writePropertiesFile();
        readPropertiesFile();
    }

    public static void readPropertiesFile(){

        try {
            InputStream input = new FileInputStream("src/config/config.properties");
            prop.load(input);
            System.out.println(prop.getProperty("browser"));

            FirstSeleniumTest.browser = prop.getProperty("browser");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writePropertiesFile(){
        try {
            OutputStream output = new FileOutputStream("src/config/config.properties");
            prop.setProperty("result","Firefox");
            try {
                prop.store(output,"Firefox stored");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
