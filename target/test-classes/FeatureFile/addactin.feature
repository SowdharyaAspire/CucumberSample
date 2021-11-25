@tag
Feature: Room Booking
  I Want to use the room booking template for my feauture file

  Scenario Outline: As a user, I want to book the room and Store its order number in Excel
    Given User Launch the browser
    And User Login with Valid Details "<username>" and "<password>"
    When User Clicks the Login Button
    Then Validate the HomePage
    And User Enters the details for Room
    When User clicks Search button
    Then Validate the Search Hotel Page
    And User Selects the hotel 
    When User clicks Continue Button
    Then Validate Book Hotel Page
    And User enter the userDetails and Payment Details
    When User clicks Book Now button
    Then Validate Booking Confirmation
    And Fetch Order Number and store in Excel
    When User Clicks MyItenary
    Then Validate the Booking confirmation Detials

 Examples:
 |username|password|
 |sowndharya97sathy|Sownd@123|
 