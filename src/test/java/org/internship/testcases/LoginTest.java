package org.internship.testcases;
import java.time.Duration;

import org.internship.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
   LoginPage logobj;

   @BeforeMethod
   public void setUp() throws InterruptedException {
      this.logobj = new LoginPage(driver);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   }
   
  
   //admin positive login
   @Test (priority=1)
   public void posLogin() {
      logobj.click();
      logobj.setUsername(this.prop.getProperty("unameadmin"));
      logobj.setPassword(this.prop.getProperty("passwordadmin"));
      logobj.loginClick();
      boolean adb=logobj.adb();
      Assert.assertTrue(adb, "Admin is not directed to the dashboard after login");
      logobj.logout();
      
   }
   //mentor positive login
   @Test (priority=2)
   public void posLoginM() {
      logobj.click();
      logobj.setUsername(this.prop.getProperty("unamementor"));
      logobj.setPassword(this.prop.getProperty("passwordmentor"));
      logobj.loginClick();
      boolean mdb=logobj.mdb();//check using xpath from the redirected page
      Assert.assertTrue(mdb,"Mentor is not redirected to the Dashboard after login");
      logobj.logout();
   }
   
   //negative login
   @Test (priority=3)
   public void neglogin() {
	   logobj.click();
	   logobj.setUsername(this.prop.getProperty("invalidemail"));
	   logobj.setPassword(this.prop.getProperty("invalidpassword"));
	   logobj.loginClick();
	   //check redirected or not using url match
	   String actualurl=driver.getCurrentUrl();
	   String expectedurl="https://ictak-internship-portal-client.vercel.app/login";
	   Assert.assertEquals(actualurl, expectedurl);
	  
   }
   //negative login
   @Test(priority=4)
   public void blank() {
	   logobj.click();
	   logobj.setUsername(this.prop.getProperty("blank"));
	   logobj.setPassword(this.prop.getProperty("blank"));
	   logobj.loginClick();	
	   String actualurl=driver.getCurrentUrl();
	   String expectedurl="https://ictak-internship-portal-client.vercel.app/login";
	   Assert.assertEquals(actualurl, expectedurl);
	   
   }
   //valid password
   @Test(priority=5)
   public void pass() {
	   logobj.click();
	   logobj.setUsername(this.prop.getProperty("blank"));
	   logobj.setPassword(this.prop.getProperty("passwordadmin"));
	   logobj.loginClick();
	   String actualurl=driver.getCurrentUrl();
	   String expectedurl="https://ictak-internship-portal-client.vercel.app/login";
	   Assert.assertEquals(actualurl, expectedurl);//compare both the urls
   }
   //valid email
   @Test(priority=6)
   public void email() {
	   logobj.click();
	   logobj.setUsername(this.prop.getProperty("unamementor"));
	   logobj.setPassword(this.prop.getProperty("blank"));
	   logobj.loginClick();
	   String actualurl=driver.getCurrentUrl();
	   String expectedurl="https://ictak-internship-portal-client.vercel.app/login";
	   Assert.assertEquals(actualurl, expectedurl);
   }
   //signup
   @Test(priority=7)
   public void signup() {
	   logobj.click();
	  logobj.signup();	   
   }
   @AfterMethod
   public void browserclose() {
	   driver.close();
   }
}