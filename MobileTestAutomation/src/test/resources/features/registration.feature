@AllSignupScenarios
Feature: Registration Feature Functionality

  Background:
    Given The user clicks the My Account button located in the footer section.
    And Clicks the Sign With Email button.

  Scenario: TC_02.01 The signup page should open.
    Then Verifies that the signup page has been opened.

  Scenario: TC_02.02 TC_01.02 The user should be able to sign up successfully.
    When Signs up with first name "Test", last name "Test", email "test@gmail.com", password "Test123." and phone number "5432109876".
    Then Verifies that a pop-up message appears with the text "To complete your membership, confirm the activation email sent to your email address." on the signup page.

  Scenario: TC_02.03 Privacy Notice link should be functional.
    When Clicks the Privacy Notice link.
    And Verifies that the privacy documents have been opened with the title "Privacy Policy".

  Scenario: TC_02.04 Terms Of Service link should be functional.
    When Clicks the Terms Of Service link.
    And Verifies that the terms of service documents have been opened with the title "Terms Of Service".

  Scenario: TC_02.05 On the signup page, "Already have an account?" button should be functional.
    When Clicks the Already have an account? button.
    Then Verifies that the login page opens with the text "Login with Email".

  Scenario: TC_02.06 Validation message should appear when trying to sign up with an existing email.
    When Signs up with first name "Test", last name "Test", email "existingEmail@gmail.com", password "Test123." and phone number "5432109876".
    Then Verifies that a message appears with the text "This email already existing. Forgot password? Click here." on the signup page.

  Scenario: TC_02.07 Error messages should appear when trying to log in without data.
    When Clicks the Sign up button.
    Then Verifies that a message appears with the text "Required" on the signup page.

  Scenario Outline: TC_02.08 Error message should appear when trying to sign up with invalid email.
    When Enters "<invalidEmail>" into the email box and clicks the Sign Up button.
    Then Verifies that a message appears with the text "Please enter a valid email address." for email field.
    Examples:
      | invalidEmail |
      | test         |
      | test@        |
      | test.com     |

  Scenario Outline: TC_032.09 Error message should appear when trying to sign up with invalid password.
    When Enters "<invalidPassword>" into the password box and clicks the Sign Up button.
    Then Verifies that a message appears with the text "<messages>" for password field.
    Examples:
      | invalidPassword | messages                                                         |
      | test         | Please enter at least 8 characters.                                 |
      | testtest     | Please enter at least 1 uppercase character, 1 number and 1 symbol. |

  Scenario Outline: TC_02.10 Error message should appear when trying to sign up with invalid phone number.
    When Enters "<invalidNumber>" into the phone box and clicks the Sign Up button.
    Then Verifies that a message appears with the text "<messages>" for phone number field.
    Examples:
      | invalidNumber | messages                                |
      | test         | Phone number must contains only numbers. |
      | &&&?}\{      | Phone number must contains only numbers. |
      | 53044444     | The phone number must be 10 digits.      |

  Scenario: TC_02.11 Verify that the Message Permission checkbox is unselected by default.
    Then Verifies that Electronic message permission checkbox is unselected.
