package tests;

import org.testng.annotations.Test;

public class TestWithData {

	@Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
    public void testMethod(String data) 
    {
        System.out.println("Data is: " + data);
    }

}