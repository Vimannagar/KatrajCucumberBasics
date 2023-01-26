Feature: Login feature
Scenario: login with correct credentials
Given user is at the login screen
When user enters the username
And user enters the password
And user click on login button
Then usee should get 