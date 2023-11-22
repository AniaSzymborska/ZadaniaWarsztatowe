package com.course.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zad2ProductPage {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public Zad2ProductPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
    }

    public void addToCart(int quantity, String size) {
        WebElement quantityInput = webDriver.findElement(By.id("quantity_wanted"));
        quantityInput.clear();
        quantityInput.sendKeys(Integer.toString(quantity)); // tu mam chyba problem
        WebElement sizeDropDown = webDriver.findElement(By.id("group_1"));
        sizeDropDown.sendKeys(size);
        webDriver.findElement(By.cssSelector(".btn.btn-primary.add-to-cart")).click();
    }

    public void proceedToCheckout(){
        webDriver.findElement(By.cssSelector(".btn.btn-primary")).click();
    }

  //  public Zad2CheckoutPage goToCheckout(){
   //     webDriver.findElement(By.cssSelector("a[title='Proceed to checkout']")).click();
   //     return new Zad2CheckoutPage(webDriver,wait);
    //}
}
