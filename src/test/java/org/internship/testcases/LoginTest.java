package org.internship.testcases;
import java.time.Duration;

import org.internship.pages.AdminDashboardPage;
import org.internship.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
   LoginPage logobj;
AdminDashboardPage adb;

   @BeforeClass
   public void setUp() {
	   adb=new AdminDashboardPage(driver);
      logobj = new LoginPage(driver);
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
   
  
   //admin positive login
   @Test (priority=1)
   public void posLogin() throws InterruptedException {
      logobj.click();
      logobj.setUsername(prop.getProperty("unameadmin"));
      logobj.setPassword(prop.getProperty("passwordadmin"));
      logobj.loginClick();
      String url=adb.urlreturn();
      Assert.assertEquals(url,"https://ictak-internship-portal-client.vercel.app/admin");
      adb.logoutclick();
   }
   //mentor positive login
   @Test (priority=2)
   public void posLoginM() {
      logobj.click();
      logobj.setUsername(this.prop.getProperty("unamementor"));
    logobj.setPassword(this.prop.getProperty("passwordmentor"));
      logobj.loginClick();
      boolean mdb=logobj.mdb();
      Assert.assertTrue(mdb,"Mentor is not redirected to the Dashboard after login");
   }
   
   //negative login
   @Test (priority=3)
   public void neglogin() {
	  logobj.click();
	   logobj.setUsername(prop.getProperty("invalidemail"));
	  logobj.setPassword(prop.getProperty("invalidpassword"));
	 logobj.loginClick();
	   //check redirected or not
	   String actualurl=driver.getCurrentUrl();
	   String expectedurl="https://ictak-internship-portal-client.vercel.app/login";
   }
   //negative login
   @Test(priority=4)
   public void blank() {
	   logobj.click();
	  logobj.setUsername(prop.getProperty("blank"));
	  logobj.setPassword(prop.getProperty("blank"));
	  logobj.loginClick();	
	   String actualurl=driver.getCurrentUrl();
	   String expectedyrl="https://ictak-internship-portal-client.vercel.app/login";
	   
   }
   //valid password
   @Test(priority=5)
   public void pass() {
	   logobj.click();
	   logobj.setUsername(prop.getProperty("blank"));
	   logobj.setPassword(prop.getProperty("passwordadmin"));
	   logobj.loginClick();
	   String actualurl=driver.getCurrentUrl();
	   String expectedurl="https://ictak-internship-portal-client.vercel.app/login";
   }
   //valid email
   @Test(priority=6)
   public void email() {
	   logobj.click();
	   logobj.setUsername(prop.getProperty("unamementor"));
	   logobj.setPassword(prop.getProperty("blank"));
	   logobj.loginClick();
	   String actualurl=driver.getCurrentUrl();
	   String expectedurl="https://ictak-internship-portal-client.vercel.app/login";
   }
   //signup
   @Test(priority=7)
   public void signup() {
	   logobj.click();
	  logobj.signup();	   
   }
//  // @AfterMethod
//   public void browserclose() {
//	   driver.close();
//   }
}