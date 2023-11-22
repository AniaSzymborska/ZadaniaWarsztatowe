package com.course.selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
       // try {
       //     Thread.sleep(1000);}
     //   catch (InterruptedException e){
      //      throw new RuntimeException(e);
     //   }
       // quantityInput.sendKeys(Keys.BACK_SPACE);
        //quantityInput.sendKeys("5");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("i.touchspin-up")));
        for (int i = 1; i <=4;i++){
            webDriver.findElement(By.cssSelector("i.touchspin-up")).click();
        }
        wait.until(ExpectedConditions.attributeToBe(By.id("quantity_wanted"),"value", "5"));
        quantityInput.sendKeys(Keys.ENTER);
       // WebElement buttonelement = webDriver.findElement(By.cssSelector("button.add-to-cart"));
       // buttonelement.click();
    }


    public void proceedToCheckout() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.cart-content a")));
        webDriver.findElement(By.cssSelector("div.cart-content a")).click();
    }


}
