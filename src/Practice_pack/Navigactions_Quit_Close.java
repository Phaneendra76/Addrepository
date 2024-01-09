package Practice_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigactions_Quit_Close {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webDriver.driver.chrome", "C:\\Users\\chpha\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chrome.exe");
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.facebook.com/login/");
    driver.manage().window().maximize();
    driver.findElement(By.partialLinkText("Sign up for Facebook")).click();

	driver.findElement(By.name("firstname")).sendKeys("phaneendra");
	driver.findElement(By.name("lastname")).sendKeys("chennansetty");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys("9963382609");
	driver.findElement(By.name("reg_passwd__")).sendKeys("9963382609");
	driver.findElement( By.id("day")).sendKeys("22");
	driver.findElement(By.id("month")).sendKeys("April");
	driver.findElement(By.id("year")).sendKeys("2002");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(5000);
	driver.navigate().to("https://www.amazon.in/alm/storefront?almBrandId=ctnow&ref_=nav_cs_fresh");
	
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	driver.close();
	Thread.sleep(2000);
	driver.quit();
	
		}
	}


