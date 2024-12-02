package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day1_configure_browser {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		Properties prop= new Properties();
		FileInputStream file=new FileInputStream("C:\\Practice Java_selenium\\Practice_Day1\\src\\config.properties");
		prop.load(file);
		System.out.println(prop.getProperty("browser"));
		
		if(prop.getProperty("browser").equals("chrome"))
		{
			  driver= new ChromeDriver();
          System.setProperty("webdriver.chrome.driver","C:\\Practice Java_selenium\\chromedriver-win64\\chromedriver");
          System.out.println("chrome browser launched successfully");	
          driver.get("https://www.flipkart.com/");
        		driver.manage().window().maximize();
		}
        			
		
		else if (prop.getProperty("browser").equals("edge"))
			
		{
			driver=  new EdgeDriver();
	          System.setProperty("webdriver.edge.driver", "C:\\Practice Java_selenium\\MS_edge_ driver\\msedgedriver");
	        	System.out.println("edge browser launched successfully");	
	          driver.get("https://www.flipkart.com/");
	        		driver.manage().window().maximize();
		}
		


        
		
		
//		     	 WebDriver driver= new ChromeDriver();
//                System.setProperty("webdriver.chrome.driver","C:\\Practice Java_selenium\\chromedriver-win64\\chromedriver.exe");
//     
//                   driver.get("https://google.com");
//                 driver.manage().window().maximize();
//                  driver.quit();
       
      
	}

}
