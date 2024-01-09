package X_path;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_Demo1 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(" //input[@class=\"ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted\"]")).sendKeys("Narasaraopet");
		WebElement ref=driver.findElement(By.xpath(" //input[@class=\"ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted\"]"));
                ref.sendKeys("BZA");
                ref.submit();
		driver.findElement(By.xpath("//div[@class=\"ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all ui-dropdown-open\"]")).click();
		List<WebElement> quota=driver.findElements(By.xpath("//div[@class=\"ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all ui-dropdown-open\"]//li"));
		for (WebElement charani : quota)
		{
			if(charani.getText().equalsIgnoreCase("LOWER BERTH/SR.CITIZEN"));
			{
				charani.click();
			}
		}
		
		
	}
}
