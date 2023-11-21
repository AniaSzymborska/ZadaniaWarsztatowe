package com.course.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyUtils {
    public static WebDriver getWebDriver(String browser){
        switch (browser.toUpperCase()){
            case "CHROME": {
                System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
                return new ChromeDriver();
            }
            default:{
                System.out.println("Nie istnieje taka przeglądarka");
                return null;
            }
        }
    }
}