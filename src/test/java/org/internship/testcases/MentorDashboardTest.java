package org.internship.testcases;


import java.time.Duration;


import org.internship.pages.HomePage;
import org.internship.pages.LoginPage;
import org.internship.pages.MentorDashboardPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
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
		    lp.setemail(prop.getProperty("mentoremail"));
		    lp.setPassword(this.prop.getProperty("passwordmentor"));
	    lp.loginClick();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		}
	
	
	@Test
	public void testLogoutclick()
	{
		
	}

	}
	
	
	


