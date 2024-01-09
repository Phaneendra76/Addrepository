package Practice_pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WedDriver.chrome.Driver", "C:\\Users\\chpha\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chrome.exe");
     WebDriver driver =new ChromeDriver();
     driver.get("https://demoqa.com/alerts");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
     driver.switchTo().alert().accept();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
     Thread.sleep(5000);
     driver.switchTo().alert().accept();
     Thread.sleep(2000);

     driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
     driver.switchTo().alert().accept();
     Thread.sleep(2000);

     driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
     driver.switchTo().alert().dismiss();
     Thread.sleep(2000);

//      driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
     driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
     Alert ref=driver.switchTo().alert();
    String retrived_from_alert=ref.getText();
    System.out.println(retrived_from_alert);
    ref.sendKeys("hii");
    ref.accept();
//    driver.switchTo().alert().sendKeys("Hii");
     
     
		
	}

}
