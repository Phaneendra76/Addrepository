package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_4 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/webtables");
	driver.manage().window().maximize();
	driver.findElement(By.id("addNewRecordButton")).click();
	driver.findElement(By.id("firstName")).sendKeys("Phani");
	driver.findElement(By.id("lastName")).sendKeys("Kalyan");
	driver.findElement(By.id("userEmail")).sendKeys("chphani946@gmail.com");
	driver.findElement(By.id("age")).sendKeys("24");
	driver.findElement(By.id("salary")).sendKeys("15000");
	driver.findElement(By.id("department")).sendKeys("Testing");
	Thread.sleep(2000);
	driver.findElement(By.id("submit")).click();
	Thread.sleep(4000);
	
	
	//second method
	
	
	driver.findElement(By.id("addNewRecordButton")).click();
	driver.findElement(By.id("firstName")).sendKeys("Aswin");
	driver.findElement(By.id("lastName")).sendKeys("Kalyan");
	driver.findElement(By.id("userEmail")).sendKeys("chphani9427@gmail.com");
	driver.findElement(By.id("age")).sendKeys("12");
	driver.findElement(By.id("salary")).sendKeys("150000");
	driver.findElement(By.id("department")).sendKeys("Studing");
	Thread.sleep(2000);
	driver.findElement(By.id("submit")).click();
	Thread.sleep(4000);
	
	
	
	
}
}
