package Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handson_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/checkbox");
		 JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down
	        js.executeScript("window.scrollBy(0, 1000)");
	        Thread.sleep(1000);
		WebElement we=driver.findElement(By.xpath("//span[@class=\"rct-text\"]//button"));
		we.click();
		 Thread.sleep(1000);
		WebElement ch1=driver.findElement(By.xpath("//input[@id=\"tree-node-desktop\"]//..//span[@class=\"rct-checkbox\"]"));
		if(ch1.isSelected())
		{
			System.out.println("already selected");
		}
		else
		{
			System.out.println("Selected ::");
			ch1.click();
			
		}
		//second
		if(ch1.isSelected())
		{
			System.out.println("already selected 2 so unselect");
			ch1.click();
		}
		else
		{
			System.out.println("Selected ::");
			ch1.click();
			
		}
		
		driver.quit();
		

	}

}
