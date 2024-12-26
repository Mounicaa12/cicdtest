package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	@BeforeTest
	public void launchlogin() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launch maps url
		
		driver.get("https://www.google.com/maps");
		Thread.sleep(3000);
		
	}
//	@Ignore
//	@AfterTest
//	public void quit()
//	{
//		driver.quit();
//	}
}
