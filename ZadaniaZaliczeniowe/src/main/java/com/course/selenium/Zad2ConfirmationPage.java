package com.course.selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Zad2ConfirmationPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public Zad2ConfirmationPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;}

  //  public void screenShot(){
  //   File src = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
   //  FileUtils.copyFile(src new File ("src/main/resources"));
//    }
}
