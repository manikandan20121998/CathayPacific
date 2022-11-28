Feature: user has to search a fight for travling

Scenario: to search the fight for specified date
Given user has to in verified website 
When user give the from place of take
And user give the to place for their destination 
And user has to give date of travel 
And user has to give date of return
And user has to click search button for check available fight lists
Then user see the fight list



