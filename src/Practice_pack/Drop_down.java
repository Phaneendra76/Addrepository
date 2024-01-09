package Practice_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.edge.driver","C:\\Users\\chpha\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
//		EdgeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		WebElement drop_d=driver.findElement(By.xpath("//select[@id=\"first\"]"));
		Select sc=new Select(drop_d);
		sc.selectByIndex(1);
//		Thread.sleep(10000);
		sc.selectByValue("Apple");
//		Thread.sleep(10000);
		sc.selectByVisibleText("Yahoo");
		

	}

}
