@eyal
Feature: Testing my first App


  @simpleTest
  Scenario: test my first App
    Given I install application "PUBLIC:eyal/myFirstAndroidApp.apk"
      And I start application by id "yovel.onm.myfirstandroidapp"
      When I type to my first App "perfecto"
       And I click on the set title in my first App
      Then the title of my first App is "perfecto"

