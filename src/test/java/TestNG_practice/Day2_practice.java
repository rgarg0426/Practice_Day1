package TestNG_practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2_practice {
  
	@BeforeTest
	public void day2_test1()
	
	{
		System.out.println("This will execute before all the current class test method");
	}
	
	@Test
	public void day2_test2()
	
	{
		System.out.println("test 2");
	}
	@Test
	public void day2_test3()
	
	{
		System.out.println("test 3");
	}
	
	
	
	
}
