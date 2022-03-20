package cucumbermap;

import java.net.UnknownHostException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import methods.HTMLReportGenerator;

public class Hookable {

	@Before
	public void before(Scenario scenerio) throws UnknownHostException {
		
	HTMLReportGenerator.TestSuiteStart("D:\\flipkart.html", "Flipkartproject");
	HTMLReportGenerator.TestCaseStart(scenerio.getName(), scenerio.getStatus());
	
	System.out.println("--------------------Scenerio Starts----------------");
	
	}
	
	
	
	@After
	public void after(Scenario scenerio) {
		System.out.println("--------------------Scenerio ends------------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}
}
