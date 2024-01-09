package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nopcommerese_2_Electronic {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		// Login

		driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();

		driver.findElement(By.id("Email")).sendKeys("chphani9427@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("Aswin@143");

		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();

		// ELECTRONICS==================

		driver.findElement(By.xpath("(//a[text()=\"Electronics \"])[1]")).click();

		driver.findElement(By.xpath("(//a[text()=\"Camera & photo \"])[3]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()=\"List\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()=\"Grid\"]")).click();

		Thread.sleep(1000);

		WebElement A2 = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

		Select Sortby2 = new Select(A2);

		Sortby2.selectByValue("10");

		Thread.sleep(2000);

		WebElement A3 = driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));

		Select Sortby3 = new Select(A3);

		Sortby3.selectByValue("9");

		driver.findElement(By.xpath("//img[@alt=\"Picture of Leica T Mirrorless Digital Camera\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()=\"Add your review\"]")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("AddProductReview_Title")).sendKeys("NICE PRODECT");
		Thread.sleep(1000);

		driver.findElement(By.id("AddProductReview_ReviewText")).sendKeys("GOOD");

		driver.findElement(By.xpath("//input[@id=\"addproductrating_3\"]")).click();

		// SUBMIT REVIEW
		driver.findElement(By.xpath("//button[text()=\"Submit review\"]")).click();
		driver.navigate().back();
		driver.navigate().back();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()=\"1 review(s)\"]")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//button[text()=\"Add to cart\"])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@class=\"arrow-down\"]")).click();

		Thread.sleep(1000);

		WebElement Ship = driver.findElement(By.xpath("//select[@id=\"CountryId\"]"));

		Select A4 = new Select(Ship);

		A4.selectByVisibleText("India");

		WebElement oth = driver.findElement(By.xpath("//select[@id=\"StateProvinceId\"]"));
		Select A5 = new Select(oth);
		A5.selectByVisibleText("Other");

		driver.findElement(By.id("ZipPostalCode")).sendKeys("522615");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()=\"Apply\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[text()=\"Add to wishlist\"])[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//button[text()=\"Add to compare list\"])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()=\"Email a friend\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("FriendEmail")).sendKeys("chphani946@gmail.com");
		driver.findElement(By.name("PersonalMessage")).sendKeys("BYE FOR ME BUDDY");

		driver.findElement(By.xpath("//button[text()=\"Send email\"]")).click();

		// SECOND ELEMENT========================

		driver.findElement(By.xpath("(//a[text()=\"Electronics \"])[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//a[text()=\"Cell phones \"])[3]")).click();

		Thread.sleep(1000);

		WebElement A6 = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

		Select sort3 = new Select(A6);

		sort3.selectByVisibleText("Price: High to Low");

		WebElement A7 = driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		Select display = new Select(A7);

		display.selectByVisibleText("3");

		driver.findElement(By.xpath("//img[@alt=\"Picture of Nokia Lumia 1020\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[text()=\"Add to cart\"])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[text()=\"Add to wishlist\"])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[text()=\"Add to compare list\"])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[text()=\"Email a friend\"])[1]")).click();
		Thread.sleep(2000);

		driver.navigate().back();

		// 3 ELEMENT

		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt=\"Picture of Portable Sound Speakers\"]")).click();

		driver.findElement(By.xpath("//button[text()=\"Add to cart\"]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()=\"Add to wishlist\"]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()=\"Add to compare list\"]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()=\"Email a friend\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("FriendEmail")).sendKeys("chphani946@gmail.com");

		Thread.sleep(1000);

		driver.findElement(By.id("PersonalMessage")).sendKeys("HII");

		driver.findElement(By.name("send-email")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("AddProductReview_Title")).sendKeys("Nothig");

		driver.findElement(By.id("AddProductReview_ReviewText")).sendKeys("Nothing Special");

		driver.findElement(By.id("addproductrating_3")).click();

		driver.findElement(By.xpath("//button[text()=\"Submit review\"]")).click();

	}

}
