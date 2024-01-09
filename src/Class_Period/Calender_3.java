package Class_Period;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();
		
		WebElement el_year=driver.findElement(By.xpath("//select[@class=\"datepick-month-year\"][2]"));
		Select se_year=new Select(el_year);
		se_year.selectByVisibleText("2004"); 
	
		
		
		
		WebElement el_month=driver.findElement(By.xpath("//*[contains(@title,\"the month\")]"));
		Select se_month=new Select(el_month);
		se_month.selectByIndex(2);
		
	
		
		List<WebElement> li=driver.findElements(By.xpath("//*[@class=\"datepick-month\"]//table//td"));
		
		for (WebElement day:li) {
			
			if (day.getText().equals("15")) {
				day.click();
				break;
			}
		}
		
	}

}
