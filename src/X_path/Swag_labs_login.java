package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_labs_login {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement A =driver.findElement(By.id("user-name"));
		
		A.sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
//		driver.close();
	}

}
