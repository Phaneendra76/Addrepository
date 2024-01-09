package X_path;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Droop_Single_Multiple {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in) ;
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement A =driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]"));
	A.sendKeys("ladies hoodies for women");
	A.submit();
	WebElement B=driver.findElement(By.xpath("//div[@id=\"priceRefinements\"]"));
	System.out.println("ENTER THE MONEY");
	int c=sc.nextInt();
	for(int i=200;i<=c;i++)
	{
		if (i!=c)
		{
			break;
		}
	}
//	List<WebElement> ref=driver.findElements(By.xpath("//div[@class=\"a-section aok-relative s-image-tall-aspect\"]//img"));
//	ref.s
}

}
