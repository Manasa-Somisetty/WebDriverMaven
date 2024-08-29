package webDrivermaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;

	@BeforeTest
	public void setUp(){
		driver=new ChromeDriver();
			
	}
	
	@Test
	public void doLogin() throws InterruptedException {
		driver.get("http://gmail.com");
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Use another account')]")).click();
		driver.findElement(By.id("identifierId")).sendKeys("s.manasa.smile@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='identifierNext'] span")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Passwd")).sendKeys("Scientist@1509");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='passwordNext'] span")).click();
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
	
}
