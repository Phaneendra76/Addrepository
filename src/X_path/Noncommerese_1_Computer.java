package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Noncommerese_1_Computer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		// clicking the Register button

		driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();

		WebElement nothing2 = driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));

		nothing2.click();

		System.out.println(nothing2.isSelected());

		WebElement nothing3 = driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));

		System.out.println(nothing3.isSelected());

		driver.findElement(By.id("FirstName")).sendKeys("Phaneendra");

		driver.findElement(By.id("LastName")).sendKeys("chennamsetty");

		WebElement ref = driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));

		Select sc = new Select(ref);

		sc.selectByIndex(22);

		WebElement ref1 = driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));

		Select sc1 = new Select(ref1);

		sc1.selectByValue("4");

		WebElement ref2 = driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));

		Select sc2 = new Select(ref2);

		sc2.selectByVisibleText("2004");

		// company details

		Thread.sleep(2000);

		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("chphani9427@gmail.com");

		driver.findElement(By.id("Company")).sendKeys("CHARANI IT SOLUCTIONS");

		// options

		Thread.sleep(2000);

		WebElement nothing1 = driver.findElement(By.xpath("//input[@id=\"Newsletter\"]"));

		nothing1.click();

		System.out.println(nothing1.isSelected());

		// password

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Aswin@143");

		driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("Aswin@143");

		driver.findElement(By.xpath("//button[@name=\"register-button\"]")).click();

		System.out.println("REGIEASTION IS COMPLEATED");
//	      2.LOGIN

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();

		driver.findElement(By.id("Email")).sendKeys("chphani9427@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("Aswin@143");

		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();

		// computer
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();

		driver.findElement(By.xpath("(//a[text()=\"Desktops \"])[3]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt=\"Picture of Build your own computer\"]")).click();

		Thread.sleep(3000);

		// INSPECTING THE ELEMENT ==============

		WebElement com = driver.findElement(By.xpath("//select[@id=\"product_attribute_1\"]"));

		Select Processer = new Select(com);

		Processer.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");

		// RAM========

		WebElement com1 = driver.findElement(By.xpath("//select[@id=\"product_attribute_2\"]"));

		Select RAM = new Select(com1);

		RAM.selectByVisibleText("8GB [+$60.00]");

		Thread.sleep(2000);

		// HDD=========

		driver.findElement(By.id("product_attribute_3_6")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("product_attribute_3_7")).click();

		Thread.sleep(2000);

		// OS=============

		driver.findElement(By.id("product_attribute_4_9")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("product_attribute_4_8")).click();

		Thread.sleep(2000);

		// SOFTWARE==========

		driver.findElement(By.id("product_attribute_5_11")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("product_attribute_5_12")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("product_attribute_5_10")).click();

		Thread.sleep(2000);

		// ADD TO CARD=========

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]")).click();

		// ELEMENT NUMBER

		// TWO=============================================================================

		// NOTEBOOK==

		driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[text()=\"Notebooks \"])[3]")).click();

		Thread.sleep(2000);

		// CPU TYPE ==========

		driver.findElement(By.id("attribute-option-6")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("attribute-option-7")).click();

		Thread.sleep(2000);

		// MEMORY=========

		driver.findElement(By.id("attribute-option-8")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("attribute-option-9")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("attribute-option-10")).click();

		Thread.sleep(3000);

		// SORT BYY============
		WebElement s1 = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

		Select Sortby = new Select(s1);

		Sortby.selectByVisibleText("Created on");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt=\"Picture of HP Envy 6-1180ca 15.6-Inch Sleekbook\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-8\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-8\"]")).click();

		// SOFTWARE=====ELEMENT NUMBER THREE

		driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[text()=\"Software \"])[3]")).click();
		Thread.sleep(2000);

		// SORT BYEE==========

		WebElement A1 = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

		Select Sortby1 = new Select(A1);

		Thread.sleep(2000);

		Sortby1.selectByVisibleText("Created on");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//img[@alt=\"Picture of Sound Forge Pro 11 (recurring)\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-12\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()=\"Email a friend\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("FriendEmail")).sendKeys("chphani946@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.id("YourEmailAddress"));

		Thread.sleep(2000);

		driver.findElement(By.id("PersonalMessage")).sendKeys("HELLO BUDDY ");

		Thread.sleep(2000);

		driver.findElement(By.name("send-email")).click();

	}

}
