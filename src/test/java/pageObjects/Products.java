package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products {
	private static WebElement element =null;
	
	public static WebElement Checkout(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.id("button_order_cart"));
		return element ;
	}
	
	//to view selected products in the cart by selecting drop down
	public static WebElement Cart_DD(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.className("cart_block block exclusive"));
		return element ;
	}
	
	
	public static WebElement Search_Bar(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.id("search_query_top"));
		return element ;
	}
	
	public static WebElement Search_Icon(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.name("submit_search"));
		return element ;
	}
	
	public static List<WebElement> Product_Category_Women(WebDriver driver) {
		// TODO Auto-generated method stub
		List<WebElement> element= driver.findElements(By.xpath(".//div[@id='block_top_menu']/ul/li"));
		//List<WebElement> shirt = driver.findElements(By.linkText("T-shirts"));
		//List<WebElement> dresses = driver.findElements(By.linkText("Dresses"));
		//List<WebElement> Product =new ArrayList<WebElement>();
        for( WebElement elm : element){
        	
        System.out.println(elm.getSize());	
        
			/*
			 * if(elm.getAttribute("href")!=null) {
			 * 
			 * //Product.addAll(element); }
			 */
               	
        }
        
		return element ;

	}

	
	public static WebElement Dresses(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.linkText("Dresses"));
		return element ;
	}


}
