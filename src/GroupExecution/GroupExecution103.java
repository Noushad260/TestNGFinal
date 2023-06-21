package GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupExecution103 {
	
	
	@Test(groups = "Function")
	public void test1() {
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("Class2--test1");
		driver.quit();
	}

	@Test(groups={"Function","Regression"})
	public void test2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Class2--test2");
		driver.quit();
	}

	@Test(groups = "Sanity")
	public void test3() {
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		System.out.println("Class2--test3");
		driver.quit();
	}

}
