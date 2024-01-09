package Practice_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ssc_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("==Application  from ==");
     System.setProperty("weddriver.driver.chromedriver", "C:\\Users\\chpha\\Downloads\\chromedriver-win64 (1).zip\\chromedriver-win64\\chrome.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://ssc.nic.in/registration/home");
     driver.manage().window().maximize();
//     driver.findElement(By.name("name=\"DoyouhaveAadhar\"")).click();
//     driver.findElement(By.id("IDnumber")).sendKeys("99633826");
//     driver.findElement(By.name("Name")).sendKeys("KALYAN");
//     driver.findElement(By.name("VerifyName")).sendKeys("KALYAN");
//     driver.findElement(By.id("FatherName")).sendKeys("PAWAN");
//     driver.findElement(By.id("VerifyFatherName")).sendKeys("PAWAN");
//     driver.findElement(By.id("MotherName")).sendKeys("LAKSHMI");
//     driver.findElement(By.id("VerifyMotherName")).sendKeys("LAKSHMI");
//     driver.findElement(By.id("DateOfBirth")).sendKeys("22/04/2002");
//     driver.findElement(By.name("VerifyDateOfBirth")).sendKeys("22/04/2002");
//     driver.findElement(By.id("SecondaryRollNum")).sendKeys("1714115423");
//     driver.findElement(By.id("MobileNum")).sendKeys("7799637680");
//     driver.findElement(By.id("VerifyMobileNum")).sendKeys("7799637680");
//     driver.findElement(By.id("EmailID")).sendKeys("chphani946@gmail.com");
//     driver.findElement(By.id("VerifyEmailID")).sendKeys("chphani946@gmail.com");
//     driver.findElement(By.id("btnsubmit1")).click();
   
     
     
//    ------------------------------------------------------------------------------------------------------- 
     
  driver.findElement(By.cssSelector("input#IDnumber")).sendKeys("9963382");
     driver.findElement(By.cssSelector("input#Name")).sendKeys("PHANI");
    driver.findElement(By.cssSelector("input#VerifyName")).sendKeys("PHANI");
     driver.findElement(By.cssSelector("input#FatherName")).sendKeys("ANJANEYULU");
     driver.findElement(By.cssSelector("input#MotherName")).sendKeys("LAKSHMI");
     driver.findElement(By.cssSelector("input#VerifyMotherName")).sendKeys("LAKSHMI");
     driver.findElement(By.cssSelector("input[id=DateOfBirth]")).sendKeys("22/04/2002");
    driver.findElement(By.cssSelector("input.form-control[id=VerifyDateOfBirth]")).sendKeys("22/04/2002");
     driver.findElement(By.cssSelector("input#SecondaryRollNum")).sendKeys("1714115423");
     driver.findElement(By.cssSelector("input#VerifySecondaryRollNum")).sendKeys("1714115423");
     driver.findElement(By.cssSelector("input#rbMale")).click();
     driver.findElement(By.cssSelector("input#rbVerifyMale")).click();
     driver.findElement(By.cssSelector("input#MobileNum")).sendKeys("779963768");
     driver.findElement(By.cssSelector("input#VerifyMobileNum")).sendKeys("779963768");
     driver.findElement(By.cssSelector("input#EmailID")).sendKeys("chphami946@gmail.com");
     driver.findElement(By.cssSelector("input#VerifyEmailID")).sendKeys("chphami946@gmail.com");
     driver.findElement(By.cssSelector("input#btnsubmit1")).click();
     driver.findElement(By.cssSelector("")).sendKeys("");
     
//    ------------------------------------------------------------------------------------------------------
//     driver.findElement(By.xpath("//*[@id=\"rbAadharYes\"]")).click();
//     driver.findElement(By.xpath("//*[@id=\"AadharNumber\"]")).sendKeys("827339120007");
//     driver.findElement(By.xpath("//*[@id=\"VerifyAadharNumber\"]")).sendKeys("827339120007");
//     driver.findElement(By.xpath("//*[@id=\"Name\"]")).sendKeys("TEDDY");
//     driver.findElement(By.xpath("//*[@id=\"VerifyName\"]")).sendKeys("TEDDY"); 
//     driver.findElement(By.xpath("//*[@id=\"FatherName\"]")).sendKeys("ANJANEYULU");
//     driver.findElement(By.xpath("//*[@id=\"VerifyFatherName\"]")).sendKeys("ANJANEYULU");
	}

}
