package Practice_pack;

import java.util.List;
//import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calender_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter which year you need to want ");
		int year=2024;
		String month="April";
		String Day="22";
		String year_1=Integer.toString(year);
		int cy=2023;

		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
	
		while(true)
		{
	
			String Mnth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			
			String yr=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			if(yr.equals(year_1) && Mnth.equals(month)) 
			{
				
				break;
			}
		    if(year>cy)
			{
		    	if(yr.equals(year_1) && Mnth.equals(month)) 
				{
					
					break;
				}
		    	else
		    	{
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		    	}
			}
			else 
			{
				if (year<cy)
				{

			    	if(yr.equals(year_1) && Mnth.equals(month)) 
					{
						
						break;
					}
		
				else
				{
					driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
				}
			  }
			}
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
		for(WebElement dt:alldates) {
			if(dt.getClass().equals(Day)) {
				dt.click();
				break;
			}
		}

	}

	}}
