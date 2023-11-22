package com.course.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zad2CartPage {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public Zad2CartPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
    }

    public void openZad2CartPage() {
        webDriver.get("https://mystore-testlab.coderslab.pl/index.php?controller=cart&action=show");
    }


    public boolean checkDiscount(String expectedDiscount) {
        String actualDiscount = webDriver.findElement(By.className("price cart_discount_price")).getText();
        return actualDiscount.contains(expectedDiscount);
    }

    public void proceedToCheckout2() {
        webDriver.findElement(By.className("btn btn-primary")).click();
    }
}