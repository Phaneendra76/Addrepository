package Practice_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blaze_demo {

	public static void main(String[] args) throws InterruptedException {
		
//	manageDriver.chrome.setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		WebElement ref=driver.findElement(By.xpath("//select[@name=\"fromPort\"]"));
		Select sc=new Select(ref);
		sc.selectByIndex(3);
		WebElement ref2=driver.findElement(By.xpath("//select[@name=\"toPort\"]"));
		Select sa=new Select(ref2);
		sa.selectByValue("London");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		driver.findElement(By.id("inputName")).sendKeys("Sharef");
		driver.findElement(By.id("address")).sendKeys("Heart");
		driver.findElement(By.id("city")).sendKeys("Sole");
		driver.findElement(By.id("state")).sendKeys("Body");
		driver.findElement(By.id("zipCode")).sendKeys("79143");
		WebElement ref3=driver.findElement(By.xpath("//select[@id=\"cardType\"]"));
		 Select sb=new Select(ref3);
		 sb.selectByVisibleText("American Express");
		driver.findElement(By.id("creditCardNumber")).sendKeys("82733912000");
		driver.findElement(By.id("creditCardMonth")).sendKeys("12");
		driver.findElement(By.id("creditCardYear")).sendKeys("2023");
		driver.findElement(By.id("nameOnCard")).sendKeys("Shareef naik");
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		
		
	//Second element
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
		
		driver.findElement(By.id("inputName")).sendKeys("phani");
		driver.findElement(By.id("address")).sendKeys("no more");
		driver.findElement(By.id("city")).sendKeys("is you buddy");
		driver.findElement(By.id("state")).sendKeys("your hear");
		driver.findElement(By.id("zipCode")).sendKeys("761432");
		WebElement ref4=driver.findElement(By.xpath("//select[@id=\"cardType\"]"));
		 Select sd=new Select(ref4);
		 sd.selectByVisibleText("Diner's Club");
		driver.findElement(By.id("creditCardNumber")).sendKeys("9090997787");
		driver.findElement(By.id("creditCardMonth")).sendKeys("11");
		driver.findElement(By.id("creditCardYear")).sendKeys("2033");
		driver.findElement(By.id("nameOnCard")).sendKeys("phani naik");
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.close();

		
		
		
		
		
		

	}

}
