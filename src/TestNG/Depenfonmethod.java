package TestNG;

import org.testng.annotations.Test;

public class Depenfonmethod {
	
	@Test(dependsOnMethods="tc2")
	public void tc1()
	{
		System.out.println("Test=1");
	}

	@Test
	public void tc2()
	{
		System.out.println("Test=2");
	}
	
}
