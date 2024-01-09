package Practice_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       
       //personal details  //is Enabled   is Displayed
      WebElement nothing2=driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
      nothing2.click();
      System.out.println(nothing2.isSelected());
      WebElement nothing3=driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
      System.out.println(nothing3.isSelected());

       driver.findElement(By.id("FirstName")).sendKeys("Phaneendra");
       driver.findElement(By.id("LastName")).sendKeys("chennamsetty");
      WebElement ref= driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
      Select sc=new Select(ref);
      sc.selectByIndex(22);
      WebElement ref1= driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
      Select sc1=new Select(ref1);
      sc1.selectByValue("4");
      WebElement ref2= driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
      Select sc2=new Select(ref2);
      sc2.selectByVisibleText("2004");
      //company details
      driver.findElement(By.id("Email")).sendKeys("chphani9427@gmail.com");
      driver.findElement(By.id("Company")).sendKeys("CHARANI IT SOLUCTIONS");
      //options
           WebElement nothing1=driver.findElement(By.xpath("//input[@id=\"Newsletter\"]"));
           nothing1.click();
          System.out.println( nothing1.isSelected());
           
      //password
      driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Aswin@143");
      driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("Aswin@143");



      //Drop Down
      WebElement NA=driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
      NA.sendKeys("drop down");
      driver.findElement(By.xpath("//button[@class=\"button-1 search-box-button\"]")).click();


      driver.quit();

       
	}

}
