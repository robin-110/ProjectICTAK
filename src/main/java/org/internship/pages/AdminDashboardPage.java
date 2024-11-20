package org.internship.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminDashboardPage {
	WebDriver driver;
	//constructor
	public AdminDashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	//verify add project button 
	public boolean addproject() {
		WebElement addp=driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[1]/button"));
		boolean b=addp.isEnabled();
		return b;
	}
	//edit button
	public boolean editproject() {
		WebElement edit=driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/table/tbody/tr[1]/td[2]/button[1]"));
		boolean b=edit.isEnabled();
		return b;
	}
	//delete button
	public boolean deleteproject() {
		WebElement delete=driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/table/tbody/tr[1]/td[2]/button[2]"));
		boolean b=delete.isEnabled();
		return b;
		}
	//verify logout button
	public boolean logout() {
		WebElement logout=driver.findElement(By.xpath("/html/body/div/div/div[1]/header/div/a[2]/div/div[2]/span"));
		boolean l=logout.isEnabled();
		return l;

	}

	//verify dashboard enabled
	public boolean dashboard() {
		WebElement db=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/a[1]/ul/li/div/div[2]/span"));
		return db.isEnabled();	
	}
	//check mentor tab
	public boolean mentor() {
		WebElement m=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/a[2]/ul/li/div/div[2]/span"));
		return m.isEnabled();
	}
	//add mentor form
	public void addmentor() {
		WebElement addp=driver.findElement(By.xpath("//span[text()='Mentors']"));
		addp.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement clickmentor =driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[1]/button"));
		clickmentor.click();
		WebElement name=driver.findElement(By.name("name"));
		name.sendKeys("steve");
		WebElement email=driver.findElement(By.name("email"));
		//email.click();
		email.sendKeys("stevesmith@email.com");
		WebElement phone=driver.findElement(By.name("phone"));
		phone.sendKeys("1234567898");
		WebElement pswd=driver.findElement(By.name("password"));
		pswd.sendKeys("@Qwerty1234");
		WebElement projtopic=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[5]/div/div/div/button"));
		projtopic.click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[5]/div/div/div[1]")).click();
		WebElement click=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
		click.click();
		
	}
	//add project
	public boolean addprojec() {
		WebElement addp=driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[1]/button"));
		addp.click();
		WebElement topic=driver.findElement(By.name("topic"));
		topic.click();
		topic.sendKeys("AI");
		WebElement duration=driver.findElement(By.name("duration"));
		duration.click();
		duration.sendKeys("3 Months");
		WebElement add=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
		add.click();
		return addp.isEnabled();
	}
	

}
