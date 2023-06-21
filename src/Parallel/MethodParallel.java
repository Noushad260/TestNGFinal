package Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodParallel {

	@Test
	public void test1()
	{
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.google.com");
	}
	
	@Test
	public void test2()
	{

		   WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com");
	}
	
}
