package QaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationandLogin {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Programmed Files\\Eclipse\\SeleniumPractise\\lib\\ChromeDriver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.crmpro.com/");
	
	//Navigating to Signup page
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
	
	//Select class is used for tracking dropdown element	
	//Selecting Edition value
	
WebElement edition=driver.findElement(By.id("payment_plan_id"));
Select DropDown=new Select(edition);
	DropDown.selectByVisibleText("Free Edition");
	

//	List<WebElement> lst=driver.findElements(By.xpath("//select[@name='payment_plan_id']//option"));
//	int size=lst.size();
//	System.out.println(size);
//	for(int i=0; i<lst.size(); i++){
//		if(lst.get(i).getText().contains("Free Edition"))
//		{
//		lst.get(i).click();
//		}
//	}
	
	
//Now filling the registration form
	
	driver.findElement(By.name("first_name")).sendKeys("Deepak");
	
	
	driver.findElement(By.xpath("//*[@name='surname']")).sendKeys("Bharty");
	
	driver.findElement(By.xpath("//*[@name='email']")).sendKeys("Deepbharty16@yopmail.com");
	
	driver.findElement(By.xpath("//*[@name='email_confirm']")).sendKeys("Deepbharty16@yopmail.com");
	
	driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Deepbharty16");
	
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Test@1234");
	
	driver.findElement(By.xpath("//*[@name='passwordconfirm']")).sendKeys("Test@1234");
	
	//Select the checkbox T&C
	
	driver.findElement(By.xpath("//*[@name='agreeTerms']")).click();
	
	driver.findElement(By.xpath("//*[@name='submitButton']")).click();
	
	System.out.println("New User has been registered successfully");
	
	//Now filling compnay details
	
    driver.findElement(By.xpath("//*[@name='company_name']")).sendKeys("Test Demo");
	
	driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("0123456789");
	
	driver.findElement(By.xpath("//*[@name='fax']")).sendKeys("Test1234");
	
	driver.findElement(By.xpath("//*[@name='website']")).sendKeys("http://web01.chetu.com/Pixxles-PYMT/");
	
	driver.findElement(By.xpath("//*[@name='company_email']")).sendKeys("Deepbharty@yopmail.com");
	
	driver.findElement(By.xpath("//*[@name='service']")).sendKeys("NA");
	
	driver.findElement(By.xpath("//*[@name='address']")).sendKeys("Noida Sec 51");
	
driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Gautambuddhnagar");
	
	driver.findElement(By.xpath("//*[@name='state']")).sendKeys("UP");
	
	driver.findElement(By.xpath("//*[@name='postcode']")).sendKeys("201301");
	
	//Selecting country from the country select box
	
	WebElement country=driver.findElement(By.name("country"));
	Select DropDown1=new Select(country);
	DropDown1.selectByVisibleText("India");
	
	
	
	//Selecting checkbox
	
	driver.findElement(By.xpath("//*[@name='copy_address']")).click();
	
	driver.findElement(By.xpath("//*[@name='btnSubmit']")).click();
	
	System.out.println("Compnay detail added successfully");
	//Adding more users
	
    driver.findElement(By.name("first_name")).sendKeys("Swati");
	
	driver.findElement(By.name("surname")).sendKeys("Bharty");
	
	driver.findElement(By.name("email")).sendKeys("Swatibharty4@yopmail.com");
	
	driver.findElement(By.name("email_confirm")).sendKeys("Swatibharty4@yopmail.com");
	
	driver.findElement(By.name("username")).sendKeys("Swatibharty4");
	
	driver.findElement(By.name("password")).sendKeys("Test@1234");
	
	driver.findElement(By.name("passwordconfirm")).sendKeys("Test@1234");
	
	//Selecting Role
	
	
	WebElement role=driver.findElement(By.name("role_id"));
	Select DropDown2=new Select(role);
	DropDown2.selectByVisibleText("User");
	
	//Adding User
	
	driver.findElement(By.name("add_user")).click();
	
	System.out.println("New user added sucessfully");
	
	//Registration completion
	
	driver.findElement(By.name("finish")).click();
	
	//Login 

	driver.findElement(By.name("username")).sendKeys("Deepbharty16");
	driver.findElement(By.name("password")).sendKeys("Test@1234");
	
	//Login button click
	driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
	
	System.out.println("Login successfully");
	
	driver.close();
	}
}

