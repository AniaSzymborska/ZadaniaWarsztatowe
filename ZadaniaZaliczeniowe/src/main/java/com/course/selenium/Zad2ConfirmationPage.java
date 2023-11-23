package com.course.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class Zad2ConfirmationPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public Zad2ConfirmationPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
    }

    public void screenShot(WebDriver webDriver, String fileName) {

        WebElement element = webDriver.findElement(By.id("order-confirmation"));
        byte[] bytes = element.getScreenshotAs(OutputType.BYTES);
        File file = new File("Screenshot.png");
        try {
            Files.write(file.toPath(), bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

