package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nopcommerese_3_APPAREL {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("(//a[text()=\"Digital downloads \"])[1]")).click();

		driver.findElement(By.xpath("//img[@alt=\"Picture of Science & Faith\"]")).click();

		Thread.sleep(2000);

//		Apparel

		driver.findElement(By.xpath("(//a[@href=\"/apparel\"])[1]")).click();

//		Shoes

		driver.findElement(By.xpath("(//a[@href=\"/shoes\"])[3]")).click();

		driver.findElement(By.xpath("//input[@id=\"attribute-option-14\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"attribute-option-15\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"attribute-option-16\"]")).click();

		WebElement Ish = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

		Select Aish = new Select(Ish);

		Aish.selectByValue("0");

		Thread.sleep(2000);

		Aish.selectByValue("5");

		Thread.sleep(2000);

		Aish.selectByValue("6");

		Thread.sleep(2000);

		Aish.selectByValue("10");

		Thread.sleep(2000);

		Aish.selectByValue("11");

		Thread.sleep(2000);

		Aish.selectByValue("15");

		WebElement Ishuu = driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));

		Select Vennela = new Select(Ishuu);

		Vennela.selectByValue("9");

		Thread.sleep(2000);

		Vennela.selectByValue("6");

		Thread.sleep(2000);

		Vennela.selectByValue("3");

		driver.findElement(By.xpath("//a[@class=\"viewmode-icon list\"]")).click();

//		Nike

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/nike-sb-zoom-stefan-janoski-medium-mint\"])[2]")).click();

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-26\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-26\"]")).click();

		driver.navigate().back();

//		Adidas

		driver.findElement(By.xpath("(//a[@href=\"/adidas-consortium-campus-80s-running-shoes\"])[2]")).click();

		WebElement ize = driver.findElement(By.xpath("//select[@id=\"product_attribute_9\"]"));

		Select sc_1 = new Select(ize);

		sc_1.selectByValue("0");

		Thread.sleep(2000);

		sc_1.selectByValue("21");

		Thread.sleep(2000);

		sc_1.selectByValue("22");

		Thread.sleep(2000);

		sc_1.selectByValue("23");

		Thread.sleep(2000);

		sc_1.selectByValue("24");

		driver.findElement(By.xpath("(//span[@class=\"attribute-square\"])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[@class=\"attribute-square\"])[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[@class=\"attribute-square\"])[3]")).click();

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-25\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-25\"]")).click();

		driver.navigate().back();

//		Nike Floral

		driver.findElement(By.xpath("(//a[@href=\"/nike-floral-roshe-customized-running-shoes\"])[2]")).click();

		WebElement Size = driver.findElement(By.xpath("//select[@id=\"product_attribute_6\"]"));

		Select Sc = new Select(Size);

		Sc.selectByValue("0");

		Thread.sleep(2000);

		Sc.selectByValue("13");

		Thread.sleep(2000);

		Sc.selectByValue("14");

		Thread.sleep(2000);

		Sc.selectByValue("15");

		Thread.sleep(2000);

		Sc.selectByValue("16");

		WebElement colour = driver.findElement(By.xpath("//select[@id=\"product_attribute_7\"]"));

		Select col = new Select(colour);

		col.selectByValue("0");

		Thread.sleep(2000);

		col.selectByValue("17");

		Thread.sleep(2000);

		col.selectByValue("18");

		driver.findElement(By.xpath("(//span[@class=\"attribute-square\"])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[@class=\"attribute-square\"])[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//BUTTON[@id=\"add-to-cart-button-24\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-24\"]")).click();

		driver.navigate().back();

//		Clothes

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/clothing\"])[3]")).click();

		WebElement ID = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

		Select SJ = new Select(ID);

		SJ.selectByValue("0");

		Thread.sleep(2000);

		SJ.selectByValue("5");

		Thread.sleep(2000);

		SJ.selectByValue("6");

		Thread.sleep(2000);

		SJ.selectByValue("10");

		Thread.sleep(2000);

		SJ.selectByValue("11");

		Thread.sleep(2000);

		SJ.selectByValue("15");

		WebElement frnds = driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));

		Select MP = new Select(frnds);

		MP.selectByValue("9");

		Thread.sleep(2000);

		MP.selectByValue("6");

		Thread.sleep(2000);

		MP.selectByValue("3");

		driver.findElement(By.xpath("//a[@class=\"viewmode-icon list\"]")).click();

//		Levi's Jeans

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/levis-511-jeans\"])[2]")).click();

		Thread.sleep(2000);

		String quanti = driver.findElement(By.xpath("//table[@class=\"prices-table\"]//tr[1]//td[4]")).getText();

		System.out.println("Quantity :" + quanti);

		String Prize = driver.findElement(By.xpath("//table[@class=\"prices-table\"]//tr[2]//td[4]")).getText();

		System.out.println("Price :" + Prize);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-30\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-30\"]")).click();

		driver.navigate().back();

//		Custom T- Shirt

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/custom-t-shirt\"])[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"product_attribute_12\"]")).sendKeys("James Bond 007");

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-29\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-29\"]")).click();

		driver.navigate().back();

//		Oversized Women T-shirt

		driver.findElement(By.xpath("(//a[@href=\"/oversized-women-t-shirt\"])[2]")).click();

		String Quantity = driver.findElement(By.xpath("//table[@class=\"prices-table\"]//tr[1]//td[4]")).getText();

		System.out.println("Quantity :" + Quantity);

		String Prise = driver.findElement(By.xpath("//table[@class=\"prices-table\"]//tr[2]//td[4]")).getText();

		System.out.println("Price :" + Prise);

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-28\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-28\"]")).click();

		driver.navigate().back();

//		Accessories

		driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[3]")).click();

		WebElement mn = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

		Select op = new Select(mn);

		op.selectByValue("0");

		Thread.sleep(2000);

		op.selectByValue("5");

		Thread.sleep(2000);

		op.selectByValue("6");

		Thread.sleep(2000);

		op.selectByValue("10");

		Thread.sleep(2000);

		op.selectByValue("11");

		Thread.sleep(2000);

		op.selectByValue("15");

		WebElement qr = driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));

		Select st = new Select(qr);

		st.selectByValue("9");

		Thread.sleep(2000);

		st.selectByValue("6");

		Thread.sleep(2000);

		st.selectByValue("3");

		driver.findElement(By.xpath("//a[@class=\"viewmode-icon list\"]")).click();

//		Ray Ban Sunglasses

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href=\"/ray-ban-aviator-sunglasses\"])[2]")).click();

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-33\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-33\"]")).click();

		driver.navigate().back();

//		Reversible-Horseferry-Check-Belt

		driver.findElement(By.xpath("(//a[@href=\"/reversible-horseferry-check-belt\"])[2]")).click();

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-32\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-32\"]")).click();

		driver.navigate().back();

//		Obey-Hropaganda-hat

		driver.findElement(By.xpath("(//a[@href=\"/obey-propaganda-hat\"])[2]")).click();

		WebElement hat = driver.findElement(By.xpath("//select[@id=\"product_attribute_13\"]"));

		Select topi = new Select(hat);

		topi.selectByValue("0");

		Thread.sleep(2000);

		topi.selectByValue("34");

		Thread.sleep(2000);

		topi.selectByValue("35");

		Thread.sleep(2000);

		topi.selectByValue("36");

		Thread.sleep(2000);

		topi.selectByValue("37");

		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-31\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-31\"]")).click();

		driver.navigate().back();
	}

}
