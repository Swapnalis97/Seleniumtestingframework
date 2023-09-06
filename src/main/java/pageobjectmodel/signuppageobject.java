package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signuppageobject {
public WebDriver driver;
	private By firstname=By.xpath("//input[@name=\"UserFirstName\"]");
	private By lastname=By.xpath("//input[@name=\"UserLastName\"]");
	private By email=By.xpath("//input[@name=\"UserEmail\"]");
    private By jobtitle=By.xpath("//select[@name=\"UserTitle\"]");
	//private By  companyname=By.xpath("//input[@name=\"CompanyName\"]");
	private By companyemployees=By.xpath("//select[@name=\"CompanyEmployees\"]");
	private By phone=By.xpath("//input[@name=\"UserPhone\"]");
	private By country=By.xpath("//select[@name=\"CompanyCountry\"]");
	private By Button=By.xpath("//button[@name=\"start my free trial\"]");
	private By errormsz=By.xpath("//span[@class=\"error-msg-block\"]");
	public signuppageobject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement addfirstname() {
		return driver.findElement(firstname);}
	
	
	public WebElement addlastname() {
		return driver.findElement(lastname);}
	
	
	public WebElement addemail() {
		return driver.findElement(email);}
	
	
	public WebElement addjobtitle() {
		return driver.findElement(jobtitle);}
	
	//public WebElement addcompanyname() {
		//return driver.findElement(companyname);}
	
	
	public WebElement addcompanyemployees() {
		return driver.findElement(companyemployees);}
	
	
	public WebElement addphone() {
		return driver.findElement(phone);}
	
	public WebElement addcountry() {
		return driver.findElement(country);}
	
	public WebElement adderrormsz(){
		return driver.findElement(errormsz);}
	
	public WebElement clickbutton(){
		return driver.findElement(Button);}
}
