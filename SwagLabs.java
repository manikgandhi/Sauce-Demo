import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {
	public static void main(String[] args)  throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.saucedemo.com/");
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 driver.findElement(By.name("login-button")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		 driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("checkout")).click();
	 driver.findElement(By.id("first-name")).sendKeys("Manik");
	 driver.findElement(By.id("last-name")).sendKeys("Gandhi");
	 driver.findElement(By.id("postal-code")).sendKeys("110009");
	 driver.findElement(By.id("continue")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.id("finish")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.id("back-to-products")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.id("react-burger-menu-btn")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.id("logout_sidebar_link")).click();
	 
	 
	 
	 
	 
		 
		 
		 
		 
		// TODO Auto-generated method stub

	}
	

}
