package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nopcommerse_4_BOOK {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

		driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();

		driver.findElement(By.id("Email")).sendKeys("chphani9427@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("Aswin@143");

		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[@href=\"/digital-downloads\"])[1]")).click();

		WebElement sort = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

		Select by = new Select(sort);

		by.selectByValue("0");

		Thread.sleep(2000);

		by.selectByValue("5");

		Thread.sleep(2000);

		by.selectByValue("6");

		Thread.sleep(2000);

		by.selectByValue("10");

		Thread.sleep(2000);

		by.selectByValue("11");

		Thread.sleep(2000);

		by.selectByValue("15");

		WebElement dis = driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));

		Select play = new Select(dis);

		play.selectByValue("9");

		Thread.sleep(2000);

		play.selectByValue("6");

		Thread.sleep(2000);

		play.selectByValue("3");

		driver.findElement(By.xpath("//a[@class=\"viewmode-icon list\"]")).click();

//		Science & Faith

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/science-faith\"])[2]")).click();

		driver.findElement(By.xpath("//input[@id=\"addtocart_36_CustomerEnteredPrice\"]")).sendKeys("$ 50");

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-36\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-36\"]")).click();

		driver.navigate().back();

//		If You Wait (Donation)

		driver.findElement(By.xpath("(//a[@href=\"/if-you-wait-donation\"])[2]")).click();

		driver.findElement(By.xpath("//input[@id=\"addtocart_35_CustomerEnteredPrice\"]")).sendKeys("$ 50");

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-35\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-35\"]")).click();

		driver.navigate().back();

//		Night Vision

		driver.findElement(By.xpath("(//a[@href=\"/night-visions\"])[2]")).click();

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-34\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-34\"]")).click();

		driver.navigate().back();

	}

}
