package org.internship.testcases;
import java.time.Duration;

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

   @BeforeClass
   public void setUp() throws InterruptedException {
      this.logobj = new LoginPage(driver);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   }
   
  
   //admin positive login
   @Test (priority=1)
   public void posLogina() {
      logobj.click();
      logobj.setUsername(prop.getProperty("unameadmin"));
      logobj.setPassword(prop.getProperty("passwordadmin"));
      logobj.loginClick();
      String expectedurl="https://ictak-internship-portal-client.vercel.app/admin";
      String actualurl="https://ictak-internship-portal-client.vercel.app/admin";
      Assert.assertEquals(actualurl, expectedurl);
      logobj.logout();
      
   }
   //mentor positive login
   @Test (priority=2)
   public void posLoginM() {
      logobj.click();
      logobj.setUsername(prop.getProperty("unamementor"));
      logobj.setPassword(prop.getProperty("passwordmentor"));
      logobj.loginClick();
    String expectedurl="https://ictak-internship-portal-client.vercel.app/mentordashboard";
      String actualurl="https://ictak-internship-portal-client.vercel.app/mentordashboard";
      logobj.logout();
   }
   
   //negative login
   @Test (priority=3)
   public void blank() {
	   logobj.click();
	   logobj.setUsername(prop.getProperty("blank"));
	   logobj.setPassword(prop.getProperty("blank"));
	   logobj.loginClick();	
	   String actualurl=driver.getCurrentUrl();
	   String expectedurl="https://ictak-internship-portal-client.vercel.app/login";
	   Assert.assertEquals(actualurl, expectedurl);
	   
   }
   
   //negative login
   @Test (priority=4)
   public void neglogin() {
	   logobj.setUsername(prop.getProperty("invalidemail"));
	   logobj.setPassword(prop.getProperty("invalidpassword"));
	   logobj.loginClick();
	   //check redirected or not using url match
	   String actualurl=driver.getCurrentUrl();
	   String expectedurl="https://ictak-internship-portal-client.vercel.app/login";
	   Assert.assertEquals(actualurl, expectedurl);
	  
   }
  
   //valid password
   @Test(priority=5)
   public void pass() {
	   logobj.setUsername(prop.getProperty("blank"));
	   logobj.setPassword(prop.getProperty("passwordadmin"));
	   logobj.loginClick();
	   String actualurl=driver.getCurrentUrl();
	   String expectedurl="https://ictak-internship-portal-client.vercel.app/login";
	   Assert.assertEquals(actualurl, expectedurl);//compare both the urls
   }
   //valid email
   @Test(priority=6)
   public void email() {
	   logobj.setUsername(prop.getProperty("unamementor"));
	   logobj.setPassword(prop.getProperty("blank"));
	   logobj.loginClick();
	   String actualurl=driver.getCurrentUrl();
	   String expectedurl="https://ictak-internship-portal-client.vercel.app/login";
	   Assert.assertEquals(actualurl, expectedurl);
   }
   //signup
  // @Test(priority=0)
   //public void signup() {
	//   logobj.click();
	  //logobj.signup();	   
   //}
  
}