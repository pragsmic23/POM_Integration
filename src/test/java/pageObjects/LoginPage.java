package pageObjects;


import java.util.List;

//import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

		
		// TODO Auto-generated method stub
		private static WebElement element =null;
		
		
	public static WebElement Authorization(WebDriver driver) {
	element = driver.findElement(By.className("page-heading"));
	return element;  
      
	}

	public static WebElement Login(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.className("login"));
		return element ;
	}
	
	public static WebElement User_Id(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.id("email"));
		return element ;
	}
	
	public static WebElement Email_AccountCreation(WebDriver driver) {
	element =  driver.findElement(By.id("email_create"));
		return (WebElement) element;
	}

	public static WebElement Password(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.id("passwd"));
		return element ;
	}
	
	public static WebElement Sign_In_Title(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.className("login"));
		return element ;
	}
	
	public static WebElement Sign_In_Button(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.id("SubmitLogin"));
		return element ;
	}
	public static WebElement Forgot_Pass(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.className("lost_password form-group"));
		return element ;
	}
	
	public static WebElement CreateAccount(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.id("SubmitCreate"));
		return element ;
	}
	
	  
	public static List<WebElement> ExistingUser(WebDriver driver) {
		// TODO Auto-generated method stub
		
		 
		List<WebElement> element= driver.findElements(By.xpath("//div[@id='create_account_error']/ol/li"));
            for( WebElement elm : element){
            	
            	elm.getSize();
			
			//System.out.println(elm.getText());	
		
	}
			return element;
	
	}
	
	public static List<WebElement> InvalidCred(WebDriver driver) {
		// for negative testing.
		
		List<WebElement> element= driver.findElements(By.xpath(".//*[contains(@class, 'alert') and contains(@class, 'alert-danger')]/ol/li"));
            for( WebElement elm : element){
            	
            	elm.getSize();
			
			//System.out.println(elm.getText());	
		
	}
			return element;
	
	}
	
	}
