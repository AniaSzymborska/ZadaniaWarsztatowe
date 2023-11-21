package com.course.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zad2CheckoutPage {
    private WebDriver webDriver;
    private WebDriverWait wait;


    public Zad2CheckoutPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
    }

}