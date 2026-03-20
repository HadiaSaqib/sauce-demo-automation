Feature: Sauce Demo Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters username "standard_user" and password "secret_sauce"
    And clicks the login button
    Then the products page should be displayed

  Scenario: Login with invalid credentials
    Given the user is on the login page
    When the user enters username "wrong_user" and password "wrong_pass"
    And clicks the login button
    Then an error message should be displayed

  Scenario: Login with locked out user
    Given the user is on the login page
    When the user enters username "locked_out_user" and password "secret_sauce"
    And clicks the login button
    Then an error message should be displayed

  Scenario: Login with empty username
    Given the user is on the login page
    When the user enters username "" and password "secret_sauce"
    And clicks the login button
    Then an error message should be displayed

  Scenario: Login with empty password
    Given the user is on the login page
    When the user enters username "standard_user" and password ""
    And clicks the login button
    Then an error message should be displayed

  Scenario: Intentional failing test case
    Given the user is on the login page
    When the user enters username "standard_user" and password "secret_sauce"
    And clicks the login button
    Then an error message should be displayed