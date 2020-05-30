package apps.nativeapp;

import apps.App;
import apps.nativeapp.pages.NativeBudgetActivityPageObject;
import apps.nativeapp.pages.NativeRegistrationPageObject;
import apps.nativeapp.pages.NativeStartPageObject;

public class NativeApp extends App {

    public NativeApp() {
        init(
                new NativeStartPageObject(),
                new NativeRegistrationPageObject(),
                new NativeBudgetActivityPageObject()
        );
    }

    public NativeStartPageObject startPageObject() {
        return (NativeStartPageObject) page("startPage");
    }

    public NativeRegistrationPageObject registrationPageObject() {
        return (NativeRegistrationPageObject) page("registrationPage");
    }

    public NativeBudgetActivityPageObject budgetActivityPageObject() {
        return (NativeBudgetActivityPageObject) page("budgetActivityPage");
    }
}
