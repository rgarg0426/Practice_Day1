package TestNG_practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameters_Subtract {

	
	@Test
	@Parameters({"a","b"})
	
	public void subtract(int c, int b)
	{
		int sub=c-b;
		System.out.println(sub);
		
	}
}
