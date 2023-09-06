package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class commonmethods {

	
	public static void selectdropdown( WebElement element,int index) {
		
		WebElement b=element;
		Select s1 =new Select(b);
		s1.selectByIndex(index);
		
	}
	
	
	
}
