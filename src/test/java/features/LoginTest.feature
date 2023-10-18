Feature: Login


  Scenario: Success login with valid data
    Given I open Login page
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory

  Scenario: Login with locked out user


  Scenario: Login with invalid password
