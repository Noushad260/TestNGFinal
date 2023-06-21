package CrossExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossExecution {
	
 WebDriver driver;
 @BeforeMethod
 @Parameters("browser")
 public void launch(String browser)
 {
	 WebDriverManager.chromedriver().setup();
	 switch(browser.toLowerCase())
	 {
	 case "chrome":driver=new ChromeDriver();
	 break;
	 case "edge":driver=new EdgeDriver();
	 break;
	 case "firefox":driver=new FirefoxDriver();
	 break;
	 default:System.out.println("SORRY OOPs");
	 
	 }
 }
 
 
 
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}
