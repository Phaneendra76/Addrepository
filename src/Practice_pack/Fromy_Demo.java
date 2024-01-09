package Practice_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fromy_Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/autocomplete");

//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		
//		driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("kphb");
//		driver.findElement(By.xpath("//input[@id=\"street_number\"]")).sendKeys("LIG_408");
//		driver.findElement(By.xpath("//input[@id=\"route\"]")).sendKeys("KPHB 3Line Near cups");
//		driver.findElement(By.xpath("//input[@id=\"locality\"]")).sendKeys("Hyderbad");
//		driver.findElement(By.xpath("//input[@id=\"administrative_area_level_1\"]")).sendKeys("Telangana");
//		driver.findElement(By.xpath("//input[@id=\"postal_code\"]")).sendKeys("500085");
//		driver.findElement(By.xpath("//input[@id=\"country\"]")).sendKeys("India");
		
		//Buttons
		driver.navigate().to("https://formy-project.herokuapp.com/buttons");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.xpath("//button[text()='Primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[1]")).click();
	
		
     //DropDown
//		driver.navigate().to("https://formy-project.herokuapp.com/dropdown");
//		System.out.println(driver.getCurrentUrl()); 
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//button[@id=\"dropdownMenuButton\"]")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.quit();


 
		
	}

}
