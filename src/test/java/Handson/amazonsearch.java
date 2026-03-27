package Handson;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonsearch {

	ExtentReports extent;
	ExtentTest test;
		@Test
		public void amazonsearch() {
			// TODO Auto-generated method stub
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			extent=Extentmanage.getInstance();//get instance
			test=extent.createTest("Login is functionality");	
			driver.get("https://www.amazon.in");
		test.pass("Login successfull");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("location.reload()");

		WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
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
			test.info("dynamic dropdown");
		if(opt.get(i).getText().toString().equals("hello kitty stationery"))
		{
			opt.get(i).click();
			//wait.until(ExpectedConditions.visibilityOf(we));
			System.out.println(driver.getTitle());
			
		}
		}
		System.out.println(driver.getCurrentUrl());
		
			driver.quit();
			extent.flush();

		}
}

