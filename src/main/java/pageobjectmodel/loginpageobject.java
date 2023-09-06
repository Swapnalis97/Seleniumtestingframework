package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpageobject {
public WebDriver driver;//Don't have scope
	//when we want to achieve driver.findelement by.xpath we use Webelement to store it
	//when we want to use only by.xpath we will use By=by.xpath
	//declare all username and password privately
	
	private By username = By.xpath("//input[@id=\"username\"]");
	private By password= By.xpath("//input[@id=\"password\"]");
	private By click= By.xpath("//input[@id=\"Login\"]");
	private By freetrial=By.xpath("//div[@id=\"signup\"]");
	private By errormsz=By.xpath("//div[@id=\"error\"]");
	
	public loginpageobject(WebDriver driver2) {//create constructor
		this.driver=driver2;//give scope to driver from driver2
	}

	public WebElement enterusername() {
		return driver.findElement(username);
		
	}
	
	public WebElement enterpassword() {
		return driver.findElement(password);
		
	}
	public WebElement clickonlogin() {
		return driver.findElement(click);
		
	}
	
	public WebElement clicktraial() {
		return driver.findElement(freetrial);}
	
	
	public WebElement errormsz() {
		return driver.findElement(errormsz);}
	
}
