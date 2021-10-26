package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	public WebDriver driver;
	
	@Given("user is on policycenter login page")
	public void user_is_on_policycenter_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://ec2-65-2-11-216.ap-south-1.compute.amazonaws.com:8080/PolicyCenter.do");
		driver.manage().window().maximize();
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	   
		driver.findElement(By.name("Login-LoginScreen-LoginDV-username")).sendKeys("su");
		driver.findElement(By.name("Login-LoginScreen-LoginDV-password")).sendKeys("gw");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    driver.findElement(By.id("Login-LoginScreen-LoginDV-submit")).click();
	}

	@Then("user is navigated to policycenter My Summary page")
	public void user_is_navigated_to_policycenter_my_summary_page() {
	    
	}


}
