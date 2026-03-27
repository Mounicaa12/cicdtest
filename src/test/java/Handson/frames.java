package Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {
	
	@Test
	public void framess()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		JavascriptExecutor js=( JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		WebElement fr=driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
		driver.switchTo().frame(fr);
		WebElement text=driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]"));
		driver.switchTo().defaultContent();
		
		System.out.println(""+text.getText());
	}

}
