Feature: profile functionality

@smoke
Scenario: Add profile
Given User should available at profile page
When User click on add button
Then user should be able to add the information

@regression
Scenario: Update profile
Given User should available at profile page
When User click on edit button
Then user should be able to edit the information

@functional
Scenario: delete profile
Given User should available at profile page
When User click on delete button
Then user should be able to delete the information