package TestNG;

import org.testng.annotations.Test;

public class DisabledAndenabled {

	@Test(enabled=true)
    public void test1() {
		System.out.println("test = 1");
	}

	@Test(enabled=true)
	public void test2() {
		System.out.println("Test = 2");
	}

	@Test(enabled=false)
	public void test3() {
		System.out.println("Test = 3");
	}
}
