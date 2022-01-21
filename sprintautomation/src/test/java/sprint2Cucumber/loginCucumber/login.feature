Feature: Login user with email and password

  Scenario: Login user
    Given user is at homepage
    Then click on login button
    Then login user with email and password
    And verify user is logged in
