Feature: Login feature
  As user, I should not be able to log in to etsy account with invalid credentials.

  Scenario: Not Login with invalid credentials (negative)
    Given user clicks on get started
    When user try to log in with invalid credentials
    Then user verifies that the error message is displayed