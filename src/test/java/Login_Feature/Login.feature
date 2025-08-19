Feature: User login
Register users should able to login

Scenario: Login with valid credentials
Given Users navigate to the login page
When Users enters valid email address "maitysantanu24041996@gmail.com"
And Enter valid password "12345"
And Clicks on the login button
Then User should login successfully

Scenario: Login with invalid credentials
Given Users navigate to the login page
When Users enters invalid email address "maitysantanu2@gmail.com"
And Enter invalid password "123"
And Clicks on the login button
Then User should get a proper warning message

Scenario: Login with valid email and invalid password
Given Users navigate to the login page
When Users enters valid email address "maitysantanu24041996@gmail.com"
And Enter invalid password "123"
And Clicks on the login button
Then User should get a proper warning message

Scenario: Login with invalid email and valid password
Given Users navigate to the login page
When Users enters invalid email address "maitysantanu2@gmail.com"
And Enter valid password "12345"
And Clicks on the login button
Then User should get a proper warning message

Scenario: Login without providing any credentials
Given Users navigate to the login page
When user dont enter any credential
And Click on login button
Then User should get a proper warning message




