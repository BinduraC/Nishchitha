package com.saless;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassTest {
	
	@Test
	public void clssTest() {
		Reporter.log("test1", true);
		Reporter.log("test2", true);
		Reporter.log("test3", true);
		Reporter.log("test4", true);

		System.out.println("Confiansa to master");
		System.out.println("child change");//hi


		System.out.println("changes on 21-07-22");//hi

		System.out.println("child change");
		System.out.println("kid change today ");//hi
		System.out.println("kid change");
		//sd

	}
	
	@Test
	public void class2Test() {
		Reporter.log("in class2Test()", true);
		System.out.println("Hello");
	}

}
