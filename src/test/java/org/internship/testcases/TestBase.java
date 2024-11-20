package org.internship.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestBase {
   WebDriver driver;
   Properties prop;//inbuilt class

   public void readProp() throws IOException {
      this.prop = new Properties();
      FileInputStream fileinp = new FileInputStream("C:\\Users\\rcben\\git\\ProjectICTAK\\src\\test\\resources\\config.properties");
      this.prop.load(fileinp);//load config file
   }

   @BeforeClass //browser selection
	public void testSetUp() throws InterruptedException, IOException {
		readProp();
		String browser=prop.getProperty("browser");
		switch(browser.toLowerCase()){
			case "chrome":
				driver=new ChromeDriver();
				break;
			case "firefox":
				driver=new FirefoxDriver();
				break;
			case "edge":
				driver=new EdgeDriver();
				break;
			default:
				System.out.println("Invalid browser name");
				return;
         }

         driver.get(prop.getProperty("url"));
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         return;
      }

      
  
}