package org.internship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MentorDashboardPage {
WebDriver driver;
//constructor
	public MentorDashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	public String urlreturn() throws InterruptedException{
		Thread.sleep(5000);
		String url=driver.getCurrentUrl();
		return url;
	}
	public void logoutclick()
	{
		driver.findElement(By.xpath("//span[text()=\\\"Logout\\\"]")).click();
	}
	//verify add project button 
	public boolean addproject() {
		WebElement mddp=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[1]/button"));
		boolean a=mddp.isEnabled();
		return a;
	}
	//verify logout button
	public boolean logout() {
		WebElement logout=driver.findElement(By.xpath("/html/body/div/div/div[1]/header/div/a[2]/div/div[2]/span"));
		boolean b=logout.isEnabled();
		return b;
	}
	//verify dashboard enabled
	public boolean dashboard() {
		WebElement db=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/a[1]/ul/li/div/div[2]/span"));
		return db.isEnabled();	
	}
	//check mentor tab
	public boolean mentor() {
		WebElement m=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/a[2]/ul/li/div/div[2]/span"));
		return m.isEnabled();
	}
	//add mentor
	public void addmentor() {
		WebElement mddp=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[1]/button"));
		mddp.click();
		WebElement name=driver.findElement(By.name("name"));
		name.sendKeys("varna");
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("varna321@email.com");
		WebElement phone=driver.findElement(By.name("phone"));
		email.sendKeys("1234567898");
		WebElement pswd=driver.findElement(By.name("password"));
		email.sendKeys("@varna1234");
		WebElement prjttopic=driver.findElement(By.name("project topic"));
		name.sendKeys("new project");
		WebElement click=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
		click.click();
	}
	//check mentor name column
	public String mentornamecolumn() {
		WebElement mnc=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[2]/table/thead/tr/th[1]"));
	return mnc.getText();
	}
	//check mentor email column
	public String mentoremailcolumn() {
		WebElement mec=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[2]/table/thead/tr/th[2]"));
	return mec.getText();
	}
	//check mentor phone column
	public String mentorphonecolumn() {
		WebElement mpc=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[2]/table/thead/tr/th[3]"));
	return mpc.getText();
	}
	
//check projecttopic column
	public String mentorprojecttopiccolumn() {
		WebElement mptc=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[2]/table/thead/tr/th[4]"));
	return mptc.getText();
	}
 //check edit mentor button	
	
	public void editmentorbutton() {
		WebElement emb=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[2]/table/tbody/tr[1]/td[4]/button[1]"));
emb.click();
	}
	//check delete button
	public void deletebutton() {
		WebElement db=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[2]/table/tbody/tr[1]/td[4]/button[2]"));
	db.click();
	
	}
}



