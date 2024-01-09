package Practice_pack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_login {

	public static void main(String[] args) {
	System.out.println("Welcome to Gmail");
	System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\chpha\\Downloads\\ChromeDriver.exe"); 
	
	//driver.manage().window().maximize();

    WebDriver Driver = new ChromeDriver();
    Driver.get("http://Gmail.com");
    Driver.manage().window().maximize();
   Driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")).click();
    Driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.eKnrVb > div > div.Z6Ep7d > div > div.XOrBDc > div > div > div:nth-child(2) > div > ul > li:nth-child(2) > span.VfPpkd-StrnGf-rymPhb-b9t22c")).click();
   Driver.findElement(By.name("firstName")).sendKeys("kalyam");
   Driver.findElement(By.name("lastName")).sendKeys("chennamsetty");
   Driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/button/span")).click();
   Driver.findElement(By.id ("22")).isSelected();
   Driver.findElement(By.id("month")).isSelected();
   Driver.findElement(By.name("year")).isSelected();
   Driver.findElement(By.xpath("xxcVG")).click();
   
   
   
   
   
   
	}

}
