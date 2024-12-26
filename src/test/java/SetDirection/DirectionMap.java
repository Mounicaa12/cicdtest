package SetDirection;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Modeset;
import Pages.SortPlaces;
import Pages.Directionsdestination;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DirectionMap extends TestBase {
	//WebDriver driver;
	//@Test(priority=1)
//	public void launchlogin() throws InterruptedException
//	{
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		//Launch maps url
//		
//		driver.get("https://www.google.com/maps");
//		Thread.sleep(3000);
//		
//	}
//	@Test(priority=2)
//	public void SetMode() throws InterruptedException
//	{
//		String maptype="Default";
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@class='scFIyc']//following-sibling::button")).click();
//		
//		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='YJaiNd']//li//button//label"));
//		
//		String value=null;
//		String required="More";
//		
//		for (int i=0;i<options.size();i++)
//		{
//			
//			if(options.get(i).getText().toString().equalsIgnoreCase(required))
//			{
//				System.out.println("INTO LOOP");
//				Thread.sleep(1000);
//				int j=0;
//				j=i+1;
//				driver.findElement(By.xpath("(//ul[@class='YJaiNd']//li//button//label)["+j+"]")).click();
//				
//			}
//			else
//			{
//				System.out.println("ELSE "+options.get(i).getText().toString());
//				System.out.println("GIVEN ELSE"+required);
//			}
//		}
//		
//	
//		
//		driver.findElement(By.xpath("//*[@class=\"OROfM\"]//li//button//label[text()='"+maptype+"']")).click();
//		
//		
//		
//		
//		//after selecting mode checking is labels and gobal view are are disabled and enabled as per req
//		if(maptype.equalsIgnoreCase("default"))
//		{
//			WebElement labelstate=driver.findElement(By.xpath("//label[contains( text(),'Globe') ]//.."));
//			String  globalviewstate= labelstate.getAttribute("aria-checked");
//			System.out.println("global view state "+globalviewstate);
//			String condig="false";
//			Assert.assertEquals(globalviewstate, condig, "Success");
//	
//			WebElement labelstate1=driver.findElement(By.xpath("//label[contains( text(),'Label') ]//.."));
//			String  labelstatevalue= labelstate1.getAttribute("aria-checked");
//			labelstatevalue.toUpperCase();
//			System.out.println("global view state "+labelstatevalue);
//			String condil="false";
//			condil.toUpperCase();
//			Assert.assertEquals(labelstatevalue, condil,"Successlabel");
//		}
//	}
//	
//	
	
	
	@Test
	public void Settingmode() throws InterruptedException
	{
		
		Modeset.SetMode();
		Directionsdestination.finddirection();
		SortPlaces.sortplaces();
		
	}
	
//	@Test(priority=3)
//	public void quit()
//	{
//		driver.quit();
//	}

	
	
	
	
	
}
 