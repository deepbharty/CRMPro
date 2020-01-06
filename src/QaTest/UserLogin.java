package QaTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLogin {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Programmed Files\\Eclipse\\SeleniumPractise\\lib\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.crmpro.com/");
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Login
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("deepbharty10");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		
		
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		System.out.println("Login successfully");
		
		
		
		
	}

}
