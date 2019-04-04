package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import pageObjects.*;

public class FunctionalTest extends TestBase {
	
	
	@Test(priority=0)
	public void Home(){
		assertEquals("Sign in",LoginPage.Sign_In_Title(driver).getText());
		System.out.println("User is not logged in");		
	}
	

	
	  @Test (priority=1)
	  
	  public void RegistrationFails() throws
	  InterruptedException,NoSuchElementException {
	  LoginPage.Login(driver).click();
	  assertEquals("AUTHENTICATION",LoginPage.Authorization(driver).getText() );
	  LoginPage.Email_AccountCreation(driver).sendKeys("Shopping@gmail.com");
	  Thread.sleep(1000); 
	  LoginPage.CreateAccount(driver).click();
	  
	  String ExpectedErrorMsg = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
	  assertEquals(LoginPage.ExistingUser(driver).get(0).getText(),ExpectedErrorMsg);
	 
	  } 
	
	
	  @Test(priority=2) 
	  public void Login() throws InterruptedException{
	  
	  //LoginPage.Login(driver).click();
	  assertEquals("AUTHENTICATION",LoginPage.Authorization(driver).getText() );
	  LoginPage.User_Id(driver).sendKeys("Shopping@gmail.com");
	  LoginPage.Password(driver).sendKeys("Shopping12"); 
	  Thread.sleep(1000);
	  LoginPage.Sign_In_Button(driver).click();
	  assertEquals("MY ACCOUNT",MyAccount.Title(driver).getText() ); }
	 
	  
	/*
	 * 
	 * @Test public void AddtoCart() {
	 * Products.Search_Bar(driver).sendKeys("Summer");
	 * Products.Search_Icon(driver).click();
	 * assertEquals("Printed Summer Dress",Products.Product_Summer(driver).getText()
	 * );
	 * 
	 * 
	 * 
	 * }
	 */
	 }
