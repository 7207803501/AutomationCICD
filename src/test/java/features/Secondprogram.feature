

Feature: Application Login
  
Background:  

And launch the browser from config variables
And hit the home page url of banking site
#//Before--> Background--> scenario --> After





 
@regressionTest  @NetBanking
Scenario: User Page Default Login
   
Given User is on NetBanking landing Page
When User Login into application with user and password 0593
Then Home Page is Dispalyed
And Cards are displayed 
    
  
@SmokeTest  @regressionTest		@Mortgage
 Scenario Outline: Mortgage User Page Default Login
    
    Given User is on NetBanking landing Page
    When User Login into application with "<Username>" and password "<Password>" 
    Then Home Page is Dispalyed
    And Cards are displayed 
  
Examples:
		| Username | password |
		| debituser | hello12 |
		| credituser| lpo887  | 
		  

 
 
 #partial common