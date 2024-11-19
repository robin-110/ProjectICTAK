package org.internship.testcases;
import org.internship.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
   HomePage homeobj;

   @BeforeMethod //object dec for all
   public void setUp() {
      this.homeobj = new HomePage(this.driver);
   }
   //verify login button
   @Test
   public void verifyLoginButton() {
      boolean lb = this.homeobj.logbtn();
      Assert.assertTrue(lb, "Login button is not present");
   }
   //verify joinus button
   @Test
   public void joinusbtn() {
      boolean jsb = this.homeobj.joinusbtn();
      Assert.assertTrue(jsb, "JoinUs Button is not present");
   }
   //verify logo
   @Test
   public void logo() {
      boolean L = this.homeobj.logo();
      Assert.assertTrue(L, "Logo is not present");
   }
   //verify welcome message
   @Test
   public void welmsg() {
      boolean welcome = this.homeobj.wm();
      Assert.assertTrue(welcome, "Welcome message not Present");
   }
}
