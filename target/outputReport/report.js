$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/F:/JAVA%20course/workspace/CucumberSample/src/test/resources/FeatureFile/addactin.feature");
formatter.feature({
  "name": "Room Booking",
  "description": "  I Want to use the room booking template for my feauture file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "As a user, I want to book the room and Store its order number in Excel",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User Login with Valid Details \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User Clicks the Login Button",
  "keyword": "When "
});
formatter.step({
  "name": "Validate the HomePage",
  "keyword": "Then "
});
formatter.step({
  "name": "User Enters the details for Room",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks Search button",
  "keyword": "When "
});
formatter.step({
  "name": "Validate the Search Hotel Page",
  "keyword": "Then "
});
formatter.step({
  "name": "User Selects the hotel",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks Continue Button",
  "keyword": "When "
});
formatter.step({
  "name": "Validate Book Hotel Page",
  "keyword": "Then "
});
formatter.step({
  "name": "User enter the userDetails and Payment Details",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks Book Now button",
  "keyword": "When "
});
formatter.step({
  "name": "Validate Booking Confirmation",
  "keyword": "Then "
});
formatter.step({
  "name": "Fetch Order Number and store in Excel",
  "keyword": "And "
});
formatter.step({
  "name": "User Clicks MyItenary",
  "keyword": "When "
});
formatter.step({
  "name": "Validate the Booking confirmation Detials",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "sowndharya97sathy",
        "Sownd@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As a user, I want to book the room and Store its order number in Excel",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "User Launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "AddctinStepDef.user_Launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Login with Valid Details \"sowndharya97sathy\" and \"Sownd@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddctinStepDef.user_Login_with_Valid_Details(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks the Login Button",
  "keyword": "When "
});
formatter.match({
  "location": "AddctinStepDef.user_Clicks_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "AddctinStepDef.validate_the_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters the details for Room",
  "keyword": "And "
});
formatter.match({
  "location": "AddctinStepDef.user_Enters_the_details_for_Room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Search button",
  "keyword": "When "
});
formatter.match({
  "location": "AddctinStepDef.user_clicks_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddctinStepDef.validate_the_Search_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Selects the hotel",
  "keyword": "And "
});
formatter.match({
  "location": "AddctinStepDef.user_Selects_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Continue Button",
  "keyword": "When "
});
formatter.match({
  "location": "AddctinStepDef.user_clicks_Continue_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddctinStepDef.validate_Book_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the userDetails and Payment Details",
  "keyword": "And "
});
formatter.match({
  "location": "AddctinStepDef.user_enter_the_userDetails_and_Payment_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Book Now button",
  "keyword": "When "
});
formatter.match({
  "location": "AddctinStepDef.user_clicks_Book_Now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Booking Confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "AddctinStepDef.validate_Booking_Confirmation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fetch Order Number and store in Excel",
  "keyword": "And "
});
formatter.match({
  "location": "AddctinStepDef.fetch_Order_Number_and_store_in_Excel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks MyItenary",
  "keyword": "When "
});
formatter.match({
  "location": "AddctinStepDef.user_Clicks_MyItenary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the Booking confirmation Detials",
  "keyword": "Then "
});
formatter.match({
  "location": "AddctinStepDef.validate_the_Booking_confirmation_Detials()"
});
formatter.result({
  "status": "passed"
});
});