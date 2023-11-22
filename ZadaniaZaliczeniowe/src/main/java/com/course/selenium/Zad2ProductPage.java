package com.course.selenium;

import org.junit.Assert;
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

    public void checkDiscount() {
        String expectedText = "SAVE 20%";
        String currentText = webDriver.findElement(By.xpath("//span[.= 'Save 20%']")).getText();
        Assert.assertEquals(expectedText, currentText);
    }

    public void addToCart1(String size) {
        WebElement sizeDropDown = webDriver.findElement(By.id("group_1"));
        sizeDropDown.sendKeys(size);

    }

    public void addToCart2() {
        WebElement quantityInput = webDriver.findElement(By.id("quantity_wanted"));
        quantityInput.clear();
        quantityInput.sendKeys(Keys.BACK_SPACE);
        quantityInput.sendKeys("5");
        WebElement buttonelement = webDriver.findElement(By.xpath("//button/i='[text()='Add to cart']"));
        buttonelement.click();
    }


    public void proceedToCheckout() {
        webDriver.findElement(By.cssSelector(".btn.btn-primary")).click();
    }


}
