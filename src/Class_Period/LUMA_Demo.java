package Class_Period;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LUMA_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("Create an Account")).click();

		driver.findElement(By.id("firstname")).sendKeys("phani");

		driver.findElement(By.id("lastname")).sendKeys("ch");

		WebElement B = driver.findElement(By.id("email_address"));

		B.sendKeys("sendKeys(\"phanich0001@gmail.com\")");

		driver.findElement(By.id("password")).sendKeys("Ammu@123");

		driver.findElement(By.id("password-confirmation")).sendKeys("Ammu@123");

		driver.findElement(By.xpath("(//span[text()=\"Create an Account\"])[1]")).click();

		String A = driver.findElement(By.xpath("//p[text()=\"phanich0001@gmail.com\"]")).getText();
		
		if (A.equalsIgnoreCase("phanich0001@gmail.com")) 
		{
			System.out.println("Your Gmail.is Currect");
		} else 
		{
			System.out.println("Once check your gmail");
		}
	}

}
