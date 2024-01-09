package Practice_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_concept_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==WELCOME TO CSS LOCATER==");
		System.setProperty("webdrivers.chrome.Drivers", "C:\\Users\\chpha\\Downloads\\chromedriver-win64\\chromeDriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/automation-practice-form");
            driver.manage().window().maximize();
            driver.findElement(By.cssSelector("input#firstName")).sendKeys("Jashitha");
//            driver.findElement(By.cssSelector("input.form-control")).sendKeys("jashitha");
//            driver.findElement(By.cssSelector("input[id= firstName]")).sendKeys("jashitha");
//            driver.findElement(By.cssSelector("input.form-control[id=firstName")).sendKeys("jashitha");
            
            
            
           
            driver.findElement(By.cssSelector("input#lastName")).sendKeys("Jerry");
//            driver.findElement(By.cssSelector("input.form-control")).sendKeys("Jerry");
//            driver.findElement(By.cssSelector("input[id=lastName]")).sendKeys("Jerry");
//            driver.findElement(By.cssSelector("input.form-control[id=lastName]")).sendKeys("Jerry");
            
            
            
           driver.findElement(By.cssSelector("input#userEmail")).sendKeys("chphani946@gmail");
//           driver.findElement(By.cssSelector("input.form-control")).sendKeys("chphani946@gmail");
//           driver.findElement(By.cssSelector("input[id=userEmail]")).sendKeys("chphani946@gmail");
//           driver.findElement(By.cssSelector("input.form-control[id=userEmail")).sendKeys("chphani946@gmail");
           
           
           
//           driver.findElement(By.cssSelector("input#gender-radio-2")).click();
//           driver.findElement(By.cssSelector("input.custom-control-input")).click();
//             driver.findElement(By.cssSelector("input[id=gender-radio-2]")).click();
//           driver.findElement(By.cssSelector("input.custom-control-input.[id=gender-radio-2]")).click();
           
           
           
           
           driver.findElement(By.cssSelector("input#userNumber")).sendKeys("7799637680");
//           driver.findElement(By.cssSelector("input.form-control")).sendKeys("7799637680");
//           driver.findElement(By.cssSelector("input[id=userNumber]")).sendKeys("7799637680");
//           driver.findElement(By.cssSelector("input.form-control.[id=userNumber]")).sendKeys("7799637680");
           
           
                
      
             
          }

}
