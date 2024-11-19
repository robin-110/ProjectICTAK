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
		this.adbobject=new AdminDashboardPage (this.driver);
		this.lp=new LoginPage(this.driver);
		this.lp.click();
	    this.lp.setUsername(this.prop.getProperty("unameadmin"));
	    this.lp.setPassword(this.prop.getProperty("passwordadmin"));
        this.lp.loginClick();
	}
	@BeforeMethod
	public void bwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	//verify add project button
	@Test
	public void addproject() {
		boolean a = this.adbobject.addproject();
		Assert.assertTrue(a);// used to verify if a condition is true.
	}
	//verify logout button
	@Test
	public void logout() {
		boolean l=this.adbobject.logout();
		Assert.assertTrue(l);
	}
	//verify dashboard enabled
	@Test
	public void dashboard() {
		boolean d =this.adbobject.dashboard();
		Assert.assertTrue(d, null);
	}
	//check mentor tab
	@Test
	public void mentor() {
		boolean m=this.adbobject.mentor();
		Assert.assertTrue(m, null);
	}
	//add mentor positive
	@Test
	public void addmentor() {
		this.adbobject.addmentor();

		System.out.print("qwertyuiokmn");
		System.out.print("qazxc");


		System.out.print("qq");

		System.out.print(qwer);
		System.out.print(New project);


	}

}
