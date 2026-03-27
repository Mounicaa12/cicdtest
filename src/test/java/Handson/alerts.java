package Handson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {
	@Test
	public void alertexc() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		JavascriptExecutor js=( JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText().toString());
	alert.accept();
		
	}

}
