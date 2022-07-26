package com.saless;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassTest {
	
	@Test
	public void clssTest() {
		Reporter.log("test1", true);
		

	}
	
	@Test
	public void class2Test() {
		Reporter.log("in class2Test()", true);
		System.out.println("Hello");
	}

}
