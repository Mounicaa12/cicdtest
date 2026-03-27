package Handson;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandling {
	
	@Test
	public void win()
	{
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	JavascriptExecutor js=( JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,250)");
	WebElement ele=driver.findElement(By.xpath("//button[@id=\"tabButton\"]"));
	ele.click();
	String parent =driver.getWindowHandle();
	Set<String> windowss=driver.getWindowHandles();
	System.out.println(windowss.size());
	driver.switchTo().window(parent);
	
	
	

	}

}
