package GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupClass101 {

	@Test(groups = {"Smoke","Regression"})
	public void test1() {
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Class1--test1");
		driver.quit();
		
	}

	@Test(groups = "Smoke")
	public void test2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("Class1--test2");
		driver.quit();
	}

	@Test(groups = "Regression")
	public void test3() {
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println("Class1--test3");
		driver.quit();
	}

}
