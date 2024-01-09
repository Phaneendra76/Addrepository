package Practice_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_class1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page"); 
		WebElement ref= driver.findElement(By.xpath("//input[@id=\"myTextInput2\"]"));
ref.clear();
ref.sendKeys("phani");
//driver.findElement(By.xpath("//input[@id=\"myTextInput2\"]")).clear();
//driver.findElement(By.xpath("//input[@id=\"myTextInput2\"]")).sendKeys("phani");
driver.findElement(By.xpath("//input[@id='radioButton2']")).click();
driver.findElement(By.id("placeholderText")).sendKeys("say nothing");
driver.findElement(By.id("myTextInput")).sendKeys("nothing");
driver.findElement(By.id("myTextarea")).sendKeys("nothing1");
driver.findElement(By.id("myTextarea")).sendKeys("nothing2");
driver.findElement(By.id("checkBox2")).click();
//driver.findElement(By.id("myLink1")).click();
//driver.findElement(By.id("myLink2")).click();
//driver.findElement(By.id("myLink3")).click();
driver.findElement(By.id("myLink4")).click();



	}

}
