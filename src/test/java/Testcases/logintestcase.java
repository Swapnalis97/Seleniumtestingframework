package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.Baseclass;
import Resources.constants;
import pageobjectmodel.loginpageobject;

public class logintestcase extends Baseclass {

	@Test(dataProvider="testData")
	public void verifylogin( String username, String password) throws IOException {
		
		loginpageobject lpo = new loginpageobject(driver);
		lpo.enterusername().sendKeys(username);
		lpo.enterpassword().sendKeys(password);
		lpo.clickonlogin().click();
		
		WebElement a= lpo.errormsz();
		String Expectedtext=a.getText();
		
		  
		
		String actualtext="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(actualtext, Expectedtext, "testcase is pass");
		sa.assertAll();
	}
	
	 @DataProvider//create object of object[][]
	public Object[]testData(){//testdata is name
		Object[][]data=new Object[3][2];
		  data[0][0]=constants.username1;
		  data[0][1]=constants.password1;
		  data[1][0]=constants.username2;
		  data[1][1]=constants.password2;
		  data[2][0]=constants.username3;
		  data[2][1]=constants.password3;
		 
		return data;
	
	 }
}