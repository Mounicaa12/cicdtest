package Handson;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon  {
	WebDriver driver;
	@Test
	public void search() throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("location.reload()");
//		WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
//		wait.until(ExpectedConditions.elementToBeClickable(search));
//		search.click();
//		Actions action =new Actions(driver);
//		action.keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).build().perform();
		
		//static dropdown
		
//		WebElement we=driver.findElement(By.xpath("//select[@title=\"Search in\"]"));
//		Select se=new Select(we);
//		List<WebElement> str=se.getOptions();
//		for (int i=0;i<str.size();i++)
//		{
//			System.out.println(str.get(i).getText());
//		}
	WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	screenshots.capture(driver);
	wait.until(ExpectedConditions.elementToBeClickable(search));
	search.click();
	search.sendKeys("hello");
	WebElement we=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	List<WebElement> opt = wait.until(
		    ExpectedConditions.visibilityOfAllElementsLocatedBy(
		        By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']")
		    )
		);	
	
	for(int i=0;i<opt.size();i++)
	{
		System.out.println(opt.get(i).getText().toString());
	if(opt.get(i).getText().toString().equals("hello kitty stationery"))
	{
		opt.get(i).click();
		//wait.until(ExpectedConditions.visibilityOf(we));
		System.out.println(driver.getTitle());
		
	}
	}
	System.out.println(driver.getCurrentUrl());
	
		driver.quit();

	}
	
	
}
