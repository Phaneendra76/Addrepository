package Practice_pack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_login {

	public static void main(String[] args) {
	System.out.println("Facebook login");
	System.setProperty("webdrivers.chrome.Drivers", "C:\\Users\\chpha\\Downloads\\chromedriver-win64\\chromeDriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://www.facebook.com/");
	Driver.manage().window().maximize();
	System.out.println(Driver.getTitle());
	String ref =Driver.findElement(By.tagName("h2")).getText();
	System.out.println(ref);
	}
}
