package Khela;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bas {
	WebDriver driver;
	@BeforeClass
	public void launch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
	}
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("razamd260@G");
		driver.findElement(By.id("submitButton")).click();
	
	}
	
	@AfterMethod
	public void logout()
	{
		WebElement element=driver.findElement(By.xpath("//td[@class=\"genHeaderSmall\"]/following-sibling::td[@class=\"small\"][1]"));

		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
		
	}
	
}
