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
	    lp.setUsername(prop.getProperty("unameadmin"));
	    lp.setPassword(prop.getProperty("passwordadmin"));
        lp.loginClick();
	}
	
	//verify add project button
	@Test(priority=1)
	public void addproject() {
		boolean a = adbobject.addproject();
		Assert.assertTrue(a);// used to verify if a condition is true.
		
	}
	//Edit project button
	@Test(priority=2)
	public void epb() {
		boolean a=adbobject.editproject();
		Assert.assertTrue(a);
		
	}
	//delete button
	@Test(priority=3)
	public void db() {
		boolean a=adbobject.deleteproject();
		Assert.assertTrue(a, "Delete button not enabled");
	}
	//verify logout button
	@Test(priority=4)
	public void logout() {
		boolean l=adbobject.logout();
		Assert.assertTrue(l);
	}
	//verify dashboard enabled
	@Test(priority=5)
	public void dashboard() {
		boolean d =adbobject.dashboard();
		Assert.assertTrue(d, null);
	}
	//check mentor tab
	@Test(priority=6)
	public void mentor() {
		boolean m=adbobject.mentor();
		Assert.assertTrue(m, null);
	}
	//add mentor positive
	@Test(priority=8)
	public void addmentor() {
		adbobject.addmentor();
		
	}
	//add project
	@Test (priority=7)
	public void adproject() {
		boolean b = adbobject.addprojec();
		Assert.assertTrue(b, "Project not added");
		
		
	}

}
