@login
Feature: Login


  Background:
    Given I open Login page


  @success_login
  Scenario: Success login with valid data
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory



    @invalid_data
    Scenario Outline: Login with invalid data
      When I input "<username>" to username field
      And input "<password>" to password field
      When I push the Login button
      Then error message about invalid user with text "<errorMessageText>" is displayed
      Examples:
        |username        | password     |errorMessageText                                             |
        |standard_user   | 34567890     |Username and password do not match any user in this service  |
        |standard_userr  | secret_sauce |Username and password do not match any user in this service  |
        |locked_out_user |secret_sauce  |Sorry, this user has been locked out.                        |


  @empty_fields
  Scenario Outline: Login with empty fields
    When I input "<username>" to username field
    And input "<password>" to password field
    When I push the Login button
    Then error message about invalid user with text "<errorMessageText>" is displayed
    Examples:
      |username        | password     |errorMessageText         |
      |                | 34567890     |Username is required     |
      |standard_userr  |              |Password is required     |
      |                |              |Username is required     |



