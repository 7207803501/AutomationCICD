package stepDefinitions;

import java.util.List;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	
	@Given ("User is on NetBanking landing Page")
	public void user_is_on_net_banking_landing_page() {
		
		System.out.print("User landed on netbanking page");
		
	}

	@Given ("User is on practice landing Page")
	public void user_is_on_practice_landing_page() {
		
		System.out.print("User is on practice landing page");
		
	}
			
	@When("User Signup into application")
	public void user_signup_into_application(List<String> data) {
	   
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));;
	}
    
    
//    @When("User Login into application with {string} and password {string}")
//    public void user_login_into_application_with_and_password(String username, String password) {
//        // Write code here that turns the phrase above into concrete actions
//        
//    	System.out.print(username+"and password is"+ password);
//    }
    
    @When("^User Login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        
    	System.out.print(username+"and password is"+ password);
    }
    
    @Then ("Home Page is Dispalyed")
    public void home_page_is_displayed()
    {
    	System.out.println("Home page is displayed");
    }
    
    @And ("Cards are displayed")
    public void cards_are_displayed()
    {
    	System.out.println("Cards are displayed");
    }
    
    
    @Given ("user is on Netbanking landing page")
    public void getLandingPage()
    {
    	
    }
    
    @Given ("setup the entries in database")
    public void setupEntries()
    {
    	System.out.println("************");
    	System.out.println("setup the entries in database");
    }
    
    
   @When ("launch the browser from config variables")
   public void launchBrowser()
   {
	   System.out.println("launch the browser from config variables");
   }
    
   
   @When ("hit the home page url of banking site")
   public void hitURL() {
	   System.out.println("hit the home page url of banking site");
   }
    
    
    
    
    
    
    
    
    
    
}
