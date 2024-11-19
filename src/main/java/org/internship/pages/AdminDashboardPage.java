package org.internship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminDashboardPage {
	WebDriver driver;
	//constructor
	public AdminDashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	public String urlreturn() throws InterruptedException{
		Thread.sleep(5000);
		String url=driver.getCurrentUrl();
		return url;
	}
	public void logoutclick()
	{
		driver.findElement(By.xpath("//span[text()=\"Logout\"]")).click();
	}
	//verify add project button 
	public boolean addproject() {
		WebElement addp=this.driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[1]/button"));
		boolean b=addp.isEnabled();
		return b;
	}
	//verify logout button
	public boolean logout() {
		WebElement logout=this.driver.findElement(By.xpath("/html/body/div/div/div[1]/header/div/a[2]/div/div[2]/span"));
		boolean l=logout.isEnabled();
		return l;
	}
	//verify dashboard enabled
	public boolean dashboard() {
		WebElement db=this.driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/a[1]/ul/li/div/div[2]/span"));
		return db.isEnabled();	
	}
	//check mentor tab
	public boolean mentor() {
		WebElement m=this.driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/a[2]/ul/li/div/div[2]/span"));
		return m.isEnabled();
	}
	//add mentor
	public void addmentor() {
		WebElement addp=this.driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[1]/button"));
		addp.click();
		WebElement name=this.driver.findElement(By.name("name"));
		name.sendKeys("steve");
		WebElement email=this.driver.findElement(By.name("email"));
		email.sendKeys("stevesmith@email.com");
		WebElement phone=this.driver.findElement(By.name("phone"));
		email.sendKeys("1234567898");
		WebElement pswd=this.driver.findElement(By.name("password"));
		email.sendKeys("@Qwerty1234");
		WebElement click=this.driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
		click.click();
		
	}
	

}
