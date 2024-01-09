package Practice_pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class Automaction_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\chpha\\Downloads\\chromedriver-win64\\chromeDriver.exe");
          WebDriver driver =new ChromeDriver();
          driver .get("https://testautomationpractice.blogspot.com/");
          driver.manage().window().maximize();
          driver.findElement(By.id("name")).sendKeys("Kalyan");
         Thread.sleep(2000);
          driver.findElement(By.id("email")).sendKeys("chphani946@gail.com");
         Thread.sleep(2000);
          driver.findElement(By.id("phone")).sendKeys("9963382609");
          Thread.sleep(1000);
          driver.findElement(By.id("textarea")).sendKeys("Kunkalagunta,Nekarikallu,Palanadu");
          driver.findElement(By.id("male")).click();
          Thread.sleep(2000);
          driver.findElement(By.id("wednesday")).click();
         Select dropdown = new Select (driver.findElement(By.id("country")));
         dropdown.selectByValue("india");
         Thread.sleep(3000);
         Select dropdown1= new Select (driver.findElement(By.id("colors")));
         dropdown1.selectByValue("green");
         
     driver.findElement(By.id("datepicker")).sendKeys("22/04/2002");
//     driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[2]/div[1]/button")).click();
        WebElement htmltable=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody"));
        List<WebElement> rows =htmltable.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr"));
      System.out.println(rows.size());
//        int rowscount =rows.size();
//       
//       List<WebElement> coloums=driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[1]/th"));
//       System.out.println(coloums.size());
//       int coloumscount =coloums.size();
//       for (int i=1;i<=rowscount;i++)
//       {
//    	   for(int j=1;j<=coloumscount;j++)
//    	   {
//    		 System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/table/tbody/tr[1]/th[1]")));  
//    	   }
//       }
     
	}

}
