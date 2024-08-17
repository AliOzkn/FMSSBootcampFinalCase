package stepDefinitions;

import io.cucumber.java.en.*;
import pages.Login;

import static org.junit.Assert.*;
import static utilities.Driver.driver;

public class LoginSteps extends Login {

    /*------------------------------------------------------------------------------------------------------------------
    BACKGROUND */
    @Given("The user clicks the My Account button located in the footer section.")
    public void theUserClicksTheMyAccountButtonLocatedInTheFooterSection() {
        driver.findElement(getFooterMyAccountBtn()).click();
    }

    @And("Clicks the Login With Email button.")
    public void clicksTheLoginWithEmailButton() {
        driver.findElement(getLoginWithEmailBtn()).click();
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_01.01 */
    @Then("Verifies that the login page has been opened.")
    public void verifiesThatTheLoginPageHasBeenOpened() {
        assertTrue(driver.findElement(getLoginBtn()).isDisplayed());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_01.02 */
    @When("Logs in with email {string} and password {string}.")
    public void logsInWithEmailAndPassword(String email, String password) {
        driver.findElement(getEmailBox()).click();
        driver.findElement(getEmailBox()).sendKeys(email);
        driver.findElement(getPasswordBox()).click();
        driver.findElement(getPasswordBox()).sendKeys(password);
        driver.findElement(getLoginBtn()).click();
    }

    @Then("Verifies that the first name and last name appears in the header section with the text {string}.")
    public void verifiesThatTheFirstNameAndLastNameAppearsInTheHeaderSectionWithTheText(String nameAndSurname) {
        assertEquals(nameAndSurname, driver.findElement(getNameInHeaders()).getText());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_01.03 */
    @When("Clicks the Need An Account? button.")
    public void clicksTheNeedAnAccountButton() {
        driver.findElement(getNeedAnAccountBtn()).click();
    }

    @Then("Verifies that the signup page opens with the text {string}.")
    public void verifiesThatTheSignupPageOpensWithTheText(String signupTitle) {
        assertEquals(signupTitle, driver.findElement(getCreateAnAccountText()).getText());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_01.04 */
    @When("Clicks the Forgot Password? button and enters {string} into the email box and clicks the Reset Password button.")
    public void clicksTheForgotPasswordButtonAndEntersIntoTheEmailBoxAndClicksTheResetPasswordButton(String email) {
        driver.findElement(getForgotPasswordBtn()).click();
        driver.findElement(getEmailBox()).click();
        driver.findElement(getEmailBox()).sendKeys(email);
        driver.findElement(getResetPasswordBtn()).click();
    }

    @Then("Verifies that a pop-up message appears with the text {string} on the forgot password page.")
    public void verifiesThatAPopUpMessageAppearsWithTheTextOnTheForgotPasswordPage(String informationMessage) {
        assertEquals(informationMessage, driver.findElement(getForgotPasswordPagePopUpMessage()).getText());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_01.06 */
    @When("Enters {string} into the password box and clicks the ShowHide Password button.")
    public void entersIntoThePasswordBoxAndClicksTheShowHidePasswordButton(String password) {
        driver.findElement(getPasswordBox()).click();
        driver.findElement(getPasswordBox()).sendKeys(password);
        driver.findElement(getShowHidePasswordBtn()).click();
    }

    @Then("Verifies that the password is visible with the value {string}")
    public void verifiesThatThePasswordIsVisibleWithTheValue(String visibleValue) {
        assertTrue(driver.findElement(getPasswordBox()).getAttribute("placeholder").contains(visibleValue));
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_01.07 */
    @Then("Verifies that a message appears with the text {string} on the login page.")
    public void verifiesThatAMessageAppearsWithTheTextOnTheLoginPage(String errorMessage) {
        assertEquals(errorMessage, driver.findElement(getInvalidDataMessage()).getText());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_01.08 */
    @Then("Verifies that the resend email page opens.")
    public void verifiesThatTheResendEmailPageOpens() {
        assertTrue(driver.findElement(getResendEmailBtn()).isDisplayed());
    }

    @When("Clicks the Resend Email button.")
    public void clicksTheResendEmailButton() {
        driver.findElement(getResendEmailBtn()).click();
    }

    @Then("Verifies that a pop-up message appears with the text {string} on the login page.")
    public void verifiesThatAPopUpMessageAppearsWithTheTextOnTheLoginPage(String informationMessage) {
        assertEquals(informationMessage, driver.findElement(getLoginPagePopUpMessage()).getText());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_01.09 */
    @When("Clicks the Facebook button.")
    public void clicksTheFacebookButton() {
        driver.findElement(getFacebookBtn()).click();
    }

    @Then("Verifies that the relevant page opens with the title {string}.")
    public void verifiesThatTheRelevantPageOpensWithTheTitle(String socialMediaTitle) {
        assertEquals(socialMediaTitle, driver.getTitle());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_01.10 */
    @When("Clicks the X button.")
    public void clicksTheXButton() {
        driver.findElement(getXBtn()).click();
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_01.11 */
    @When("Clicks the Google button.")
    public void clicksTheGoogleButton() {
        driver.findElement(getGoogleBtn()).click();
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_01.12 */
    @Then("Verifies that Keep Me logged in checkbox is unselected.")
    public void verifiesThatKeepMeLoggedInCheckboxIsUnselected() {
        assertFalse(driver.findElement(getRememberMeBtn()).isSelected());
    }

    /*------------------------------------------------------------------------------------------------------------------
    TC_01.13 */
    @And("Clicks the profile button located in the header section.")
    public void clicksTheProfileButtonLocatedInTheHeaderSection() {
        driver.findElement(getHeaderProfileBtn()).click();
    }

    @And("Clicks the logout button from the dropdown menu that appears.")
    public void clicksTheLogoutButtonFromTheDropdownMenuThatAppears() {
        driver.findElement(getDropdownLogoutBtn()).click();
    }

    @Then("Verifies that the login button appears instead of the username in the header section.")
    public void verifiesThatTheLoginButtonAppearsInsteadOfTheUsernameInTheHeaderSection() {
        assertTrue(driver.findElement(getHeaderLoginBtn()).isDisplayed());
    }
}
