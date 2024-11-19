package org.internship.testcases;

import java.time.Duration;

import org.internship.pages.AdminDashboardPage;
import org.internship.pages.HomePage;
import org.internship.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminDashboardTest extends TestBase {
	AdminDashboardPage adbobject;
	LoginPage lp;
	//setup
	@BeforeClass
	public void setup() {
		this.adbobject=new AdminDashboardPage (driver);
		lp=new LoginPage(driver);
		lp.click();
	    lp.setUsername(this.prop.getProperty("unameadmin"));
	    lp.setPassword(this.prop.getProperty("passwordadmin"));
        lp.loginClick();
	}
	@BeforeMethod
	public void bwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	//verify add project button
	@Test
	public void addproject() {
		boolean a = adbobject.addproject();
		Assert.assertTrue(a);// used to verify if a condition is true.
	}
	//verify logout button
	@Test
	public void logout() {
		boolean l=adbobject.logout();
		Assert.assertTrue(l);
	}
	//verify dashboard enabled
	@Test
	public void dashboard() {
		boolean d =adbobject.dashboard();
		Assert.assertTrue(d, null);
	}
	//check mentor tab
	@Test
	public void mentor() {
		boolean m=adbobject.mentor();
		Assert.assertTrue(m, null);
	}
	//add mentor positive
	@Test
	public void addmentor() {
		adbobject.addmentor();

		
	}

}
