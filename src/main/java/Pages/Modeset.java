package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.TestBase;

public class Modeset extends TestBase {

	public static void SetMode() throws InterruptedException {
		String maptype = "Default";
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='scFIyc']//following-sibling::button")).click();

		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='YJaiNd']//li//button//label"));

		String value = null;
		String required = "More";

		for (int i = 0; i < options.size(); i++) {

			if (options.get(i).getText().toString().equalsIgnoreCase(required)) {
				System.out.println("INTO LOOP");
				Thread.sleep(1000);
				int j = 0;
				j = i + 1;
				driver.findElement(By.xpath("(//ul[@class='YJaiNd']//li//button//label)[" + j + "]")).click();

			} else {
				System.out.println("ELSE " + options.get(i).getText().toString());
				System.out.println("GIVEN ELSE" + required);
			}
		}

		driver.findElement(By.xpath("//*[@class=\"OROfM\"]//li//button//label[text()='" + maptype + "']")).click();

		// after selecting mode checking is labels and gobal view are are disabled and
		// enabled as per req
		String Requiredview="default";
		
		if (maptype.equalsIgnoreCase(Requiredview)) {
			WebElement labelstate = driver.findElement(By.xpath("//label[contains( text(),'Globe') ]//.."));
			String globalviewstate = labelstate.getAttribute("aria-checked");
			System.out.println("global view state " + globalviewstate);
			String condig = "false";
			Assert.assertEquals(globalviewstate, condig, "Success");

			WebElement labelstate1 = driver.findElement(By.xpath("//label[contains( text(),'Label') ]//.."));
			String labelstatevalue = labelstate1.getAttribute("aria-checked");
			labelstatevalue.toUpperCase();
			System.out.println("global view state " + labelstatevalue);
			String condil = "true";
			condil.toUpperCase();
			Assert.assertEquals(labelstatevalue, condil, "Successlabel");
		}
		else  {
			WebElement labelstate = driver.findElement(By.xpath("//label[contains( text(),'Globe') ]//.."));
			String globalviewstate = labelstate.getAttribute("aria-checked");
			System.out.println("global view state " + globalviewstate);
			String condig = "false";
			Assert.assertEquals(globalviewstate, condig, "Success");

			WebElement labelstate1 = driver.findElement(By.xpath("//label[contains( text(),'Label') ]//.."));
			String labelstatevalue = labelstate1.getAttribute("aria-checked");
			labelstatevalue.toUpperCase();
			System.out.println("global view state " + labelstatevalue);
			String condil = "false";
			condil.toUpperCase();
			Assert.assertEquals(labelstatevalue, condil, "Successlabel");
		}
		
		//Close opened mode tab
		
		driver.findElement(By.xpath("//*[@class=\"OwXc3d\"]//header//button"));
		
	}

}
