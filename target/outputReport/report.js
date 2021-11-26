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
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: unable to send message to renderer\n  (Session info: chrome\u003d96.0.4664.45)\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027SOWNDHARYA\u0027, ip: \u0027172.20.10.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [dbb28d2a8ca59e09883e8bcb9a4e6340, get {url\u003dhttp://adactinhotelapp.com/}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.45, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\SOWNDH~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:61337}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:61337/devtoo..., se:cdpVersion: 96.0.4664.45, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: dbb28d2a8ca59e09883e8bcb9a4e6340\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:328)\r\n\tat com.greens.Stepdef.AddctinStepDef.user_Launch_the_browser(AddctinStepDef.java:52)\r\n\tat ✽.User Launch the browser(file:/F:/JAVA%20course/workspace/CucumberSample/src/test/resources/FeatureFile/addactin.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User Login with Valid Details \"sowndharya97sathy\" and \"Sownd@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddctinStepDef.user_Login_with_Valid_Details(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Clicks the Login Button",
  "keyword": "When "
});
formatter.match({
  "location": "AddctinStepDef.user_Clicks_the_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate the HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "AddctinStepDef.validate_the_HomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Enters the details for Room",
  "keyword": "And "
});
formatter.match({
  "location": "AddctinStepDef.user_Enters_the_details_for_Room()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks Search button",
  "keyword": "When "
});
formatter.match({
  "location": "AddctinStepDef.user_clicks_Search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate the Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddctinStepDef.validate_the_Search_Hotel_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Selects the hotel",
  "keyword": "And "
});
formatter.match({
  "location": "AddctinStepDef.user_Selects_the_hotel()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks Continue Button",
  "keyword": "When "
});
formatter.match({
  "location": "AddctinStepDef.user_clicks_Continue_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddctinStepDef.validate_Book_Hotel_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enter the userDetails and Payment Details",
  "keyword": "And "
});
formatter.match({
  "location": "AddctinStepDef.user_enter_the_userDetails_and_Payment_Details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks Book Now button",
  "keyword": "When "
});
formatter.match({
  "location": "AddctinStepDef.user_clicks_Book_Now_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate Booking Confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "AddctinStepDef.validate_Booking_Confirmation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Fetch Order Number and store in Excel",
  "keyword": "And "
});
formatter.match({
  "location": "AddctinStepDef.fetch_Order_Number_and_store_in_Excel()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Clicks MyItenary",
  "keyword": "When "
});
formatter.match({
  "location": "AddctinStepDef.user_Clicks_MyItenary()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate the Booking confirmation Detials",
  "keyword": "Then "
});
formatter.match({
  "location": "AddctinStepDef.validate_the_Booking_confirmation_Detials()"
});
formatter.result({
  "status": "skipped"
});
});