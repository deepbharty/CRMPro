package QaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Programmed Files\\Eclipse\\SeleniumPractise\\lib\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?");
		boolean id=driver.findElement(By.name("identifier")).isEnabled();
		 System.out.println(id);
		
		 driver.findElement(By.name("identifier")).sendKeys("#########");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("password")).sendKeys("###########");
		
		 driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 
}}
