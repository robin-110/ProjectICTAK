package org.internship.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
   WebDriver driver;

   public LoginPage(WebDriver driver) { //constructor same name 4 class and method
      this.driver = driver;
   }

   public void click() {
      WebElement click = driver.findElement(By.linkText("Login"));
      click.click();
   }

   public void setUsername(String username) {
      WebElement uname = driver.findElement(By.id("email"));
      uname.clear();
      uname.sendKeys(username);
   }

   public void setPassword(String password) {
      WebElement pswd = driver.findElement(By.id("password"));
      pswd.clear();
      pswd.sendKeys(password);
   }

   public void loginClick() {
      WebElement logclick = driver.findElement(By.xpath("//button[@type='submit']"));
      logclick.click();
   }
   public void signup() {
	   WebElement signup=driver.findElement(By.xpath("/html/body/div/div/main/div/div[2]/div/form/a"));
	   signup.click();
   }
   //dashboard loaded or not mentor
   public boolean mdb() {
	   WebElement mdb=driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/button"));
	   return mdb.isDisplayed();
   }
   //dashboard loaded or not admin
   public boolean adb() {
	   WebElement adb=driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[1]/button"));
	   return adb.isDisplayed();
   }
   //logout
   public void logout() {
	   WebElement lg=driver.findElement(By.xpath("/html/body/div/div/div[1]/header/div/a[2]/div"));
	   lg.click();
   }
  
}