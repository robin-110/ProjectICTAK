package org.internship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
   WebDriver driver;
   //constructor
   public HomePage(WebDriver driver) {
      this.driver = driver;
   }
   //login button
   public boolean logbtn() {
      WebElement loginbtn = driver.findElement(By.xpath("//button[@class='btn1']"));
      boolean a= loginbtn.isDisplayed();
      return a;
   }
   //joinus button
   public boolean joinusbtn() {
      WebElement joinbtn = driver.findElement(By.xpath("//button[text()='Join us']"));
      return joinbtn.isDisplayed();
   }
   //welcome message
   public boolean wm() {
      WebElement welmsg = driver.findElement(By.xpath("//h1[text()='Welcome to ICT Academy of Kerala']"));
      return welmsg.isDisplayed();
   }
   // logo
   public boolean logo() {
      WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
      return logo.isDisplayed();
   }
}