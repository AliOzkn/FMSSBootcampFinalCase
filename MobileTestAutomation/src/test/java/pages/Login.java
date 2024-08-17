package pages;

import io.appium.java_client.AppiumBy;
import lombok.Getter;

@Getter
public class Login {
    /*------------------------------------------------------------------------------------------------------------------
    BACKGROUND */
    private final AppiumBy footerMyAccountBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/footer_my_account");
    private final AppiumBy loginWithEmailBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/login_with_email");
    /*------------------------------------------------------------------------------------------------------------------
    TC_01.02 */
    private final AppiumBy emailBox = (AppiumBy) AppiumBy.id("com.rentfly.app:id/email");
    private final AppiumBy passwordBox = (AppiumBy) AppiumBy.id("com.rentfly.app:id/password");
    private final AppiumBy loginBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/login");
    private final AppiumBy nameInHeaders = (AppiumBy) AppiumBy.xpath("//android.widget.Button[@content-desc='MyAccount']");
    /*------------------------------------------------------------------------------------------------------------------
    TC_01.03 */
    private final AppiumBy needAnAccountBtn = (AppiumBy) AppiumBy.xpath("//android.widget.Button[@content-desc='Need An Account?']");
    private final AppiumBy createAnAccountText = (AppiumBy) AppiumBy.xpath("//android.widget.Button[@content-desc='Create An Account']");
    /*------------------------------------------------------------------------------------------------------------------
    TC_01.04 */
    private final AppiumBy forgotPasswordBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/forgot_password");
    private final AppiumBy resetPasswordBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/reset_password");
    private final AppiumBy forgotPasswordPagePopUpMessage = (AppiumBy) AppiumBy.xpath("//android.widget.TextView[@content-desc='pop_up_message' and @text='pop_up_message']");
    /*------------------------------------------------------------------------------------------------------------------
    TC_01.06 */
    private final AppiumBy showHidePasswordBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/show_hide_password");
    /*------------------------------------------------------------------------------------------------------------------
    TC_01.07 */
    private final AppiumBy invalidDataMessage = (AppiumBy) AppiumBy.xpath("//android.widget.TextView[@content-desc='invalid_data_message' and @text='Invalid data']");
    /*------------------------------------------------------------------------------------------------------------------
    TC_01.08 */
    private final AppiumBy resendEmailBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/resend_email");
    private final AppiumBy loginPagePopUpMessage = (AppiumBy) AppiumBy.xpath("//android.widget.TextView[@content-desc='pop_up_message' and @text='pop_up_message']");
    /*------------------------------------------------------------------------------------------------------------------
    TC_01.09 */
    private final AppiumBy facebookBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/facebook");
    /*------------------------------------------------------------------------------------------------------------------
    TC_01.10 */
    private final AppiumBy xBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/x");
    /*------------------------------------------------------------------------------------------------------------------
    TC_01.11 */
    private final AppiumBy googleBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/google");
    /*------------------------------------------------------------------------------------------------------------------
    TC_01.12 */
    private final AppiumBy rememberMeBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/keep_me_logged_in");
    /*------------------------------------------------------------------------------------------------------------------
    TC_01.13 */
    private final AppiumBy headerProfileBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/profile");
    private final AppiumBy dropdownLogoutBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/logout");
    private final AppiumBy headerLoginBtn = (AppiumBy) AppiumBy.id("com.rentfly.app:id/login");
}
