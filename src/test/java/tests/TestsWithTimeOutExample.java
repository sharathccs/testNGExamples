package tests;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TestsWithTimeOutExample {
  
	@Test
	public void timeTestOne() throws ThreadTimeoutException{
		try {
			Thread.sleep(1000);
			System.out.println("Time test method one");
		}catch (InterruptedException e) {
			System.out.println("Interrupted Exception obtained. This indicates the test has failed to run within the time limit set at the suite level");
		} 
		
	}

	@Test
	public void timeTestTwo() throws InterruptedException {
		Thread.sleep(400);
		System.out.println("Time test method two - ran within timelines");
	}
	
	
}