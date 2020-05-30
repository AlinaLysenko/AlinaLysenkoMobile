package apps.nativeapp.pages;

import apps.PageObject;
import entities.Profile;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class NativeStartPageObject extends PageObject {

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_email")
    private WebElement login;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_pwd")
    private WebElement password;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/email_sign_in_button")
    private WebElement signInButton;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_button")
    private WebElement registerButton;

    public NativeStartPageObject() {
        super("startPage");
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void signIn(Profile profile) {
        login.sendKeys(profile.getEmail());
        password.sendKeys(profile.getPassword());
        signInButton.click();
    }
}
