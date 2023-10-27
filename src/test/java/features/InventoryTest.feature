@inventory
Feature: Inventory


  Background:
    Given I open Login page
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory

@items_quantity
  Scenario: 6 inventory items are displayed
    And 6 items are displayed



  @sort_name_az
  Scenario: Sorting by name A-Z
    When I choose sort option by name A-Z
    Then all items sorted by name alphabetically




    @sort_price_low_high
    Scenario: Sorting by price from low to high
      When I choose sort option by price from low to high
      Then all items sorted by price from low to high