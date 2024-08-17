@AllLoginScenarios
Feature: Login Feature Functionality

  Background:
    Given The user clicks the My Account button located in the footer section.
    And Clicks the Login With Email button.

  Scenario: TC_01.01 The login page should open.
    Then Verifies that the login page has been opened.

  Scenario: TC_01.02 The user should be able to log in successfully.
    When Logs in with email "test@gmail.com" and password "Test123.".
    Then Verifies that the first name and last name appears in the header section with the text "Test Test".

  Scenario: TC_01.03 On the login page, "Need An Account?" button should be functional.
    When Clicks the Need An Account? button.
    Then Verifies that the signup page opens with the text "Create An Account".

  Scenario: TC_01.04 On the login page, forgot password button should be functional.
    When Clicks the Forgot Password? button and enters "test@gmail.com" into the email box and clicks the Reset Password button.
    Then Verifies that a pop-up message appears with the text "E-mail Sent Successfully" on the forgot password page.

  Scenario: TC_01.05 On the forgot password page, error message should appear when trying to reset password with unregistered email.
    When Clicks the Forgot Password? button and enters "unregistered@gmail.com" into the email box and clicks the Reset Password button.
    Then Verifies that a pop-up message appears with the text "This email address could not be found." on the forgot password page.

  Scenario: TC_01.06 On the login page, the Show Hide Password button should be functional.
    When Enters "Test123." into the password box and clicks the ShowHide Password button.
    Then Verifies that the password is visible with the value "Test123."

  Scenario Outline: TC_01.07 Error message should appear when trying to log in with invalid data.
    When Logs in with email "<email>" and password "<password>".
    Then Verifies that a message appears with the text "<message>" on the login page.
    Examples:
    # 1) Valid email, invalid password
    # 2) Invalid email, valid password
    # 3) Both invalid
    # 4) Both empty
      | email          | password  | message             |
      | test@gmail.com | admin1234 | Invalid password    |
      | admin1234      | Test123.  | Invalid email       |
      | admin1234      | admin1234 | Invalid credentials |
      | "      "       | "      "  | Required            |


  Scenario: TC_01.08 When attempting to log in with an account that has not been activated, the resend mail screen should appear.
    When Logs in with email "unactivated@gmail.com" and password "Test123.".
    Then Verifies that the resend email page opens.
    When Clicks the Resend Email button.
    Then Verifies that a pop-up message appears with the text "E-mail sent successfully" on the login page.

  Scenario: TC_01.09 Log in with Facebook social media account.
    When Clicks the Facebook button.
    Then Verifies that the relevant page opens with the title "Log in to Facebook".

  Scenario: TC_01.10 Log in with X social media account.
    When Clicks the X button.
    Then Verifies that the relevant page opens with the title "Twitter / Authorize ann application".

  Scenario: TC_01.11 Log in with Google account.
    When Clicks the Google button.
    Then Verifies that the relevant page opens with the title "Sign in - Google Accounts".

  Scenario: TC_01.12 Verify that the Keep me logged in checkbox is unselected by default.
    Then Verifies that Keep Me logged in checkbox is unselected.

  Scenario: TC_01.13 The user should be able to log out successfully.
    When Logs in with email "test@gmail.com" and password "Test123.".
    And Clicks the profile button located in the header section.
    And Clicks the logout button from the dropdown menu that appears.
    Then Verifies that the login button appears instead of the username in the header section.