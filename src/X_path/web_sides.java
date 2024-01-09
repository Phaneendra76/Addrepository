package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_sides {
 public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	WebElement ref= driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]"));
	ref.sendKeys("realme 11 pro");
	ref.submit();
	
}
}
