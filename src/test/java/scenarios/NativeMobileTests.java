package scenarios;

import apps.nativeapp.NativeApp;
import entities.Profile;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NativeMobileTests extends BaseTest {

    @Test(groups = {"native"},
            dataProviderClass = MobileTestDataProvider.class,
            dataProvider = "correctProfile",
            description = "SignIn And SignUp with correct data")
    public void simpleNativeTest(Profile profile) {

        NativeApp app = new NativeApp();

        app.startPageObject().clickRegisterButton();
        app.registrationPageObject().signUp(profile);
        app.startPageObject().signIn(profile);

        String title = app.budgetActivityPageObject().getTitle();
        assertThat(title).isEqualTo("BudgetActivity");
    }
}
