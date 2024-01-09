package Practice_pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_1 {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
//		Approach-1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/15/2025");//mm/dd/yyyy

		//Approach-2
		String year="2025";
		String month="April";
		String Day="22";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//input://input[@id="datepicker"]
		
		//select month and year
		while(true)
		{
			//current month
			String Mnth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();////span[@class="ui-datepicker-month"]
			//current year
			String yr=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();////span[@class="ui-datepicker-year"]
			//checking the condition with the given data
			if(yr.equals(year) && Mnth.equals(month)) //2023.equals(2025) && may.equals(april)
			{
				
				break;
			}
			//next button
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();////span[@class="ui-icon ui-icon-circle-triangle-e"]
			
		}
		//selecting day
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));////table[@class="ui-datepicker-calendar"]//td
		for(WebElement dt:alldates) {
			if(dt.getClass().equals(Day)) {
				dt.click();
				break;
			}
		}
	}

}
