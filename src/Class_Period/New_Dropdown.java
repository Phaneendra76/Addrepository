package Class_Period;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class New_Dropdown {
 
	public static void main(String args[])
	{
		System.setProperty("WedDriver.chrome.Driver", "C:\\Users\\chpha\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chrome.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
			 WebElement ref=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
			 Select sc=new Select(ref);
			 sc.selectByIndex(7);
			 sc.selectByValue("ASM");
			 sc.selectByVisibleText("Colombia");
			
	}
}