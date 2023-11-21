package com.course.selenium;

import org.openqa.selenium.By;
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
        WebElement quantityInput = webDriver.findElement(By.name("qty"));
        quantityInput.clear();
        quantityInput.sendKeys(Integer.toString(quantity));
        WebElement sizeDropDown = webDriver.findElement(By.name("group_1"));
        sizeDropDown.sendKeys(size);
        WebElement addToCart = webDriver.findElement(By.cssSelector("button[name='Submit']"));
        addToCart.click();
    }

   // public Zad2CartPage goToCart() {
   //     webDriver.get("https://mystore-testlab.coderslab.pl/index.php?controller=order");
    //    return new Zad2CartPage(webDriver,wait);
  //  }
    public Zad2CheckoutPage goToCheckout(){
        webDriver.findElement(By.cssSelector("a[title='Proceed to checkout']")).click();
        return new Zad2CheckoutPage(webDriver,wait);
    }
}
