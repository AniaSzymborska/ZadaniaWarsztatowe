package com.course.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zad2MainPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public Zad2MainPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
    }

    public void goToZad2LoginPage() {
        WebElement signInButton = webDriver.findElement(By.xpath("//span[.= 'Sign in']"));
        signInButton.click();
    }
    public void findSweater(String ProductName){
    webDriver.findElement(By.name("s")).sendKeys(ProductName);
    webDriver.findElement(By.cssSelector("button[class='btn btn-default button-search']")).click();
    }
}
