Feature: orders status

Background:
Given user should be at login screen of application
When user enters the username as "8176867662"
And user enters the password as "123456"
And user clicks on login button

Scenario: check previous order
When user click on previous order
Then user should see the previous order information

Scenario: check current order
When user click on placed order
Then user should see the placed order information


Scenario: check cancelled order
When user click on cancelled order
Then user should see the cancelled order information
