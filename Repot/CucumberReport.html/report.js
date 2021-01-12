$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking functionality in the adactin application",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": ": Verify the user is able to login the application",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;:-verify-the-user-is-able-to-login-the-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the valid \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether the Homepage navigates to the search hotel page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;:-verify-the-user-is-able-to-login-the-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "booking-functionality-in-the-adactin-application;:-verify-the-user-is-able-to-login-the-application;;1"
    },
    {
      "cells": [
        "AAA",
        "111"
      ],
      "line": 12,
      "id": "booking-functionality-in-the-adactin-application;:-verify-the-user-is-able-to-login-the-application;;2"
    },
    {
      "cells": [
        "BBB",
        "111"
      ],
      "line": 13,
      "id": "booking-functionality-in-the-adactin-application;:-verify-the-user-is-able-to-login-the-application;;3"
    },
    {
      "cells": [
        "Pavisweety",
        "Pavi_1@sweety"
      ],
      "line": 14,
      "id": "booking-functionality-in-the-adactin-application;:-verify-the-user-is-able-to-login-the-application;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": ": Verify the user is able to login the application",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;:-verify-the-user-is-able-to-login-the-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the valid \"AAA\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid \"111\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether the Homepage navigates to the search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 7238246882,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 226586136,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "111",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 98085031,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 639577609,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_the_Homepage_navigates_to_the_search_hotel_page()"
});
formatter.result({
  "duration": 24870,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": ": Verify the user is able to login the application",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;:-verify-the-user-is-able-to-login-the-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the valid \"BBB\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid \"111\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether the Homepage navigates to the search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 342995421,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BBB",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 90120401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "111",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 98088979,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 563286751,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_the_Homepage_navigates_to_the_search_hotel_page()"
});
formatter.result({
  "duration": 22896,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": ": Verify the user is able to login the application",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;:-verify-the-user-is-able-to-login-the-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the valid \"Pavisweety\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid \"Pavi_1@sweety\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether the Homepage navigates to the search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 383612427,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pavisweety",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 105738591,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pavi_1@sweety",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 98226354,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 1200506869,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_the_Homepage_navigates_to_the_search_hotel_page()"
});
formatter.result({
  "duration": 27238,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User wants to search Hotel",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;user-wants-to-search-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "User enters the location in the location field",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enters the name of hotel in hotel field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters the type of room in room type field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User enters the number of rooms in the number of rooms field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enters the date in the check In date field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enters the date in the Check Out date field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User enters the number of persons in Adult per room field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User enters the number of children in children per room field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User navigates to the select hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_location_in_the_location_field()"
});
formatter.result({
  "duration": 103893495,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_name_of_hotel_in_hotel_field()"
});
formatter.result({
  "duration": 89931312,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_type_of_room_in_room_type_field()"
});
formatter.result({
  "duration": 101992736,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_number_of_rooms_in_the_number_of_rooms_field()"
});
formatter.result({
  "duration": 120349755,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_date_in_the_check_In_date_field()"
});
formatter.result({
  "duration": 84068767,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_date_in_the_Check_Out_date_field()"
});
formatter.result({
  "duration": 83571372,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_number_of_persons_in_Adult_per_room_field()"
});
formatter.result({
  "duration": 121590873,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_number_of_children_in_children_per_room_field()"
});
formatter.result({
  "duration": 116986421,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_search_button()"
});
formatter.result({
  "duration": 984548792,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_the_select_hotel_page()"
});
formatter.result({
  "duration": 22501,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "User select the hotel",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;user-select-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "User choose the hotel according to their price expected",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User clicks the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User navigates to  book a hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_choose_the_hotel_according_to_their_price_expected()"
});
formatter.result({
  "duration": 63917969,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_continue_button()"
});
formatter.result({
  "duration": 1075298437,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_book_a_hotel_page()"
});
formatter.result({
  "duration": 35528,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "User book a hotel",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;user-book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "User enters the first name in the first name field",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User enters the last name in the last name field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User enters the billing address in the billing address field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User enters the credit card number in the credit card number field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User enters the card type in the credit card type field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User enters the month and year in the expiry date field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User enters the CVV number in the CVV number field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User can able to book by clicking book now button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "After checked user clicks My Itineary button",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User navigates to Booked Itineary page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_first_name_in_the_first_name_field()"
});
formatter.result({
  "duration": 122014449,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_last_name_in_the_last_name_field()"
});
formatter.result({
  "duration": 110463446,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_billing_address_in_the_billing_address_field()"
});
formatter.result({
  "duration": 139405890,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_credit_card_number_in_the_credit_card_number_field()"
});
formatter.result({
  "duration": 102170772,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_card_type_in_the_credit_card_type_field()"
});
formatter.result({
  "duration": 90969525,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_month_and_year_in_the_expiry_date_field()"
});
formatter.result({
  "duration": 177404469,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_CVV_number_in_the_CVV_number_field()"
});
formatter.result({
  "duration": 83392942,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_can_able_to_book_by_clicking_book_now_button()"
});
formatter.result({
  "duration": 58422548,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.after_checked_user_clicks_My_Itineary_button()"
});
formatter.result({
  "duration": 6960530554,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_Booked_Itineary_page()"
});
formatter.result({
  "duration": 60003,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "User select the Itineary in Booked Itineary",
  "description": "",
  "id": "booking-functionality-in-the-adactin-application;user-select-the-itineary-in-booked-itineary",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 46,
  "name": "User can select the Itineary according to their needs",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "User clicks the logout button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User navigates to the logout page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_can_select_the_Itineary_according_to_their_needs()"
});
formatter.result({
  "duration": 121702195,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_logout_button()"
});
formatter.result({
  "duration": 715610295,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_the_logout_page()"
});
formatter.result({
  "duration": 74215,
  "status": "passed"
});
});