package TestNG;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 3)

	public void test1() {
		System.out.println("test = 1");
	}

	@Test(priority = 2)
	public void test2() {
		System.out.println("Test = 2");
	}

	@Test(priority = 1)
	public void test3() {
		System.out.println("Test = 3");
	}
}
