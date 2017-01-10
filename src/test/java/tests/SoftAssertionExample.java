package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssertionExample {

	
	/*A Hard Assertion is type of assertion that throws an exception immediately when an assert 
	statement fails and continues with the next test in the test suite. In order to achieve this,
	we need to handle the Assertion Error that is thrown with a catch block like a Java exception.
	After the suite completes execution, the particular test is marked as passed instead of a FAIL.*/
	
	@Test
	public void test1(){

			try{

				Assert.assertTrue(2<1);
				System.out.println("Assertion Failed in Test 1");
				Assert.assertFalse(1>0);
				System.out.println("Assertion Failed in Test 1");
				Assert.assertEquals("Sample", "Sample");
				System.out.println("Assertion Passed in Test 1");

			} catch(AssertionError ae){
				System.out.println("Handling assertion error");
			}

	}




}
