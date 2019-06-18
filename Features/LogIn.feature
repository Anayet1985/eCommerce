Feature: Log in into application 
@Invalidlogin
Scenario: To test log in functionality with invalid credentials 

Given I'm on Login page 

When Enter invalid username and password
Then I should be displayed  an error message 
And Should remain on the login screen 

@Nulllog
Scenario: To test login with blank credentials

Given I'm on a longin page 
When Enter blank user and password 
Then Should be displayed an error message 
And Should remain on the login screen 

@Validlogin
Scenario Outline: To test login functionally with valid credentials 
Given I am on login  page 
When Enter a valid email address as a "<username>" and password as a"<password>" 
Then I Should login succesfully 
Examples:
|username||password|
|anayet.amails@gmail.com||Myproject19|
