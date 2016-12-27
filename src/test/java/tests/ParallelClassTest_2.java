package tests;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelClassTest_2 {

	@BeforeClass
    public void beforeClassinTest_2() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-class in Class_2. Thread id is: " + id);
    }
 
    @Test
    public void testMethodOneinTest_2() {
        long id = Thread.currentThread().getId();
        System.out.println("Sample test-method One in Class_2. Thread id is: " + id);
    }
 
    @Test
    public void testMethodTwoinTest_2() {
        long id = Thread.currentThread().getId();
        System.out.println("Sample test-method Two in Class_2. Thread id is: " + id);
    }
 
    @AfterClass
    public void afterClassinTest_2() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-class. Thread id is: " + id);
    }
	
}
