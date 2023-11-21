package com.course.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zad2LoginPage {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public Zad2LoginPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
    }

    public void signIn(String email, String password) {
        WebElement element = webDriver.findElement(By.id("field-email"));
        element.sendKeys(email);
        webDriver.findElement(By.id("field-password")).sendKeys(password);
        webDriver.findElement(By.id("submit-login")).click();

    }

}
