package MobileWorld;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSignUp {
	@AfterTest
	public void Verify_SignUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitesh Gowda\\eclipse-workspace\\Test1\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		SignUp Sup = new SignUp(driver);
		driver.manage().window().maximize();
		driver.get("https://mobileworld.azurewebsites.net/");
		Sup.clickSignUpLink();
		Sup.clickSign();
		Sup.setFirstName("Nitesh");
		Sup.setLastName("L");
		Sup.setEmail("nitesh@gmail.com");
		Sup.setPassword("123");
		Sup.setDOB("26-09-1998");
		Sup.clickGender();
		Sup.setPhone("7899369319");
		Sup.setShortBio("Hi, Myself Nithu.");
		Sup.clickRegisterLink();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[6]/div[3]/button")).click(); 
		Thread.sleep(2000);
		Alert b = driver.switchTo().alert();
		b.accept();
	}
	@Test
	public void Verify_Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitesh Gowda\\eclipse-workspace\\Test1\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		LoginModels Lm =  new LoginModels(driver);
		driver.manage().window().maximize();
		driver.get("https://mobileworld.azurewebsites.net/sign.html");
		Lm.setName("Nitesh");
		Lm.setLoginPassword("123");
		Lm.clickLoginLink();
	}	
	@BeforeTest
	public void Verify_Order() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitesh Gowda\\eclipse-workspace\\Test1\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		AllMobiles Al = new AllMobiles(driver);
		driver.manage().window().maximize();
		driver.get("https://mobileworld.azurewebsites.net/");
		Al.clickAllmobiles();
		Al.clickOrder();
		Al.clickOrderI();
		
}
}

		
		
		
