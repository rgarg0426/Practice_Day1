package ExtentReportTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTest {
	
	ExtentReports extent;
	WebDriver driver;
	
	@BeforeTest
	
	public void extentReportConfig()
	{
		//ExtentReports and ExtentSparkReports
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web_Automation_Test");
		reporter.config().setDocumentTitle("Test Results");
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Ravi Kumar");
		
		
		
	}
	
	
	@Test
	
	public void initializeDemo()
	{
		extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "C:\\Practice Java_selenium\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		extent.flush();
		
		
	}
	@Test
	public void initializeDemo2()
	{
		extent.createTest("Test2");
		driver.findElement(By.xpath("//div[@class='login-btn'][1]")).click();
		String str=driver.findElement(By.xpath("//h3[contains(@class,'heading3')]")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "Sign Up");
		extent.flush();
			}
	@Test
		public void initializeDemo3()
	{
		extent.createTest("Register user");
		driver.findElement(By.id("name")).sendKeys("ravi kumar");;
		driver.findElement(By.cssSelector("input#email")).sendKeys("gargr0189@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'allow')]")).click();
		boolean b=driver.findElement(By.xpath("//input[contains(@id,'allow')]")).isSelected();
		Assert.assertTrue(b);
		extent.flush();
			}
	
	
	@AfterTest
	public void tierDown()
	{
		driver.close();
	}
	
}

