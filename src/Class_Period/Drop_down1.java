package Class_Period;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","C:\\\\Users\\\\chpha\\\\Downloads\\\\chromedriver-win64\\\\chromeDriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		WebElement ref=driver.findElement(By.xpath("//select[@id=\"first\"]"));
		Select sc=new Select(ref);
		sc.selectByIndex(3);
		Thread.sleep(2000);
		sc.selectByValue("Apple");
		Thread.sleep(1000);
		sc.selectByVisibleText("Google");
    	Thread.sleep(2000);
    	 
		WebElement ref1=driver.findElement(By.xpath("//select[@id=\"animals\"]"));
		Select sc1=new Select(ref1);
		sc1.selectByIndex(3);
		sc1.selectByValue(" big baby cat");
		sc1.selectByVisibleText("Avatar");
		
		WebElement ref2=driver.findElement(By.xpath("//select[@id=\"second\"]"));
		Select sc2=new Select(ref2);
		sc2.selectByIndex(2);
		sc2.selectByValue("donut");
		sc2.selectByVisibleText("Bonda");
		Thread.sleep(2000);
		sc2.deselectAll();
	    driver.close();
		
		
		
	}

}
