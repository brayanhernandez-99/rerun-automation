Feature: Automation tests of Utest.com.
  As a user, I need to perform the Utest website automation to rerun escenarios failed.

  Background: Enter the website.
    Given the user is in the page Utest

  @login-invalid
  Scenario: Login in the website.
    When the user enter email and password
      | email             | password |
      | invalid@email.com | 12345    |
    Then the user will see "Invalid username or password"
