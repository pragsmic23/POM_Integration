package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import pageObjects.LoginPage;

public class NegativeTest extends TestBase {

	
@Test 

public void LoginFail(){ 
	 LoginPage.Login(driver).click();
	 assertEquals ("AUTHENTICATION",LoginPage.Authorization(driver).getText());
	 //to test invalid credentials
	 LoginPage.User_Id(driver).sendKeys("Shopping@gmail.com");
	 LoginPage.Password(driver).sendKeys("Shopping11");
	 LoginPage.Sign_In_Button(driver).click(); 
	 
	 String Expected= LoginPage.InvalidCred(driver).get(0).getText(); 
	 String Actual= "Authentication failed.";
	 assertEquals(Expected,Actual);
	 
	 
}


	
}
