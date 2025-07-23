Feature:Login Feature

Scenario:User Should be Able to Sign In Successfully
	Given I am on shopping Website
	When I enter the username
	And I enter password
	And I click on Sign in
    Then I should be on accounts page
    
  
        