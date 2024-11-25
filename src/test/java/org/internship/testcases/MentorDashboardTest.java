package org.internship.testcases;





import java.time.Duration;

import org.internship.pages.HomePage;
import org.internship.pages.LoginPage;
import org.internship.pages.MentorDashboardPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




	public class MentorDashboardTest extends TestBase {
	MentorDashboardPage mdp;
		LoginPage lp;
		HomePage hp;
		//setup
		@BeforeClass
		public void setup() {
		
		 hp = new HomePage(driver);
		 lp = new LoginPage(driver);
		 mdp= new MentorDashboardPage(driver);
		 lp=new LoginPage(this.driver);
			lp.click();
		    lp.setEmail(prop.getProperty("mentoremail"));
		    lp.setPassword(this.prop.getProperty("passwordmentor"));
	    lp.loginClick();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		}
	
	@BeforeMethod
public void bwait() {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test
	
	
		 public void testLogoutAvailable() throws InterruptedException {
		        boolean d = mdp.logout();
		        Assert.assertTrue(d);
		    }
	
	@Test
	public void testdashboard() {
		boolean d =this.mdp.dashboard();
		Assert.assertTrue(d, null);
	}
	@Test
	public void testAddProject() {
		boolean a = this.mdp.addproject();
		Assert.assertTrue(a);
	}
	@Test
	public void mentor() {
		boolean m=this.mdp.mentor();
		Assert.assertTrue(m, null);
	}
	@Test
	public void addmentor() {
		this.mdp.addmentor();
	}
	
	@Test
	public void testEditandDeleteMentor() {
		mdp.editmentorbutton();
		mdp.deletebutton();
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	}


