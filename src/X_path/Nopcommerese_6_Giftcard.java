package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nopcommerese_6_Giftcard {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

		driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();

		driver.findElement(By.id("Email")).sendKeys("chphani9427@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("Aswin@143");

		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/gift-cards\"])[1]")).click();

		WebElement SAJ = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

		Select SDJI = new Select(SAJ);

		SDJI.selectByValue("0");

		Thread.sleep(2000);

		SDJI.selectByValue("5");

		Thread.sleep(2000);

		SDJI.selectByValue("6");

		Thread.sleep(2000);

		SDJI.selectByValue("10");

		Thread.sleep(2000);

		SDJI.selectByValue("11");

		Thread.sleep(2000);

		SDJI.selectByValue("15");

		WebElement Hcl = driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));

		Select Sappa = new Select(Hcl);

		Sappa.selectByValue("9");

		Thread.sleep(2000);

		Sappa.selectByValue("6");

		Thread.sleep(2000);

		Sappa.selectByValue("3");

		driver.findElement(By.xpath("//a[@class=\"viewmode-icon list\"]")).click();

//		$ 100 Physical Gift Card

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/100-physical-gift-card\"])[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"giftcard_45_RecipientName\"]")).sendKeys("kanna");

		driver.findElement(By.xpath("//textarea[@id=\"giftcard_45_Message\"]")).sendKeys("Miss my Home..!");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-45\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-45\"]")).click();

		driver.navigate().back();

//		$ 50 Physical Gift Card

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/50-physical-gift-card\"])[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"giftcard_44_RecipientName\"]")).sendKeys("Ilove My ");

		driver.findElement(By.xpath("//textarea[@id=\"giftcard_44_Message\"]")).sendKeys("I love my  ");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-44\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-44\"]")).click();

		driver.navigate().back();

//		$ 25 virtual Gift Cards

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/25-virtual-gift-card\"])[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"giftcard_43_RecipientName\"]")).sendKeys("I love Songs");

		driver.findElement(By.xpath("//input[@id=\"giftcard_43_RecipientEmail\"]")).sendKeys("chphani946@gmail.com");

		driver.findElement(By.xpath("//textarea[@id=\"giftcard_43_Message\"]")).sendKeys("Kumari");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-43\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-43\"]")).click();

		driver.navigate().back();

	}

}
