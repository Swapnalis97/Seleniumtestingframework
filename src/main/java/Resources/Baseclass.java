package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	public WebDriver driver;
	public Properties prop;
public void initilizedriver() throws IOException {
	//to read data
	//user +dir is use to give file path of user file
	FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
	//to control on file
	//properties is inbuilt class available in java
	prop=new Properties();
	prop.load(fs);
	
	String browsername=prop.getProperty("browser");
	
	
	if( browsername.equalsIgnoreCase("chrome")) {
		
		 driver=new ChromeDriver();
	}
	
	
	else if(browsername.equalsIgnoreCase("firefox")) {
		 driver=new FirefoxDriver();
	}
	
	else {
		
		System.out.println("try with another browser");
	}
	
	
	
}
@BeforeMethod
public void urlandbrowser() throws IOException {
	initilizedriver();
	driver.get(prop.getProperty("url"));
	
}

}
