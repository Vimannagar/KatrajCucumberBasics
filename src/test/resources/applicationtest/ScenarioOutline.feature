Feature: Login feature
Scenario Outline: login with different set of invalid combination
Given user is on Application landing page
When user click on signin button
Then user should see the login page
When user enters username as "<username>"
And user enters  password as "<password>"
And  Click on login button
Then user should get error messsage

Examples:

|username | password |
|incorrectusername | incorrectpassword |
|correctusername | incorrectpassword |
|incorrectusername | correctpassword |