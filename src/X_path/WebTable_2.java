package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_2 
{

	public static void main(String[] args) 
	{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().window().maximize();
        
        int Rows= driver.findElements(By.xpath("(//div[@dir=\"ltr\"])[2]//tr")).size();
        System.out.println(Rows);
        
        int col=driver.findElements(By.xpath("(//div[@dir=\"ltr\"])[2]//th")).size();
        System.out.println(col);
        
     String  num=  driver.findElement(By.xpath("//div[@class=\"post-outer\"]//tr[4]/td[3]")).getText();
     
     System.out.println(num);
     
       
      for (int r=2;r<=Rows;r++)
      {
    	  for(int c=1;c<=col;c++ )
    	  {
    		String RC= driver.findElement(By.xpath("//div[@class=\"post-outer\"]//tr["+r+"]/td["+c+"]")).getText();
    		System.out.println(RC);
    		
    	  }
    	  System.out.println();
      }
      
      
//      Finding the particular information
      
     for(int r=2;r<=Rows;r++)
      {
    	  
       String country= driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+r+"]/td[3]")).getText();
       if (country.equalsIgnoreCase("UK"))
       {
    	   String company= driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+r+"]/td[1]")).getText();
           System.out.println(company+ " : "+country);
       }
       
	 }
     
//       Finding the particular information
     
      for ( int A=2;A<=Rows;A++)
      {
          String Contact= driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+A+"]/td[2]")).getText();

    	  if(Contact.equalsIgnoreCase("Francisco Chang"))
    	  {
    	    	 String  company_1= driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+A+"]/td[1]")).getText();
                 System.out.println(Contact+" : "+company_1);
    	  }
      }
     
//      Finding the particular information
      
      for ( int B=2;B<=Rows;B++)
      {
          String Country_1= driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+B+"]/td[3]")).getText();

    	  if(Country_1.equalsIgnoreCase("Canada"))
    	  {
    	    	 String  company_2= driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+B+"]/td[1]")).getText();
                 System.out.println(Country_1+" : "+company_2);
    	  }
      }
      
     
	}
}
