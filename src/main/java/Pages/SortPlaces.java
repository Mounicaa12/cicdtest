package Pages;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.TestBase;

public class SortPlaces extends TestBase{
	public static void sortplaces() throws InterruptedException
	{
		String [] arr={"chennai","hyderabad","adilabad","hanamkonda","vijayawada","jadcharla"};//now it is hard coded but will make it dynamic
		//Arrays.sort(arr);
		//System.out.println("Sorted.................."+Arrays.toString(arr) );
		
		ArrayList<String> sorted=new ArrayList();
		int noofplaces=arr.length;
		int j;
		int count=0;
		String s=null;
		String[] uilist;
		ArrayList <WebElement> enteredpl=(ArrayList<WebElement>)driver.findElements(By.xpath("//*[@class='sbib_b']"));
		
		WebElement w=driver.findElement(By.xpath("(//input[contains(@aria-label,'Destination')])[1]"));
		String s1=w.getAttribute("aria-label");
		
	System.out.println("attribute value :: "+w.getAttribute("aria-label")+s1.length());
	//====================================================================================================
	
	for(int i=0;i<enteredpl.size();i++)
	{

		int m=0;
		if(i==0)
		{
			
			String st=driver.findElement(By.xpath("//input[contains(@aria-label,'starting') or contains(@aria-label,'Starting')] ")).getAttribute("aria-label");
			uilist=st.split(" ");
			while(m<uilist.length)
			{
			    if (uilist[m].toUpperCase().contains(arr[i].toUpperCase()))
			    {
			    	System.out.println(";;;;"+uilist[m].toString());
			    	sorted.add(i, uilist[m].toString());
			    }
			    m++;
			}
			
		}
		else
		{
			
			String st=driver.findElement(By.xpath("(//input[contains(@aria-label,'destination') or contains(@aria-label,'Destination')])["+i+"]")).getAttribute("aria-label");
			uilist=st.split(" ");
			while(m<uilist.length)
			{
			    if (uilist[m].toUpperCase().contains(arr[i].toUpperCase()))
			    {
			    	System.out.println(";;;;"+uilist[m].toString());
			    	sorted.add(i, uilist[m].toString());
			    }
			    m++;
			}
		}
		uilist=null;
	} 
	System.out.println("Yet to sort list : : "+sorted.toString());
	Arrays.sort(arr);
			for (int k=0;k<arr.length;k++)
			{
				for (int i=0;i<sorted.size();i++)//sorted array
				{
					if (sorted.get(i).toUpperCase().contains(arr[k].toUpperCase()))
					{
						if(k==arr.length-1)
						{
						int o=i+1;
						int p=k+1;
						//WebElement we1=driver.findElement(By.xpath("((//*[@class='sbib_b'])//..//..//preceding-sibling::div[@data-tooltip='Drag to reorder'])["+o+"]"));
						WebElement we1=driver.findElement(By.xpath("//input[contains(@aria-label,'"+sorted.get(i)+"')]//..//..//..//preceding-sibling::div//div[@class='PLEQOe lECG9c']"));
						System.out.println("P va;ue "+p);
						WebElement we2=driver.findElement(By.xpath("//div[@jslog='26250']"));
						Actions a=new Actions(driver);
						a.dragAndDrop(we1, we2).build().perform();
						}
						else
						{
							int o=i+1;
							int p=k+1;
							//WebElement we1=driver.findElement(By.xpath("((//*[@class='sbib_b'])//..//..//preceding-sibling::div[@data-tooltip='Drag to reorder'])["+o+"]"));
							WebElement we1=driver.findElement(By.xpath("//input[contains(@aria-label,'"+sorted.get(i)+"')]//..//..//..//preceding-sibling::div//div[@class='PLEQOe lECG9c']"));
							System.out.println("P va;ue "+p);
							WebElement we2=driver.findElement(By.xpath("((//*[@class='sbib_b'])//..//..//preceding-sibling::div[@data-tooltip='Drag to reorder'])["+p+"]"));
							Actions a=new Actions(driver);
							a.dragAndDrop(we1, we2).build().perform();
						}
						
						
					}
				}
			}
//			if(count>0) {
//				Actions a=new Actions(driver);
//				System.out.println("i :: "+i+"j :: "+j);
//				int k=i+1;
//				int l=j+1;
//				WebElement we=driver.findElement(By.xpath("//*[@class='JuLCid']"));
//				
//						@Nullable String scrollHeight = (we.getAttribute("scrollHeight"));
//						@Nullable String offsetHeight = (we.getAttribute("offsetHeight"));
//						System.out.println("SCROLLHEIGHT"+scrollHeight);
//						System.out.println("offsetHeight"+offsetHeight);
//						//Boolean isScrollable = scrollHeight.;
//						//we.sendKeys(Keys.PAGE_UP);
//				System.out.println(Arrays.toString(arr)); 
//				Thread.sleep(2000);
//				WebElement we1=driver.findElement(By.xpath("((//*[@class='sbib_b'])//..//..//preceding-sibling::div[@data-tooltip='Drag to reorder'])["+ l +"]"));
//				Thread.sleep(2000);
//				System.out.println("we1111"+we1);
//				WebElement we2=driver.findElement(By.xpath("((//*[@class='sbib_b'])//..//..//preceding-sibling::div[@data-tooltip='Drag to reorder'])["+k+"]"));
//				Thread.sleep(2000);
//				System.out.println("we1111"+we2);
//				a.dragAndDrop(we1, we2).build().perform();
//				count=0;
//				}	
	//	}
		//}
		
		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[text()='Copy link']")).click();
//		driver.get("https://web.whatsapp.com");
//		Thread.sleep(40000);
//		driver.findElement(By.xpath("//span[contains(@title,'Gnani')]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@aria-placeholder='Type a message']")).click();
//		driver.findElement(By.xpath("//*[@aria-placeholder='Type a message']")).sendKeys(Keys.CONTROL,"v");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//*[@data-icon='send']")).click();
//		Thread.sleep(1000);
//		System.out.println("sorted : "+Arrays.toString(arr));
}
}