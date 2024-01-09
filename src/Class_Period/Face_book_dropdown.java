package Class_Period;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Face_book_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("webDriver.chrome.Driver", "C:\\\\Users\\\\chpha\\\\Downloads\\\\chromedriver-win64\\\\chromeDriver.exe");
   WebDriver l=new ChromeDriver();
   l.get("https://www.facebook.com/signup");
   l.findElement(By.name("firstname")).sendKeys("kalyan");
   l.findElement(By.name("lastname")).sendKeys("CH");
   l.findElement(By.name("reg_email__")).sendKeys("9963382609");
   l.findElement(By.name("reg_passwd__")).sendKeys("not for you");
    WebElement ref=l.findElement(By.xpath("//select[@id=\"day\"]"));
    Select sc=new Select(ref);
    sc.selectByIndex(22);
    WebElement ref2=l.findElement(By.xpath("//*[@id=\"month\"]"));
    Select sc1=new Select(ref2);
    sc1.selectByValue("3");
    WebElement ref3=l.findElement(By.xpath("//*[@id=\"year\"]"));
    Select sc2=new Select(ref3);
    sc2.selectByVisibleText("2004");
//   l.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
   l.findElement(By.name("//*[@id=\"u_0_5_uY\"]")).click();
  l.close();
  Thread.sleep(2000);
  l.quit();
	}

}
