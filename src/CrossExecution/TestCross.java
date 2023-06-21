package CrossExecution;

import org.testng.annotations.Test;

public class TestCross extends CrossExecution{
	
	@Test
	public void m1()
	{
		driver.get("https://www.swiggy.com/");
		
	}

}
