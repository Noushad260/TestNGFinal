package Testrunner_Khela;

import org.testng.annotations.Test;

import Khela.Bas;
import TestNG.BaseClassTestNG;

public class TestRunner extends Bas {
	
	@Test
	public void m1()
	{
		System.out.println("Test = 1");
	}
	
	@Test
	public void m2()
	{
		System.out.println("Test = 2");
	}

}
