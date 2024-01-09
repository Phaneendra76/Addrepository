package Class_Period;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Regiester_18 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WedDriver.chrome.Driver", "C:\\Users\\chpha\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chrome.exe");
		WebDriver sc=new ChromeDriver();
		sc.get("https://demo.automationtesting.in/Register.html");
		sc.manage().window().maximize();
		sc.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("NAruto");
		sc.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Sakura");
		sc.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("nothing andi meku ravali eni unta maa entaki randi ");
		sc.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("chphnai946@gamil.com");
		sc.findElement(By.xpath("//input[@type=\"tel\"][1]")).sendKeys("7799637680");
		sc.findElement(By.xpath("//input[@name=\"radiooptions\"][1]")).click();
        sc.findElement(By.xpath("//input[starts-with(@id,\"checkbox1\")]")).click();
      sc.findElement(By.xpath("//input[starts-with(@id,\"checkbox3\")]")).click(); 
    sc.findElement(By.xpath("//div[@id=\"msdd\"]"));
      WebElement   ns=sc.findElement(By.xpath("//*[@id=\"Skills\"]"));
      Select s1 =new Select(ns);
      s1.selectByVisibleText("Client Server");
      Thread.sleep(2000);
      s1.selectByValue("Linux");
      s1.selectByIndex(10);
      
       WebElement sg=sc.findElement(By.xpath("//*[@id=\"country\"]"));
       Select s6=new Select(sg);
       s6.selectByIndex(5);
       Thread.sleep(2000);
       s6.selectByValue("New Zealand");
       Thread.sleep(2000);
       s6.selectByVisibleText("United States of America");
      
         WebElement jp=sc.findElement(By.xpath("//*[@id=\"yearbox\"]")); 
         Select s3= new Select(jp);
         s3.selectByValue("2004");
          WebElement gj=  sc.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
           Select s4 =new Select(gj);
           s4.selectByIndex(4);
           WebElement  sp=sc.findElement(By.xpath("//*[@id=\"daybox\"]"));
            Select s5=new Select(sp);
            s5.selectByVisibleText("22");
      
      
      WebElement kp = sc.findElement(By.xpath("//*[@id=\"countries\"]"));
              Select s2=new Select(kp);
              s2.selectByVisibleText("Select Country");
              sc.findElement(By.id("firstpassword")).sendKeys("password");
              sc.findElement(By.id("secondpassword")).sendKeys("password");
              Thread.sleep(4000);
              sc.close();
      
      
      
      
	}

}
