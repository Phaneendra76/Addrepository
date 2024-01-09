package Practice_pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice_1 
{
public static void main(String[] args) throws InterruptedException
 {
	System.out.println("Drop down");
	System.setProperty("webDriver.Edge.driver", "C:\\Users\\chpha\\Downloads\\edgedriver_win64\\Edge.exe");
	WebDriver driver =new EdgeDriver();
	driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	driver.findElement(By.id("country-list")).click();
	List<WebElement> ref= driver.findElements(By.xpath("//select[@name=\"country\"]//option"));
	for (WebElement single:ref)
	{
		if(single.getText().equalsIgnoreCase("India"))
		{
			Thread.sleep(2000);
			single.click();
		}
	}
	driver.findElement(By.id("state-list")).click();
	
	List<WebElement> ref_1= driver.findElements(By.xpath("//select[@name=\"state\"]//option"));
	for (WebElement singl:ref_1)
	{
		if(singl.getText().equalsIgnoreCase("Tamil Nadu"))
		{
			Thread.sleep(2000);
			singl.click();
		}
	}
 }
}
