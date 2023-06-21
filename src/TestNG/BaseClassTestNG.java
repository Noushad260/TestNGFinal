package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClassTestNG {
 
  
	@BeforeSuite
	public void suit() {
		System.out.println("database connecting");
	}

	
	@BeforeTest
	public void test() {
		System.out.println("Connected Network");
	}

	@BeforeClass
	public void class1() {
		System.out.println("launch the Browser");
	}

	@BeforeMethod
	public void method() {
		System.out.println("loging = 1");
	}


	@AfterMethod
	public void methodteardown() {
		System.out.println("logout = 1");
	}
	


	@AfterClass
	public void class1teardown() {
		System.out.println("close the Browser");
	}

	
	@AfterTest
	public void testteardown() {
		System.out.println("disConnected Network");
	}

	@AfterSuite
	public void suitteardown() {
		System.out.println("Sorry OOPs database connecting");
	}
}
