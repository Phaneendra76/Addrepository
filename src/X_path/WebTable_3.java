package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_3 
{

	public static void main(String[] args) 
	{
       WebDriver driver=new ChromeDriver();
       driver.get("https://cosmocode.io/automation-practice-webtable/");
       
      int rows= driver.findElements(By.xpath("//table[@id=\"countries\"]//tr")).size();
      System.out.println(rows);
      
     int col= driver.findElements(By.xpath("//table[@id=\"countries\"]//td")).size();
     System.out.println(col);
     
     
     for (int r=2;r<=rows;r++)
     {
    	String Language= driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td[5]")).getText();
    	if(Language.equals("English"))
    	{
    		
    		driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td[1]//input")).click();
    		String country=driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td[2]")).getText();
    	
    		System.out.println(Language + " : "+country);
    	}
     }
		
	}

}
