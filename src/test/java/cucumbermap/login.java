package cucumbermap;
import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.HTMLReportGenerator;
import methods.SeleniumOperations;
public class login {
	
	@Given ("^user opens \"(.*)\" browser with exe as\"(.*)\"$")
	public void openBrowser(String bname, String exe) {
		Object[] input= new Object[2];
		input[0]=bname;
		input[1]=exe;
		SeleniumOperations.browserLaunch(input);
}
	@Given ("^user opens URL as \"(.*)\"$")
	public void openUrl(String URL) {
		Object[] input1= new Object[1];
		input1[0]=URL;
		SeleniumOperations.openApplication(input1);
	}
	@When ("^user click on cancel$")
	public void cancel() {
		Object[] input2= new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickonElement(input2);
		Hashtable<String, Object> output2= SeleniumOperations.clickonElement(input2);
		HTMLReportGenerator.StepDetails(output2.toString(), "^user click on cancel$", output2.get("MESSAGE").toString());
	}
	@When ("^user click on login$")
	public void log() throws InterruptedException {
		Thread.sleep(3000);
		Object[] input22= new Object[1];
		input22[0]="//*[@class='_1_3w1N']";
		SeleniumOperations.loginWindow(input22);
	}
	@When ("^user click on my profile$")
	public void prof() throws InterruptedException {
		Thread.sleep(3000);
		Object[] input23= new Object[1];
		input23[0]="(//*[@class='_2NOVgj'])[1]";
		Hashtable<String, Object> output4= SeleniumOperations.clickonElement(input23);
		HTMLReportGenerator.StepDetails(output4.toString(), "^user click on my profile$", output4.get("MESSAGE").toString());
	}
	@When ("^user enter \"(.*)\" as username$")
	public void usernm(String usernm) throws InterruptedException {
		Thread.sleep(3000);
		Object[] input4= new Object[2];
		input4[0]="//input[@class='_2IX_2- VJZDxU']";
		input4[1]=usernm;
		SeleniumOperations.UserDetails(input4);
		Hashtable<String, Object> output4= SeleniumOperations.clickonElement(input4);
		HTMLReportGenerator.StepDetails(output4.toString(), "^user enter \"(.*)\" as username$", output4.get("MESSAGE").toString());
	}
	@When ("^user enter \"(.*)\" as password$")
	public void passw(String pass) {
		Object[] input5= new Object[2];
		input5[0]="//input[@type='password']";
		input5[1]=pass;
		SeleniumOperations.UserDetails(input5);
		Hashtable<String, Object> output5= SeleniumOperations.clickonElement(input5);
		HTMLReportGenerator.StepDetails(output5.toString(), "^user enter \"(.*)\" as password$", output5.get("MESSAGE").toString());
	}
	@When ("^user click on login button$")
	public void loginS() throws Throwable {
		Object[] input6= new Object[1];
		input6[0]="(//button[@class='_2KpZ6l _2HKlqd _3AWRsL'])[1]";
		SeleniumOperations.clickonElement(input6);
		Hashtable<String, Object> output6= SeleniumOperations.clickonElement(input6);
		HTMLReportGenerator.StepDetails(output6.toString(), "^user click on login button$", output6.get("MESSAGE").toString());
		}
	@Then ("^user is login successfully$")
	public void application_shows_user_logged() throws Throwable {
		Thread.sleep(3000);
		Object[] input7= new Object[2];
		input7[0]="Nitish Shrivastav";
		input7[1]="//*[text()='Nitish Shrivastav']";
		SeleniumOperations.validationForLogin(input7);
		Hashtable<String, Object> output7= SeleniumOperations.clickonElement(input7);
		HTMLReportGenerator.StepDetails(output7.toString(), "^user is login successfully$", output7.get("MESSAGE").toString());
	}
	
	
	
	
	

}