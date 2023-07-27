package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Loginpg {
	WebDriver driver;
	By a=By.xpath("//a[@href='/account']");
	By b=By.xpath("//button[@title='Create an Account']");
	By frstn=By.xpath("//input[@id='FirstName']");
	By lstn=By.xpath("//input[@id='LastName']");
	By email=By.xpath("//input[@id='Email']");
	By pass=By.xpath("//input[@id='CreatePassword']");
	By submit=By.xpath("//input[@value='Submit']");
	By emailid=By.xpath("//input[@type='email']");
	By password=By.xpath("//input[@type='password']");
	By login=By.xpath("//input[@type='submit']");
	By searchbar=By.xpath("//input[@name='s']");
	By product=By.xpath("//*[@id=\"searchModal\"]/div/div/div[1]/div[1]/div[2]/div[3]/div[1]/div/div[1]/a/img");
	By addcart=By.xpath("//button[@name='add']");
	public Loginpg(WebDriver driver) {
		this.driver=driver;
	}



	public void a()
	{
		driver.findElement(a).click();
		
	}
	public void b()
	{
		driver.findElement(b).click();
	}
	public void c()
	{
		driver.findElement(frstn).sendKeys("Yohan");
		driver.findElement(lstn).sendKeys("M S");
		driver.findElement(email).sendKeys("Yohanmsaj1999@gmail.com");
		driver.findElement(pass).sendKeys("Yohan@123");
		
	}
	public void d()
	{
		driver.findElement(submit).click();
	}
	public void e()
	{
		driver.findElement(emailid).sendKeys("Yohanmsaj1999@gmail.com");
		driver.findElement(password).sendKeys("Yohan@123");
	}
	public void f()
	{
		driver.findElement(login).click();
	}
	public void search(String item)
	{
		driver.findElement(searchbar).sendKeys(item,Keys.ENTER);
	}
	public void product()
	{
		driver.findElement(product).click();
	}
	public void addcart()
	{
		driver.findElement(addcart).click();
	}

	}
