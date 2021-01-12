Feature: Booking functionality in the adactin application

Scenario: Verify the user is able to login the application
Given User launches the application
When User enters the valid username in the username field
And User enters the valid password in the password field
And User clicks the login button
Then User verifies whether the Homepage navigates to the search hotel page

Scenario: User wants to search Hotel
When User enters the location in the location field
And User enters the number of rooms in the number of rooms field
And User enters the date in the check In date field
And User enters the date in the Check Out date field
And User enters the number of persons in Adult per room field
And User click the search button
Then User navigates to the select hotel page

Scenario: User select the hotel
When User choose the hotel according to their price expected 
And User clicks the continue button
Then User navigates to  book a hotel page

Scenario: User book a hotel
When User enters the first name in the first name field
And User enters the last name in the last name field
And User enters the billing address in the billing address field
And User enters the credit card number in the credit card number field
And User enters the card type in the credit card type field
And User enters the month and year in the expiry date field
And User enters the CVV number in the CVV number field
And User can able to book by clicking book now button
Then Booking is confirmed now user verify the details in the booking confirmation

Scenario: After completed  user wants to logout the page
When User clicks the logout button
Then User navigates to logout page 