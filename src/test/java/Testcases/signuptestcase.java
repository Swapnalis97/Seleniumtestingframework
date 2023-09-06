package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.Baseclass;
import Resources.commonmethods;
import Resources.constants;
import pageobjectmodel.loginpageobject;
import pageobjectmodel.signuppageobject;

public class signuptestcase extends Baseclass {

	
	

	
    @Test
	public void signup() throws IOException, InterruptedException {
		
		
		loginpageobject lpo = new loginpageobject(driver);
		lpo.clicktraial().click();
		signuppageobject spo= new signuppageobject(driver);
		Thread.sleep(5000);
		spo.addfirstname().sendKeys(constants.firstname);
		spo.addlastname().sendKeys(constants.lastname);
		spo.addemail().sendKeys(constants.email);
		spo.addphone().sendKeys("1234567");
		
		commonmethods.selectdropdown(spo.addjobtitle(), 2);
		commonmethods.selectdropdown(spo.addcompanyemployees(), 3);
		
		commonmethods.selectdropdown(spo.addcountry(), 2);
		
		spo.clickbutton().click();
		
		WebElement a=spo.adderrormsz();
		
		String Expectedtext =a.getText();
		
		String actualText="Please read and agree to the Master Subscription Agreement";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualText, Expectedtext, "pass");
		sa.assertAll();
		
		/*WebElement a=spo.addjobtitle();
		Select s= new Select(a);
		s.selectByIndex(4);
		
		//spo.addcompanyname().sendKeys("abcdef");
		Thread.sleep(5000);

		WebElement b=spo.addcompanyemployees();
		Select s1 =new Select(b);
		s.selectByIndex(3);
		
		
		spo.addphone().sendKeys("1234567");
		
		WebElement c=spo.addcountry();
		Select s2 =new Select(c);
		s.selectByIndex(2);*/
		
		
		
		
	}
	
	
	
	
	
	
}
