package TestNG_practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import UtilJava.UtilClass;

public class DataProviderTest {

	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	
	{
		System.setProperty("webdriver.edge.driver", "C:\\Practice Java_selenium\\MS_edge_ driver\\msedgedriver.exe");
		 driver=new EdgeDriver();
		driver.get("https://i.half.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//span[contains(@id,'gh-ug-flex')]/child::a[text()='register']")).click();
		
		driver.findElement(By.xpath("//button[@id='personalaccount-radio']")).click();
		String element= driver.findElement(By.xpath("//h1[text()='Create an account']")).getText();
		Assert.assertEquals(element,"Create an account");
		
		
		}
	
	@DataProvider
	public void getTestData() throws IOException
	
	{
		UtilClass.getDataFromExcel();
	}
	
	@Test(dataProvider="getTestData")
	public void registerHalfEway()
	
	{
//	driver.findElement(By.id("firstname")).sendKeys(fName);
//	driver.findElement(By.id("lastname")).sendKeys(lName);
//	driver.findElement(By.xpath("//input[contains(@autocomplete,'ema')]")).sendKeys(email);
//	driver.findElement(By.cssSelector("//input[contains(@type, 'password')]")).sendKeys("password");	
	}
	
	
	@AfterMethod
	
	public void tierDown()
	{
		driver.quit();
	}
	
}
