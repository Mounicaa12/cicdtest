package Pages;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.TestBase;

public class Directionsdestination extends TestBase{

	
	public static void finddirection() throws InterruptedException
	{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		Thread.sleep(1000);
		WebElement searchlabel=driver.findElement(By.xpath("//*[@id='XmI62e']//div//label//..//..//input"));
		Thread.sleep(1000);
		searchlabel.click();
		
		ArrayList<String> places=new ArrayList<String>();
		
		//this input should be dynamic will do it in further nn
		String [] arr= {"chennai","hyderabad","adilabad","hanmakonda","vijayawada","jedcharla"};//now it is hard coded but will make it dynamic
		ArrayList<String> PlacesfromUI=new ArrayList();
		int noofplaces=arr.length;
		
		for (int i=0;i<noofplaces;i++)
		{
			places.add(i, arr[i]);
		}
		
		//entering first place
		System.out.println("Places 1st value "+places.get(1).toString());
		Thread.sleep(1000);
		searchlabel.sendKeys(places.get(1));
		//selecting first search result
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='zero-input']//..//div[@data-index='0']")).click();
		
		//clicked on direction
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-value='Directions']")).click();
		
		//Entering starting location
		Thread.sleep(1000);
		WebElement Startpoint=driver.findElement(By.xpath("//input[contains(@aria-label,'starting') or contains(@aria-label,'Starting')] "));
		Thread.sleep(1000);
		Startpoint.click();
		Thread.sleep(1000);
		Startpoint.sendKeys(places.get(0));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@id='sbsg50']//div[@role='row'])[1]")).click();
		Thread.sleep(3000);
		//Adding remaining places
		WebElement destinationbt=driver.findElement(By.xpath("//*[@id='zero-input']//..//button[@class='fC7rrc xiw3Pd']"));
		Thread.sleep(1000);
//		WebElement destination=driver.findElement(By.xpath("//input[contains(@aria-label,'destination')]"));
//		Thread.sleep(1000);
//		try {
//		WebElement remainplace=driver.findElement(By.xpath("(//*[@class='ZHeE1b ']//div[@role='row'])[1]"));
//		}
//		catch(Exception e)
//		{
//			
//		}
		Thread.sleep(1000);
		System.out.println("Places ########"+places.size());
		for(int i=2;i<places.size();i++)
		{
			Thread.sleep(2000);
			destinationbt.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[contains(@aria-label,'destination')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[contains(@aria-label,'destination')]")).sendKeys(places.get(i));
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class='ZHeE1b ']//div[@role='row'])[1]")).click();
			
		}
		
		
		
}
}