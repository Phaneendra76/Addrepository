package Class_Period;

import java.util.Date;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
    driver.manage().window().maximize();
    
    
    Date d1=new Date();
	String a=d1.toString();
	String[] b=a.split(" "); // Split date string by " "(space)  15 March 2004
	System.out.println(b);

	
	String c_year=b[5];
	String c_month=b[1];
	String e_month="Mar";
	String e_year="2025";
	String e_day="15";
	
    driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
    while(true)
    {
      if (c_month.contains(e_month)&&(c_year.equals(e_year)))
      {
    	  break;
      }
      else
      {
    	  driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
			c_month=driver.findElement(By.xpath("//span[contains(@class,\"datepicker-month\")]")).getText();
			c_year=driver.findElement(By.xpath("//span[contains(@class,\"datepicker-year\")]")).getText();

      }
       
       
    }
    
    List<WebElement> dates=driver.findElements(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//td"));
	
	for(WebElement day:dates) {
		if (day.getText().equals(e_day)) {
			day.click();
			break;
		}
		}
	}

}
