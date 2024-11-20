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
      WebElement loginbtn = driver.findElement(By.xpath("/html/body/div/nav/ul/li/a/button"));
      boolean a= loginbtn.isDisplayed();
      return a;
   }
   //joinus button
   public boolean joinusbtn() {
      WebElement joinbtn = driver.findElement(By.xpath("/html/body/div/div[1]/div/a/button"));
      return joinbtn.isDisplayed();
   }
   //welcome message
   public boolean wm() {
      WebElement welmsg = driver.findElement(By.xpath("/html/body/div/div[1]/div/h1"));
      return welmsg.isDisplayed();
   }
   // logo
   public boolean logo() {
      WebElement logo = driver.findElement(By.xpath("/html/body/div/nav/a/img"));
      return logo.isDisplayed();
   }
}