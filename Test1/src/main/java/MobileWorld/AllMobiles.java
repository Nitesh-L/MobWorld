package MobileWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllMobiles {
	
	WebDriver driver;
	
	By Allmobiles = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a");
	By Order = By.xpath("//*[@id=\"myTable\"]/tr[1]/td[5]/a");
	By Fname = By.xpath("//*[@id=\"inputFirstName\"][1]");
	By Lname = By.xpath("//*[@id=\"inputFirstName\"][2]");
	By Email = By.xpath("//*[@id=\"inputEmail\"]");
	By Password = By.xpath("//*[@id=\"inputPassword\"]");
	By Gender = By.xpath("//*[@id=\"flexRadioDefault1\"]");
	By Phone = By.xpath("//*[@id=\"myForm\"]/div[3]/div[4]/input");
	By Address = By.xpath("//*[@id=\" address1\"]");
	By City = By.xpath("//*[@id=\"inputCity\"]");
	By Zip = By.xpath("//*[@id=\"inputZip\"]");
	By Brand = By.xpath("//*[@id=\"myForm\"]/fieldset/div/div[1]/div/div[2]/label/input");
	By Model = By.xpath("//*[@id=\"Samsung\"]");
	By Count = By.xpath("//*[@id=\"myForm\"]/div[6]/div[2]/input");
	By NumberOFTimes = By.xpath("//*[@id=\"time\"]");
	By OrderI = By.xpath("//*[@id=\"myForm\"]/div[10]/button");
	
	AllMobiles(WebDriver d)
	{
		driver = d;
	}
	public void clickAllmobiles()
	{
		driver.findElement(Allmobiles).click();
	}
	public void clickOrder()
	{
		driver.findElement(Order).click();
	}
	public void setFname(String Fn)
	{
		driver.findElement(Fname).sendKeys(Fn);
	}
	public void clickOrderI()
	{
		driver.findElement(OrderI).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
