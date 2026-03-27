package Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
//		driver.get("https://demoqa.com/forms");
//		driver.navigate().refresh();
//		String currenturl=driver.getCurrentUrl();
//		System.out.println(currenturl.toString());
//		String pagesrc=driver.getPageSource();
//		System.out.println(pagesrc.toString());
//		String title=driver.getTitle();
//		System.out.println(title.toString());
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement we=driver.findElement(By.id("userName"));
		we.sendKeys("Mounika");
		WebElement w=driver.findElement(By.id("userEmail"));
		w.sendKeys("xyz@gmail.com");
		
		String s=we.getAttribute("value");
		System.out.println("name entered"+s.toString());
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.get("https://demoqa.com/forms");
		//driver.close();
		driver.findElement(By.xpath("//button[text()=\"Submit\"]"));
		driver.quit();
		

	}

}
