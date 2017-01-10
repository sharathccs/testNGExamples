package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssertionExample {

	
	/*A Hard Assertion is type of assertion that throws an exception immediately when an assert 
	statement fails and continues with the next test in the test suite. In order to achieve this,
	we need to handle the Assertion Error that is thrown with a catch block like a Java exception.
	After the suite completes execution, the particular test is marked as passed instead of a FAIL.*/
	
	@Test
	public void HardAssertion(){

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

	/*The disadvantage of Hard Assertion is that the test passed even though there was
	assertion failure which led to create customized error handlers which could fail 
	the test as needed.*/
	
	
	
	@Test
	public void SoftAssertion(){
			SoftAssert sa= new SoftAssert();
			sa.assertTrue(2<1, "Assert failing");
			System.out.println("Assertion Failed in soft assertion without any error handling");
			sa.assertFalse(1<2);
			System.out.println("Assertion failed without any error handling");
			sa.assertEquals("Sample", "Failed");
			System.out.println("assertion failed without any error handling");

	}
	
	
	
	
	
	


}
