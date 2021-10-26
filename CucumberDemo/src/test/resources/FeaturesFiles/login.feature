Feature: feature to test login fuctionality

  Scenario: Check login is successfull with valid credentials
    Given user is on policycenter login page
    When user enter username and password
    And clicks on login button
    Then user is navigated to policycenter My Summary page
