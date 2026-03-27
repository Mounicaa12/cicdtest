package Mockassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mockass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://healthapp.yaksha.com/");
		WebElement login=driver.findElement(By.xpath("//input[@id=\"username_id\"]"));
		WebElement passcode=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		WebElement submit=driver.findElement(By.xpath("//button[@id=\"login\"]"));
		login.sendKeys("admin");
		passcode.sendKeys("pass123");
		submit.click();
//		String title=driver.getTitle();
//		Assert.assertEquals("DanpheHealth", title);
//		
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
		
		
		///////222222222////////
		
		
		WebElement billing =driver.findElement(By.xpath("(//span[text()=\"Billing\" ])[1]"));
		billing.click();
		Thread.sleep(1000);
		
		WebElement startnew1=driver.findElement(By.xpath("//h5[text()=\"New-1 \"]"));
		startnew1.click();
		Thread.sleep(1000);
		
		String sear=driver.getTitle();
		System.out.println("sear"+sear);
		
		////3///////
		WebElement searchfield=driver.findElement(By.xpath("//input[@id=\"srch_PatientList\"]"));
		searchfield.click();
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.ALT).sendKeys("n").keyUp(Keys.ALT).build().perform();
	WebElement form=driver.findElement(By.xpath("//span[text()=\"Add New Patient\"]"));
System.out.println("form value"+form.getText());
////4/////

WebElement Middlen=driver.findElement(By.xpath("//label[@for=\"newPatFirstName\"]"));
Assert.assertEquals(true, Middlen.isDisplayed());
Middlen.isDisplayed();

////5////
////6////
WebElement drop=driver.findElement(By.xpath("//select[@id=\"ddlCountry\"]"));

Select select =new Select (drop);

select.selectByValue("78");

String count=select.getFirstSelectedOption().getText();
System.out.println("count"+count);

		driver.quit();
	}

}
