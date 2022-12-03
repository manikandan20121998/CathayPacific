@E2E
Feature: user has to search a fight for travling

Background:
Given user has to in verified website 
@first
Scenario: to search the fight for specified date

When user give the from place of take
And user give the to place for their destination 
And user has to give date of travel 
And user has to give date of return
And user has to click search button for check available fight lists
Then user see the fight list
@second
Scenario:
 Aa user have to click instagram follow through a website

When user have to go till down on website
And User have to click instagram logo
And user will see the instagram offi then click follow req
Then Take a snap for evidence