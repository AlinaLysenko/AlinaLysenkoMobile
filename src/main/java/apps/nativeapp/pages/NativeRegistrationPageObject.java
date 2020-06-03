package apps.nativeapp.pages;

import apps.PageObject;
import entities.Profile;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class NativeRegistrationPageObject extends PageObject {

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_email")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='user@example.com']")
    private WebElement emailField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_username")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='TimApple']")
    private WebElement usernameField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_password")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Required']")
    private WebElement passwordField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_confirm_password")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Repeat please']")
    private WebElement confirmPasswordField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_new_account_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Register new account']")
    private WebElement registerNewAccountButton;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_cancel_button ")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Сancel']")
    private WebElement cancelButton;

    public NativeRegistrationPageObject() {
        super("registrationPage");
    }

    public void signUp(Profile profile) {
        emailField.sendKeys(profile.getEmail());
        usernameField.sendKeys(profile.getUsername());
        passwordField.sendKeys(profile.getPassword());
        confirmPasswordField.sendKeys(profile.getPassword());
        registerNewAccountButton.click();
    }
}
