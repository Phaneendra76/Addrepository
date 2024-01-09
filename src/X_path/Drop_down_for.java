package X_path;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop_down_for {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
	driver.findElement(By.id("first"));
	List<WebElement> Aishu =driver.findElements(By.xpath("//select[@id=\"first\"]//option"));
	for(WebElement single:Aishu)
	{
		if(single.getText().equalsIgnoreCase("Iphone"))
		{
			single.click();
		}
	}
	driver.findElement(By.id("animals"));
	List<WebElement> Ammu =driver.findElements(By.xpath("//select[@id=\"animals\"]//option"));
	for(WebElement item:Ammu)
	{
		if(item.getText().equalsIgnoreCase("Avatar"))
		{
			item.click();
		}
	}
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
}
}
