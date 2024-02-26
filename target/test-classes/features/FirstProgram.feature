

Feature: Application Login
  
Background:  
Given setup the entries in database
And launch the browser from config variables
And hit the home page url of banking site

@RegressionTest
Scenario: Admin Page Default Login

Given User is on NetBanking landing Page 
When User Login into application with "admin" and password "1234"
Then Home Page is Dispalyed
And Cards are displayed 


#Reusable
 
@MobileTest  
Scenario: User Page Default Login
   
Given User is on NetBanking landing Page
When User Login into application with user and password 0593
Then Home Page is Dispalyed
And Cards are displayed 
    
  
@SmokeTest  @regressionTest
 Scenario Outline: Mortgage User Page Default Login
    
    Given User is on NetBanking landing Page
    When User Login into application with "<Username>" and password "<Password>" 
    Then Home Page is Dispalyed
    And Cards are displayed 
  
Examples:
		| Username | password |
		| debituser | hello12 |
		| credituser| lpo887  | 
		  
@SmokeTest    	
Scenario: User Page Default Signup
    
Given User is on practice landing Page
When User Signup into application
	|rajesh |
	|kavati|
	|rajeshkavati60@gmail.com|
	|8725694874|
Then Home Page is Dispalyed
And Cards are displayed 
  
 