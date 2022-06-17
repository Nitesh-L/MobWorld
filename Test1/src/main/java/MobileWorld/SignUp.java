package MobileWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {

WebDriver driver;
	
	By SignUpLink = By.xpath("//*[@id=\"navbarSupportedContent\"]/button");
	By Sign = By.xpath("/html/body/div/div/div/div/div/p/a");
	By FirstName = By.xpath("//*[@id=\"myName\"]");
	By LastName = By.xpath("//*[@id=\"myForm\"]/div[1]/div[3]/input");
	By Email = By.xpath("//*[@id=\"myForm\"]/div[2]/div[2]/input[1]");
	By Password = By.xpath("//*[@id=\"myForm\"]/div[2]/div[2]/input[2]");
	By DOB = By.xpath("//*[@id=\"myForm\"]/div[3]/div[2]/input");
	By Gender = By.xpath("//*[@id=\"myForm\"]/div[3]/div[3]/input");
	By Phone = By.xpath("//*[@id=\"myForm\"]/div[4]/div[2]/input");
	By ShortBio = By.xpath("//*[@id=\"myForm\"]/div[5]/div[2]/textarea");
	By RegisterLink = By.xpath("//*[@id=\"myForm\"]/div[6]/div[2]/button");
	By SignLink = By.xpath("//*[@id=\\\"myForm\\\"]/div[6]/div[3]/button");
	By UserName = By.xpath("//*[@id=\"username\"]");
	By Lpassword = By.xpath("//*[@id=\"password\"]");
	By Login = By.xpath("//*[@id=\"submitForm\"]/div[4]/a");
	
	public SignUp(WebDriver d)
	{
		driver = d;
	}
	public void clickSignUpLink()
	{
		driver.findElement(SignUpLink).click();
	}
	public void clickSign()
	{
		driver.findElement(Sign).click();
	}
	public void setFirstName(String fname)
	{
		driver.findElement(FirstName).sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		driver.findElement(LastName).sendKeys(lname);
	}
	public void setEmail(String email)
	{
		driver.findElement(Email).sendKeys(email);
	}
	public void setPassword(String password)
	{
		driver.findElement(Password).sendKeys(password);
	}
	public void setDOB(String date)
	{
		driver.findElement(DOB).sendKeys(date);
	}
	public void clickGender()
	{
		driver.findElement(Gender).click();
	}
	public void setPhone(String Ph)
	{
		driver.findElement(Phone).sendKeys(Ph);
	}
	public void setShortBio(String Bio)
	{
		driver.findElement(ShortBio).sendKeys(Bio);
	}
	public void clickRegisterLink()
	{
		driver.findElement(RegisterLink).click();
	}
	
	
}

