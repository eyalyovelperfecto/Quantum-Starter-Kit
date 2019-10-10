@eyal
Feature: Testing my first App


  @simpleTest
  Scenario: test my first App
    Given I install application "PUBLIC:eyal/myFirstAndroidApp.apk"
      And I start application by id "yovel.onm.myfirstandroidapp"
      And I wait for "5" seconds

