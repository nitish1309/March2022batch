package plainTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnitTestCase {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitish\\eclipse-workspace\\Trial\\Ecom\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://flipkart.com");
	driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
	Actions act= new Actions(driver);
	WebElement wb= driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
	act.moveToElement(wb).build().perform();
	driver.findElement(By.xpath("//*[@class='_1_3w1N']")).click();
	driver.findElement(By.xpath("(//input[@class='_2IX_2- VJZDxU'])[1]")).sendKeys("n.svastav@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vaijapur@13");
	driver.findElement(By.xpath("(//button[@class='_2KpZ6l _2HKlqd _3AWRsL'])[1]")).click();
}
}
