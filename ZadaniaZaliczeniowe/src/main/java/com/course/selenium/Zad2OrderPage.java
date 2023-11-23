package com.course.selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Zad2OrderPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public Zad2OrderPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
    }

    public void confirmData() {
        List<WebElement> elements = webDriver.findElements(By.cssSelector("div.address-body"));
        WebElement lastBox = elements.get(elements.size() - 1);
        String aliasOnPage = lastBox.findElement(By.tagName("h4")).getText();
        Assert.assertEquals("AnnSzy", aliasOnPage);
        String infoFromPage = lastBox.findElement(By.tagName("address")).getText();
        String expectedAddress = "Ania Szymborska Testerow 14 Gdziekolwiek 00 - 112 United Kingdom 333 444 555";
        Assert.assertEquals(expectedAddress, infoFromPage);

    }

    public void confirmAdress() {
        webDriver.findElement(By.name("confirm-addresses")).click();
    }

    public void shippingMethod() {
        webDriver.findElement(By.xpath("//span[.='Pick up in-store']"));
        webDriver.findElement(By.name("confirmDeliveryOption")).click();
    }

    public void paymentOptions() {
        webDriver.findElement(By.xpath("//span[.='Pay by Check']")).click();
    }

    public void conditionsToApprove() {
        webDriver.findElement(By.cssSelector("form#conditions-to-approve input")).click();
    }

    public void placeOrder() {
        webDriver.findElement(By.cssSelector("div#payment-confirmation button[type='submit']")).click();
    }

}

