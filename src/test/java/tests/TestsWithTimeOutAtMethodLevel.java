package tests;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TestsWithTimeOutAtMethodLevel {
  
	@Test(timeOut = 500)
	public void timeTestOne() throws ThreadTimeoutException{
		try {
			Thread.sleep(1000);
			System.out.println("Time test method one - timout set at method level");
		}catch (InterruptedException e) {
			System.out.println("This indicates the test did not run within the time set at the method level");
		} 
		
	}

	@Test(timeOut = 500)
	public void timeTestTwo() throws InterruptedException {
		Thread.sleep(400);
		System.out.println("Time test method two - ran within timelines. Timeout set at method level");
	}
	
	
}