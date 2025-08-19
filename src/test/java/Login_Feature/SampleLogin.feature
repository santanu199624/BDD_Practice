Feature: Login functionality

Scenario Outline: User should login with valid credentials 
Given  User is on the home page
When User should enter the valid email <email>
And User should enter the valid password <passwprd>
And User should click on the login button
Then User logged in successfully
Examples:
|email|password|
|arun@gmail.com|12345|
|arun1@gmail.com|123456|