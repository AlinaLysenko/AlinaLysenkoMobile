package apps.nativeapp.pages;

import apps.PageObject;
import entities.Profile;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class NativeStartPageObject extends PageObject {

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_email")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='user@example.com']")
    private WebElement login;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_pwd")
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_pwd")
    private WebElement password;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/email_sign_in_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sign In']")
    private WebElement signInButton;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Register new account']")
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
