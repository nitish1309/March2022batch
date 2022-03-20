package methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.MoreObjects.ToStringHelper;

public class SeleniumOperations {
	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters) {
		try {
		String browserName=(String) inputParameters[0];
		String exe=(String) inputParameters[1];
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", exe);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", exe);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Methodused:browserLaunch, Input_Data" + inputParameters[1].toString());
		}catch (Exception e) {
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Methodused:browserLaunch, Input_Data" + inputParameters[1].toString());
		}
		return outputParameters;
		}public static Hashtable<String,Object> openApplication(Object[]inputParameters) {
			try {
				
			String url=(String)inputParameters[0];
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Methodused:openApplication, Input_Data" + inputParameters[0].toString());
			}catch (Exception e) {
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Methodused:openApplication, Input_Data" + inputParameters[0].toString());
		}
			return outputParameters;
		}
		public static Hashtable<String,Object> clickonElement(Object[]inputParameters) {
			try {
				String xpath=(String) inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Methodused:clickonElement, Input_Data" + inputParameters[0].toString());
			}catch (Exception e) {
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Methodused:clickonElement, Input_Data" + inputParameters[0].toString());
		}
			return outputParameters;
		}
		
		public static Hashtable<String,Object> loginWindow(Object[]inputParameters) {
			try {
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			String log= (String) inputParameters[0];
			WebElement wd= driver.findElement(By.xpath(log));
			Actions act= new Actions(driver);
			act.moveToElement(wd).build().perform();
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Methodused:loginWindow, Input_Data" + inputParameters[0].toString());
			
			}catch (Exception e) {
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Methodused:loginWindow, Input_Data" + inputParameters[0].toString());
		}
			return outputParameters;
		}
		public static Hashtable<String,Object> UserDetails(Object[]inputParameters) {
		try {
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			String xpath=(String) inputParameters[0];
			String username=(String) inputParameters[1];
			driver.findElement(By.xpath(xpath)).sendKeys(username);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Methodused:UserDetails, Input_Data" + inputParameters[1].toString());
		}catch (Exception e) {
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Methodused:UserDetails, Input_Data" + inputParameters[1].toString());
		}
		return outputParameters;
		}
		public static Hashtable<String,Object> validationForLogin(Object[]inputParameters) {
		try {
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			String givenText=(String) inputParameters[0];
			String xpath=(String) inputParameters[1];
			String actualText=  driver.findElement(By.xpath(xpath)).getText();
			if(givenText.equalsIgnoreCase(actualText))
			{
				System.out.println("Test case Pass");
			}
			else 
			{
				System.out.println("Teast case Pass");
			}
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Methodused:validationForLogin, Input_Data" + inputParameters[0].toString());
		}catch (Exception e) {
			outputParameters.put("STATUS", "Fail");
			outputParameters.put("MESSAGE", "Methodused:validationForLogin, Input_Data" + inputParameters[0].toString());
		}
		return outputParameters;
		}
public static void main(String[] args) throws InterruptedException {

	Object[] input= new Object[2];
	input[0]="chrome";
	input[1]="C:\\\\Users\\\\Nitish\\\\eclipse-workspace\\\\Trial\\\\Ecom\\\\Flipkart\\\\src\\\\test\\\\resources\\\\DRIVERS\\\\chromedriver.exe";
	SeleniumOperations.browserLaunch(input);
	Object[] input1= new Object[1];
	input1[0]="https://www.flipkart.com";
	SeleniumOperations.openApplication(input1);
	Object[] input2= new Object[1];
	input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	clickonElement(input2);
	Object[] input22= new Object[1];
	input22[0]="//*[@class='_1_3w1N']";
	SeleniumOperations.loginWindow(input22);
	Thread.sleep(5000);
	Object[] input23= new Object[1];
	input23[0]="(//*[@class='_2NOVgj'])[1]";
	SeleniumOperations.clickonElement(input23);
	Thread.sleep(3000);
	Object[] input4= new Object[2];
	input4[0]="//*[@class='_2IX_2- VJZDxU']";
	input4[1]="n.svastav@gmail.com";
	UserDetails(input4);
	Object[] input5= new Object[2];
	input5[0]="//input[@type='password']";
	input5[1]="Vaijapur@13";
	UserDetails(input5);
	Object[] input6= new Object[1];
	input6[0]="(//button[@class='_2KpZ6l _2HKlqd _3AWRsL'])[1]";
	clickonElement(input6);
	
	
	
	
}
}
