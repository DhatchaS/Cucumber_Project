Feature:  Booking Hotel functionality of adactin application

Scenario Outline:: Login functionality of the application
Given  user lanch the browser
When  User Enter the "<username>" in the username field 
And user enter the "<password>" in the password field
And  User clks the login button
Then user validate the search button

Examples:
|username|password|
|AAAA|1111|
|dhatchasathish|12345678|

