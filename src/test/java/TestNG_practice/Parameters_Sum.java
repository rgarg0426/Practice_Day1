package TestNG_practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameters_Sum {
	
	
	@Test   
	@Parameters({"a","b"}) 
	public void add(int c, int d)  
	{  
	int sum=c+d;  
	System.out.println("Sum of two numbers : "+sum);  
	}  

}
