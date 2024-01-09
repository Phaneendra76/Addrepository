package X_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_2  
{
 public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.get("https://only-testing-blog.blogspot.com/");

driver.manage().window().maximize();
System.out.println(driver.getTitle());
driver.findElement(By.name("gparent1")).sendKeys("grand parent");
driver.findElement(By.name("parent1")).sendKeys("parent");
driver.findElement(By.name("child1")).sendKeys("child");
driver.findElement(By.name("gparent2")).sendKeys("grand parent _2");
driver.findElement(By.name("parent2")).sendKeys(" parent _2");
driver.findElement(By.name("child2")).sendKeys("child parent _2");
driver.findElement(By.id("tooltip-1")).sendKeys("Pawan");
driver.findElement(By.id("sname")).sendKeys("Konidela");
driver.findElement(By.id("yaddress")).sendKeys("heart");
driver.findElement(By.name("Town")).sendKeys("HYD");
driver.findElement(By.name("Country")).sendKeys("INDIA");



Thread.sleep(2000);

System.out.println(driver.getTitle());

driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]")).click();
driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[4]")).click();
driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[5]")).click();


Thread.sleep(2000);

System.out.println(driver.getTitle());

driver.findElement(By.id("datepicker")).sendKeys("22-04-2002");
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@src=\"//4.bp.blogspot.com/-Z8c5Od6lHXA/VJUhVC0Db1I/AAAAAAAABRc/gRZLhIfKDa0/s200/test.png\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class=\"CSS_LIGHTBOX_BTN_CLOSE CSS_LIGHTBOX_BTN_CLOSE_POS\"]")).click();


driver.findElement(By.xpath("//input[@name=\"userid\"]")).sendKeys("siva");
driver.findElement(By.xpath("//input[@name=\"pswrd\"]")).sendKeys("Ammu");
driver.findElement(By.xpath("//input[@name=\"lname\"])[3]")).sendKeys("Anjaneyulu");


//driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[6]")).click();
//driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[7]")).click();
//driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[8]")).click();
//driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[9]")).click();
//driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[10]")).click();
//
//
//driver.findElement(By.xpath("(//input[@name=\"fname\"])[1]")).sendKeys("Siva laxmi");
//driver.findElement(By.xpath("(//input[@name=\"lname\"])[1]")).sendKeys("Anjaneyulu");
////driver.findElement(By.id("submitButton")).click();
//
//
//
//driver.findElement(By.name("FirstName")).sendKeys("Sravan");
//driver.findElement(By.name("LastName")).sendKeys("Kumar");
//driver.findElement(By.name("EmailID")).sendKeys("chphani946@gmail.com");
//driver.findElement(By.name("MobNo")).sendKeys("9000380305");
//driver.findElement(By.name("Company")).sendKeys("Google");
////driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]"));
//
//
//
//
//System.out.println(driver.getTitle());
//
//driver.findElement(By.name("userid")).sendKeys("Kalyan@123");
//driver.findElement(By.name("pswrd")).sendKeys("Aswin@143");
//driver.findElement(By.name("fname")).sendKeys("Phaneendra");
//driver.findElement(By.name("lname")).sendKeys("Chennamseety");
////driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
//
//
//System.out.println(driver.getTitle());
//
//driver.findElement(By.name("fname")).sendKeys("Father");
//driver.findElement(By.name("lname")).sendKeys("Mother");
//driver.findElement(By.name("To Hide")).sendKeys("Ammi");
//driver.findElement(By.name("option1")).click();
//driver.findElement(By.name("option2")).click();
//driver.findElement(By.name("option3")).click();
//driver.findElement(By.id("radio1")).click();
//
//
//
//System.out.println(driver.getTitle());
//
////driver.findElement(By.id("text1")).sendKeys("Nana");
////driver.findElement(By.id("text2")).isEnabled();
//driver.findElement(By.name("To Hide")).sendKeys("Ammu");
//driver.findElement(By.id("check1")).click();
//driver.findElement(By.id("check2")).click();
//driver.findElement(By.id("check3")).click();
//driver.findElement(By.name("gender")).click();
//








}
	
}
