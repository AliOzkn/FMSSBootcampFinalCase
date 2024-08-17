package stepDefinitions;

import io.cucumber.java.en.*;
import pages.Registration;

import static org.junit.Assert.*;
import static utilities.Driver.driver;

public class RegistrationSteps extends Registration {

    /*------------------------------------------------------------------------------------------------------------------
    BACKGROUND */
    @And("Clicks the Sign With Email button.")
    public void clicksTheSignWithEmailButton() {
        driver.findElement(getSignWithEmailBtn()).click();
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_02.01  */
    @Then("Verifies that the signup page has been opened.")
    public void verifiesThatTheSignupPageHasBeenOpened() {
        assertTrue(driver.findElement(getSignUpBtn()).isDisplayed());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_02.02  */
    @When("Signs up with first name {string}, last name {string}, email {string}, password {string} and phone number {string}.")
    public void signsUpWithFirstNameLastNameEmailPasswordAndPhoneNumber(String fName, String lName, String email, String password, String phoneNumber) {
        driver.findElement(getFirstNameBox()).click();
        driver.findElement(getFirstNameBox()).sendKeys(fName);
        driver.findElement(getLastNameBox()).click();
        driver.findElement(getLastNameBox()).sendKeys(lName);
        driver.findElement(getEmailBox()).click();
        driver.findElement(getEmailBox()).sendKeys(email);
        driver.findElement(getPasswordBox()).click();
        driver.findElement(getPasswordBox()).sendKeys(password);
        driver.findElement(getPhoneNumBox()).click();
        driver.findElement(getPhoneNumBox()).sendKeys(phoneNumber);
        driver.findElement(getSignUpBtn()).click();
    }

    @Then("Verifies that a pop-up message appears with the text {string} on the signup page.")
    public void verifiesThatAPopUpMessageAppearsWithTheTextOnTheSignupPage(String message) {
        assertEquals(message, driver.findElement(getSignupPagePopUpMessage()).getText());
    }
    
    /*------------------------------------------------------------------------------------------------------------------
    TC_02.03 */
    @When("Clicks the Privacy Notice link.")
    public void clicksThePrivacyNoticeLink() {
        driver.findElement(getPrivacyPolicy()).click();
    }

    @And("Verifies that the privacy documents have been opened with the title {string}.")
    public void verifiesThatThePrivacyDocumentsHaveBeenOpenedWithTheTitle(String pageTitle) {
        assertEquals(pageTitle, driver.findElement(getPrivacyPolicyPageTitle()).getText());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_02.04 */
    @When("Clicks the Terms Of Service link.")
    public void clicksTheTermsOfServiceLink() {
        driver.findElement(getTermsOfService()).click();
    }

    @And("Verifies that the terms of service documents have been opened with the title {string}.")
    public void verifiesThatTheTermsOfServiceDocumentsHaveBeenOpenedWithTheTitle(String pageTitle) {
        assertEquals(pageTitle, driver.findElement(getTermsOfServicePageTitle()).getText());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_02.05 */
    @When("Clicks the Already have an account? button.")
    public void clicksTheAlreadyHaveAnAccountButton() {
        driver.findElement(getAlreadyHaveAnAccountBtn()).click();
    }

    @Then("Verifies that the login page opens with the text {string}.")
    public void verifiesThatTheLoginPageOpensWithTheText(String loginPageTitle) {
        assertEquals(loginPageTitle, driver.findElement(getLoginWithEmailText()).getText());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_02.06 */
    @Then("Verifies that a message appears with the text {string} on the signup page.")
    public void verifiesThatAMessageAppearsWithTheTextOnTheSignupPage(String errorMessage) {
        assertEquals(errorMessage, driver.findElement(getSignupPageEmailErrorMessage()).getText());
    }

    /*------------------------------------------------------------------------------------------------------------------
       TC_02.07 */
    @When("Clicks the Sign up button.")
    public void clicksTheSignUpButton() {
        driver.findElement(getSignUpBtn()).click();
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_02.08 */
    @When("Enters {string} into the email box and clicks the Sign Up button.")
    public void entersIntoTheEmailBoxAndClicksTheSignUpButton(String invalidEmail) {
        driver.findElement(getEmailBox()).click();
        driver.findElement(getEmailBox()).sendKeys(invalidEmail);
        driver.findElement(getSignUpBtn()).click();
    }

    @Then("Verifies that a message appears with the text {string} for email field.")
    public void verifiesThatAMessageAppearsWithTheTextForEmailField(String errorMessage) {
        assertEquals(errorMessage, driver.findElement(getSignupPageEmailErrorMessage()).getText());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_02.09 */
    @When("Enters {string} into the password box and clicks the Sign Up button.")
    public void entersIntoThePasswordBoxAndClicksTheSignUpButton(String invalidPassword) {
        driver.findElement(getPasswordBox()).click();
        driver.findElement(getPasswordBox()).sendKeys(invalidPassword);
        driver.findElement(getSignUpBtn()).click();
    }

    @Then("Verifies that a message appears with the text {string} for password field.")
    public void verifiesThatAMessageAppearsWithTheTextForPasswordField(String errorMessage) {
        assertEquals(errorMessage, driver.findElement(getSignupPagePasswordErrorMessage()).getText());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_02.10 */
    @When("Enters {string} into the phone box and clicks the Sign Up button.")
    public void entersIntoThePhoneBoxAndClicksTheSignUpButton(String invalidNumber) {
        driver.findElement(getPhoneNumBox()).click();
        driver.findElement(getPhoneNumBox()).sendKeys(invalidNumber);
        driver.findElement(getSignUpBtn()).click();
    }

    @Then("Verifies that a message appears with the text {string} for phone number field.")
    public void verifiesThatAMessageAppearsWithTheTextForPhoneNumberField(String errorMessage) {
        assertEquals(errorMessage, driver.findElement(getSignupPagePhoneNumberErrorMessage()).getText());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_02.11 */
    @Then("Verifies that Electronic message permission checkbox is unselected.")
    public void verifiesThatElectronicMessagePermissionCheckboxIsUnselected() {
        assertFalse(driver.findElement(getPermissionCheckbox()).isSelected());
    }
}
