package Practice_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight_Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver =new ChromeDriver();
     driver.get("https://www.goibibo.com/flights/");
     driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
     WebElement ref=driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[1]/div/div/p"));
     ref.click();
     ref.sendKeys("hyd");
     driver.findElement(By.xpath("//*[@id=\"autoSuggest-list\"]/li[1]/div")).click();
     
	}

}
