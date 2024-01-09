package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nopcommerese_5_Jewerly {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

		driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();

		driver.findElement(By.id("Email")).sendKeys("chphani9427@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("Aswin@143");

		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/jewelry\"])[1]")).click();

		WebElement Simha = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

		Select Dhamayanthi = new Select(Simha);

		Dhamayanthi.selectByValue("0");

		Thread.sleep(2000);

		Dhamayanthi.selectByValue("5");

		Thread.sleep(2000);

		Dhamayanthi.selectByValue("6");

		Thread.sleep(2000);

		Dhamayanthi.selectByValue("10");

		Thread.sleep(2000);

		Dhamayanthi.selectByValue("11");

		Thread.sleep(2000);

		Dhamayanthi.selectByValue("15");

		WebElement KA = driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));

		Select Aishu = new Select(KA);

		Aishu.selectByValue("9");

		Thread.sleep(2000);

		Aishu.selectByValue("6");

		Thread.sleep(2000);

		Aishu.selectByValue("3");

		driver.findElement(By.xpath("//a[@class=\"viewmode-icon list\"]")).click();

//		Vintage Style Engagement Ring

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/vintage-style-engagement-ring\"])[2]")).click();

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-42\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-42\"]")).click();

		driver.navigate().back();

//		Flower Girl Bracelet

		driver.findElement(By.xpath("(//a[@href=\"/flower-girl-bracelet\"])[2]")).click();

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-41\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-41\"]")).click();

		driver.navigate().back();

//		Elegant Gamestone-Necklace (Rental)

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/elegant-gemstone-necklace-rental\"])[2]")).click();

		driver.findElement(By.xpath("//input[@id=\"rental_start_date_40\"]")).sendKeys("04/06/2002");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"rental_end_date_40\"]")).sendKeys("04/06/2002");

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-40\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-40\"]")).click();

		driver.navigate().back();

	}

}
