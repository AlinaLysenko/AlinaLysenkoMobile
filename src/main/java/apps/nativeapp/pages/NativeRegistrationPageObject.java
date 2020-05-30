package apps.nativeapp.pages;

import apps.PageObject;
import entities.Profile;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class NativeRegistrationPageObject extends PageObject {

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_email")
    private WebElement emailField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_username")
    private WebElement usernameField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_password")
    private WebElement passwordField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_confirm_password")
    private WebElement confirmPasswordField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_new_account_button")
    private WebElement registerNewAccountButton;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_cancel_button ")
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
