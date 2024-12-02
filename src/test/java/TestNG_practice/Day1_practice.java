package TestNG_practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1_practice {

	
	@BeforeSuite  
	public void beforeSuit1()
	{
		System.out.println("this will executed before all test methods only once");
		
	}
	@BeforeMethod  
	public void before_method()  
	{  
	System.out.println("This method will be invoked before every test method");  
	}  
	
	
	@Test(description="test1", groups= {"regression"})
	public void test1()
	{
		System.out.println("this is test1_regression but in xml it is disabled");
	}
	@Test(groups= {"regression"})
	public void test2()
	   {
		System.out.println("this is test2_regression");
	   }
	
	@Test
	public void test3()
	{
		System.out.println("this is test 3");
		
	}
	
	@AfterMethod  
	public void after_method()  
	{  
	System.out.println("This method will be invoked after the execution of each test method");  
	}  
	
	@AfterSuite  
	public void aftereSuit1()
	{
		System.out.println("this will executed after all test methods from all the classes only once");
		
	}
	@AfterTest
	public void aday2_test1()
	
	{
		System.out.println("This method is executed after the execution of all the test methods of the available classes");
	}
	
	
	
	
	


}
