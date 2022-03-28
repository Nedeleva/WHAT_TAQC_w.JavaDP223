package pages.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Constants.ELEMENT_WAIT;
import static constants.Locators.RegistrationPage.*;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = REGISTRATION_FORM)
    private WebElement registrationForm;
    @FindBy(id = FIRST_NAME_FIELD)
    private WebElement firstNameField;
    @FindBy(id = LAST_NAME_FIELD)
    private WebElement lastNameField;
    @FindBy(id = EMAIL_ADDRESS_FIELD)
    private WebElement emailAddressField;
    @FindBy(id = PASSWORD_FIELD)
    private WebElement passwordField;
    @FindBy(id = CONFIRM_PASSWORD_FIELD)
    private WebElement confirmPasswordField;
    @FindBy(xpath = BUTTON_SIGN_UP)
    private WebElement buttonSignUp;
    @FindBy(xpath = LOGIN_LINK)
    private WebElement loginLink;

    @FindBy(xpath = BUTTON_BACK)
    private WebElement buttonBack;
    @FindBy(xpath = MESSAGE_REGISTRATION_DONE)
    private WebElement registrationDoneMessage;
    @FindBy(xpath = MESSAGE_REGISTRATION_DONE_TEXT)
    private WebElement registrationDoneText;

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public WebElement getEmailAddressField() {
        return emailAddressField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getConfirmPasswordField() {
        return confirmPasswordField;
    }

    public WebElement getRegistrationDoneMessage() {
        return registrationDoneMessage;
    }

    public WebElement getRegistrationDoneText() {
        return registrationDoneText;
    }

    public WebElement getButtonSignUp() {
        return buttonSignUp;
    }

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void waitRegistrationForm() {
        waitWebElementVisible(registrationForm, ELEMENT_WAIT);
    }

    public void fillFieldFirstName(String value) {
        super.fillField(firstNameField, value);
    }

    public void fillFieldLastName(String value) {
        super.fillField(lastNameField, value);
    }

    public void fillEmailAddress(String value) {
        super.fillField(emailAddressField, value);
    }

    public void fillPassword(String value) {
        super.fillField(passwordField, value);
    }

    public void fillConfirmPassword(String value) {
        super.fillField(confirmPasswordField, value);
    }

    public void clickButtonSignUp() {
        super.clickButton(buttonSignUp);
    }

    public void clickButtonBack() {
        super.clickButton(buttonBack);
    }

}