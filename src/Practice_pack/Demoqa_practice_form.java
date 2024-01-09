package Practice_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_practice_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==Practice==");
		System.setProperty("webdrivers.chrome.Drivers", "C:\\Users\\chpha\\Downloads\\chromedriver-win64\\chromeDriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://demoqa.com/automation-practice-form");
         driver.manage().window().maximize();
         driver.findElement(By.id("firstName")).sendKeys("kalayan");
         driver.findElement(By.id("lastName")).sendKeys("phaneendra");
         driver.findElement(By.id("userEmail")).sendKeys("phani9427@gmail.com");
         driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
         driver.findElement(By.id("userNumber")).sendKeys("7799637680");
//         driver.findElement(By.id("dateOfBirthInput")).sendKeys("22-04-2002");
//         driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
          driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("2-343,kunkulugunta,nekarikallu,Guntur");
	}

}
