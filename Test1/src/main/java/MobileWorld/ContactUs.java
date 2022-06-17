package MobileWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs {
	
	
	public static void main(String[]args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitesh Gowda\\eclipse-workspace\\Test1\\chromedriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/div/a[2]")).click();
	}
}
	


