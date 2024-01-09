package Practice_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("X-Path Types");
     System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\chpha\\Downloads");
     WebDriver driver =new ChromeDriver();
     driver.get("https://demoqa.com/automation-practice-form");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//input[starts-with(@id,\"firstName\")]")).sendKeys("phaneendra");
     driver.findElement(By.xpath("//input[starts-with(@id,\"lastName\")]")).sendKeys("CH");
     driver.findElement(By.xpath("//input[contains(@id,\"userEmail\")]")).sendKeys("chphani9427@gmail.com");
     driver.findElement(By.xpath("//*[contains(@class,\"custom-control-label\")][1]")).click();
//     driver.findElement(By.xpath("//input[contains(@id,userNumber)][7]")).sendKeys("9963382609");
     driver.findElement(By.xpath("//input[starts-with(@placeholder,\"Mobile Number\")]")).sendKeys("9963382609");
    WebElement ref= driver.findElement(By.xpath("//input[starts-with(@id,\"dateOfBirthInput\")]"));
    ref.clear();
    ref.sendKeys("22-04-2002");
	}

}
