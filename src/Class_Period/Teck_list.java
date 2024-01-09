package Class_Period;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teck_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webDriver.chrome.driver","C:\\Users\\chpha\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chrome.exe");

     WebDriver driver=new ChromeDriver();
     driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
     driver.manage().window().maximize();
     
    driver.findElement(By.xpath("//input[@name=\"alert\"]")).click();
    driver.switchTo().alert().accept();
    driver.findElement(By.cssSelector("input[name=\"confirmation\"]")).click();
    driver.switchTo().alert().dismiss();
    driver.findElement(By.name("prompt")).sendKeys("Hii");
	}

}
