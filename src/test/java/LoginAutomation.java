import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAutomation {
  @Test

  public void login() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\naiks\\Downloads\\chromedriver_win32/chromedriver.exe");
	  
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY0MzY3NDQ2LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
	        
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("email"))
	        .sendKeys("saikumarnaikbukke3@gmail.com");
	        
	        driver.findElement(By.id("pass"))
	        .sendKeys("Sai@123");
	        
	        driver.findElement(By.id("loginbutton"))
          .click();
  }
}