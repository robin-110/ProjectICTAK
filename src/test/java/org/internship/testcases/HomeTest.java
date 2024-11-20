package org.internship.testcases;
import org.internship.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
   HomePage homeobj;

   @BeforeClass //object dec for all
   public void setUp() {
      this.homeobj = new HomePage(driver);
   }
   //verify login button
   @Test (priority=1)
   public void verifyLoginButton() {
      boolean lb =homeobj.logbtn();
      Assert.assertTrue(lb, "Login button is not present");
   }
   //verify joinus button
   @Test (priority=2)
   public void joinusbtn() {
      boolean jsb =homeobj.joinusbtn();
      Assert.assertTrue(jsb, "JoinUs Button is not present");
   }
   //verify logo
   @Test (priority=3)
   public void logo() {
      boolean L = homeobj.logo();
      Assert.assertTrue(L, "Logo is not present");
   }
   //verify welcome message
   @Test (priority=4)
   public void welmsg() {
      boolean welcome = homeobj.wm();
      Assert.assertTrue(welcome, "Welcome message not Present");
   }
}
