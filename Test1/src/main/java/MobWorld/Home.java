package MobWorld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Home {
	
	WebDriver driver;
	@Test
	public void Lanching_the_Browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Nitesh Gowda\\\\eclipse-workspace\\\\Test1\\\\chromedriver\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net");
	driver.manage().window().maximize();


	}}


