package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.PropertyReader;

public class TestBase extends PropertyReader {

		// TODO Auto-generated method stub
		public static WebDriver driver;
		
		@BeforeTest
		public void initialize() throws IOException{
			
			String browser = "chrome";
			
			if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();		
	
			}
			else if(browser.equals("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver =new FirefoxDriver();
			}
			
			else if(browser.equals("IE")) {
				System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
			//To maximize browser
	                driver.manage().window().maximize();
		        //Implicit wait
	        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//To open shopping site
	                driver.get(PropertyReader.ReadProperty("appurl"));
			
		}
		
	
		
	/*
	 * @AfterTest public void cleanUp(){ driver.manage().deleteAllCookies(); }
	 */		
		@AfterTest
		//Test cleanup
		public void TeardownTest()
	    {
	        TestBase.driver.quit();
	    }

	}


