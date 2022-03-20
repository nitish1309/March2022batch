Feature: Login functionality
Background: User is successfully LaunchedApplication
Given user opens "Chrome" browser with exe as"C:\\\\Users\\\\Nitish\\\\eclipse-workspace\\\\Trial\\\\Ecom\\\\Flipkart\\\\src\\\\test\\\\resources\\\\DRIVERS\\\\chromedriver.exe"
Given user opens URL as "https://www.flipkart.com"

@SmokeTest
Scenario: Login functionality with valid credentials
When user click on cancel
When user click on login
When user click on my profile
When user enter "n.svastav@gmail.com" as username
When user enter "Vaijapur@13" as password
When user click on login button
Then user is login successfully
 