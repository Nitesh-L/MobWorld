package MobileWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModels {
	
	WebDriver driver;
	
	By Name=By.xpath("//*[@id=\"username\"]");
	By LoginPassword = By.xpath("//*[@id=\"password\"]");
	By LoginLink = By.xpath("//*[@id=\"submitForm\"]/div[4]/a");
	
	LoginModels(WebDriver d)
	{
		driver = d;
	}
	public void setName(String Na)
	{
		driver.findElement(Name).sendKeys(Na);
	}
	public void setLoginPassword(String Lp)
	{
		driver.findElement(LoginPassword).sendKeys(Lp);
	}
	public void clickLoginLink()
	{
		driver.findElement(LoginLink).click();
	}
	

}
