package com.course.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    public void openZad2MainPage() {
        webDriver.get("https://prod-kurs.coderslab.pl/index.php?");
    }

   // public void goToZad2LoginPage(){
    //    webDriver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");
  //  }

    public void findSweater(String ProductName){
    webDriver.findElement(By.name("s")).sendKeys(ProductName);
    webDriver.findElement(By.name("s")).sendKeys(Keys.ENTER);
    webDriver.findElement(By.xpath("//h2/a[text()='Hummingbird printed sweater']")).click();

    }
}
