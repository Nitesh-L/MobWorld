package MW1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestObj {
	@Test
	public void Verify_SignUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitesh Gowda\\eclipse-workspace\\Test1\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

	
	SignUpObj sup=new SignUpObj(driver);
	sup.signin().click();
	sup.signup().click();
	sup.firstname().sendKeys("ravi");
	sup.lastname().sendKeys("s");
	sup.emailid().sendKeys("ravi@gmail.com");
	sup.password().sendKeys("ravi7760");
	sup.date().sendKeys("10/24/1998");
	sup.genderF().click();
	sup.phone().sendKeys("987656789");
	sup.bio().sendKeys("hey iam graduate engineering trainee" );
	sup.register().click();
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	sup.clicksignin().click();
	driver.switchTo().alert().accept();
}
}
