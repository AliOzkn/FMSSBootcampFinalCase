package pages;

import io.appium.java_client.AppiumBy;
import lombok.Getter;

@Getter
public class Registration {
    /*------------------------------------------------------------------------------------------------------------------
    BACKGROUND */
    private final AppiumBy signWithEmailBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/signup_with_email");
    /*------------------------------------------------------------------------------------------------------------------
    TC_02.01 */
    private final AppiumBy signUpBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/signup");
    /*------------------------------------------------------------------------------------------------------------------
    TC_02.02 */
    private final AppiumBy firstNameBox = (AppiumBy) AppiumBy.id("com.rentfly.app:id/fName");
    private final AppiumBy lastNameBox = (AppiumBy) AppiumBy.id("com.rentfly.app:id/lName");
    private final AppiumBy emailBox = (AppiumBy) AppiumBy.id("com.rentfly.app:id/email");
    private final AppiumBy passwordBox = (AppiumBy) AppiumBy.id("com.rentfly.app:id/password");
    private final AppiumBy phoneNumBox = (AppiumBy) AppiumBy.id("com.rentfly.app:id/phoneNum");
    private final AppiumBy signupPagePopUpMessage = (AppiumBy) AppiumBy.xpath("//android.widget.TextView[@content-desc='pop_up_message' and @text='pop_up_message']");
    /*------------------------------------------------------------------------------------------------------------------
    TC_02.03 */
    private final AppiumBy privacyPolicy = (AppiumBy) AppiumBy.id("com.rentfly.app:id/privacyPolicy");
    private final AppiumBy privacyPolicyPageTitle = (AppiumBy) AppiumBy.id("com.rentfly.app:id/privacyPolicy");
    /*------------------------------------------------------------------------------------------------------------------
     TC_02.04 */
    private final AppiumBy termsOfService = (AppiumBy) AppiumBy.id("com.rentfly.app:id/termsOfService");
    private final AppiumBy termsOfServicePageTitle = (AppiumBy) AppiumBy.id("com.rentfly.app:id/termsOfService");
    /*------------------------------------------------------------------------------------------------------------------
    TC_02.05 */
    private final AppiumBy alreadyHaveAnAccountBtn = (AppiumBy) AppiumBy.xpath("//android.widget.Button[@content-desc='Already Have An Account?']");
    private final AppiumBy loginWithEmailText = (AppiumBy) AppiumBy.xpath("//android.widget.Button[@content-desc='Login With Email']");
    /*------------------------------------------------------------------------------------------------------------------
    TC_02.06 */
    private final AppiumBy signupPageEmailErrorMessage = (AppiumBy) AppiumBy.xpath("//android.widget.TextView[@content-desc='signup_email_error_message' and @text='Error Message]");
    /*------------------------------------------------------------------------------------------------------------------
    TC_02.09 */
    private final AppiumBy signupPagePasswordErrorMessage = (AppiumBy) AppiumBy.xpath("//android.widget.TextView[@content-desc='signup_password_error_message' and @text='Error Message]");
    /*------------------------------------------------------------------------------------------------------------------
    TC_02.10 */
    private final AppiumBy signupPagePhoneNumberErrorMessage = (AppiumBy) AppiumBy.xpath("//android.widget.TextView[@content-desc='signup_phoneNumber_error_message' and @text='Error Message]");
    /*------------------------------------------------------------------------------------------------------------------
    TC_02.011 */
    private final AppiumBy permissionCheckbox = (AppiumBy) AppiumBy.id("com.rentfly.app:id/permissionBox");


}
