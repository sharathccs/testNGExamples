package tests;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "data-provider")
    public static Object[][] dataProviderMethod() 
    {
        return new Object[][] { 
        	{ "data one" }, 
        	{ "data two" },
        	{ "data three" },
        	{ "data four" },
        	{ "data five" }
        };
    }
	

}