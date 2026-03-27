package testng;

import org.testng.annotations.*;

public class testng  extends supertestng{

	@BeforeSuite
public void Beforesuite()
{
	System.out.println("Beforesuite");
	
}
	@AfterSuite
public void Aftersuite()
{
		System.out.println("Aftersuite");
		
	
}
@BeforeTest
public void BeforeeTest()
{
	System.out.println("BeforeeTest");
	
}
@AfterTest
public void AfterrTest()
{
	System.out.println("@AfterTest");
	
	
}
@BeforeClass
public void BeforeClass()
{
	System.out.println("BeforeClass");
	
}
@AfterClass
public void AfterClass()
{
	System.out.println("AfterClass");
	
}
@BeforeMethod
public void BeforeTestmethod()
{
	System.out.println("BeforeTestmethod");
	
}
@AfterMethod
public void AfterTestmethod()
{
	System.out.println("AfterTestmethod");
	
}
@Test
public void testt()
{
	System.out.println("testt");
	
}


}
