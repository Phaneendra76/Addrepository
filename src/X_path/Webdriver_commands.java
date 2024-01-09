package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webdriver_commands {

	public static void main(String[] args) {
        
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://www.amazon.in/ap/signin");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.findElement(By.id("email")).sendKeys("9963382609");
		driver.findElement(By.name("pass")).sendKeys("Aswin@143");
//		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
		boolean display=driver.findElement(By.xpath("//label[text()=\"Female\"]")).isDisplayed();
		System.out.println("Element methos Displayed :"+display);
		boolean Enabled =driver.findElement(By.xpath("//div[text()=\"Mobile number or email address\"]")).isEnabled();
		System.out.println("Element method Enabled :"+Enabled);
		boolean selected =driver.findElement(By.xpath("//div[text()=\"Mobile number or email address\"]")).isSelected();
		System.out.println("Element method Slected "+selected);
       
	}

}
