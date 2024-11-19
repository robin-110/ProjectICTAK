package org.internship.testcases;
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
   public void setUp() {
      this.logobj = new LoginPage(this.driver);
   }
   
  
   //admin positive login
   @Test (priority=1)
   public void posLogin() {
      this.logobj.click();
      this.logobj.setUsername(this.prop.getProperty("unameadmin"));
      this.logobj.setPassword(this.prop.getProperty("passwordadmin"));
      this.logobj.loginClick();
      boolean adb=this.logobj.adb();
      Assert.assertTrue(adb, "Admin is not directed to the dashboard after login");
      
   }
   //mentor positive login
   @Test (priority=2)
   public void posLoginM() {
      this.logobj.click();
      this.logobj.setUsername(this.prop.getProperty("unamementor"));
      this.logobj.setPassword(this.prop.getProperty("passwordmentor"));
      this.logobj.loginClick();
      boolean mdb=this.logobj.mdb();
      Assert.assertTrue(mdb,"Mentor is not redirected to the Dashboard after login");
   }
   
   //negative login
   @Test (priority=3)
   public void neglogin() {
	   this.logobj.click();
	   this.logobj.setUsername(this.prop.getProperty("invalidemail"));
	   this.logobj.setPassword(this.prop.getProperty("invalidpassword"));
	   this.logobj.loginClick();
	   //check redirected or not
	   String actualurl=driver.getCurrentUrl();
	   String expectedyrl="https://ictak-internship-portal-client.vercel.app/login";
   }
   //negative login
   @Test
   public void blank() {
	   this.logobj.click();
	   this.logobj.setUsername(this.prop.getProperty("blank"));
	   this.logobj.setPassword(this.prop.getProperty("blank"));
	   this.logobj.loginClick();	
	   String actualurl=driver.getCurrentUrl();
	   String expectedyrl="https://ictak-internship-portal-client.vercel.app/login";
	   
   }
   //valid password
   @Test
   public void pass() {
	   this.logobj.click();
	   this.logobj.setUsername(this.prop.getProperty("blank"));
	   this.logobj.setPassword(this.prop.getProperty("passwordadmin"));
	   this.logobj.loginClick();
	   String actualurl=driver.getCurrentUrl();
	   String expectedyrl="https://ictak-internship-portal-client.vercel.app/login";
   }
   //valid email
   @Test
   public void email() {
	   this.logobj.click();
	   this.logobj.setUsername(this.prop.getProperty("unamementor"));
	   this.logobj.setPassword(this.prop.getProperty("blank"));
	   this.logobj.loginClick();
	   String actualurl=driver.getCurrentUrl();
	   String expectedyrl="https://ictak-internship-portal-client.vercel.app/login";
   }
   //signup
   @Test
   public void signup() {
	   this.logobj.click();
	  this.logobj.signup();	   
   }
   @AfterMethod
   public void browserclose() {
	   driver.close();
   }
}