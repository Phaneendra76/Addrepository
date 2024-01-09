package Class_Period;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Degree_application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.Driver", "C:\\Users\\chpha\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chrome.exe");
          WebDriver driver  =new ChromeDriver();
          driver.get("https://www.ascdegreecollege.ac.in/degree-application-form/");
          driver.manage().window().maximize();
          driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_0\"]")).sendKeys("phani");
          driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_0-middle\"]")).sendKeys("kumar");
          driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_0-last\"]")).sendKeys("ch");
          driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_5\"]")).sendKeys("22-04-04");
//          driver.findElement(By.xpath("//input[@placeholder=\"Vijayanagar, Bangalore\"]")).sendKeys("Guntur");//element not interactable
          driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_7\"]")).sendKeys("Hindu");//element not interactable
          driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_8\"]")).sendKeys("OC");//element not interactable
          driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_1\"]")).sendKeys("chphani946@gmail.com");//element not interactable
//          driver.findElement(By.xpath("wpforms-11388-field_2")).sendKeys("tnx");//element not interactable
	}

}
