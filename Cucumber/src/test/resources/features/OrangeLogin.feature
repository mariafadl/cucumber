Feature: OrangeHRM Authentication
  Verify that authorized users can successfully access the dashboard

  Scenario: Successful login with valid credentials
    Given the user navigates to the login screen
    When the user provides correct username and password
    And the user submits the login form
    Then the user should land on the dashboard page
