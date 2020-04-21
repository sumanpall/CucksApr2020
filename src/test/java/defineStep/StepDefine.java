package defineStep;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefine {
	
	WebDriver driver;
	
	
	@Given("user is at signIn page")
	public void user_is_at_signIn_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user provides valid user and password")
	public void user_provides_valid_user_and_password(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new io.cucumber.java.PendingException();
		      List<String> userdat= dataTable.asList();
		      
		      System.out.println(userdat.size());
		      
		      for( String data : userdat) {
		    	  
		    	  System.out.println(data);
		    	  
		      }
		      
		
	}

	@Then("user sign in is success")
	public void user_sign_in_is_success() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	
	@Given("User provides valid credentials")
	public void user_provides_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("provided valid credentials");
	    String bro="ff";
		if(bro.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
			
			//Opening of the browser
			driver=new ChromeDriver();
		}
		else if(bro.equalsIgnoreCase("ff")) {
            System.setProperty("webdriver.gecko.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\geckodriver.exe");
			
			//Opening of the browser
			driver=new FirefoxDriver();
		}		
	    //Opening of the URL
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//print the title of the page
		System.out.println(driver.getTitle());
		driver.findElement(By .name("userName")).sendKeys("demo");
		driver.findElement(By .name("password")).sendKeys("demo");
		driver.findElement(By .name("login")).click();
		boolean b=driver.findElement(By .linkText("SIGN-OFF")).isDisplayed();
		//to retrieve the value from webelement
		String lnkname=driver.findElement(By .linkText("SIGN-OFF")).getText();
		System.out.println(lnkname);
		if(b==true) {
			System.out.println("SignIn is success");
			driver.findElement(By .xpath("//body//b//input[2]")).click();
			driver.findElement(By .name("passCount")).sendKeys("3");
			driver.findElement(By .cssSelector("input[value='Business']")).click();
			Select sel=new Select(driver.findElement(By .name("airline")));
			sel.selectByIndex(0);
			sel.selectByVisibleText("Unified Airlines");
			
		}
		else {
			System.out.println("SignIn is failed");
		}
		
		//close browsers
		
		//driver.quit();
	}

	@Then("SignIn is successful")
	public void signin_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("SignIn is success");
	}
	
	@Given("operator logged into the system")
	public void operator_logged_into_the_system() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("App open");
	}
	
	@Given("Alex purchased microwave for {int} dollors")
	public void alex_purchased_microwave_for_dollors(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("purchased microwave for $"+int1);
	}

	@Given("Alex has receipt")
	public void alex_has_receipt() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Alex has receipt");
	}

	@When("Alex returns the faulty microwave")
	public void alex_returns_the_faulty_microwave() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Returns the faulty microwave");
	}

	@Then("Alex should get refund of {int} dollors")
	public void alex_should_get_refund_of_dollors(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Alex gets refund of $"+int1);
	}


	
}
