package Class_Period;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	  System.setProperty("WedDriver.chrome.Driver", "C:\\Users\\chpha\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chrome.exe");
      WebDriver ref= new ChromeDriver();
      ref.get("https://demo.automationtesting.in/Alerts.html");
      ref.manage().window().maximize();
      ref.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
      ref.switchTo().alert().accept();
      Thread.sleep(2000);
      ref.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
      Thread.sleep(1000);
      ref.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
      ref.switchTo().alert().accept();
      Thread.sleep(2000);
      ref.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();

      ref.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
      ref.switchTo().alert().dismiss();
      Thread.sleep(2000);
      ref.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
      ref.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
      ref.switchTo().alert().accept();
      Thread.sleep(2000);
      ref.close();
      
	}

}
