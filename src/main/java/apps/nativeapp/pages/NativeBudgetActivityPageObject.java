package apps.nativeapp.pages;

import apps.PageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class NativeBudgetActivityPageObject extends PageObject {

    @AndroidFindBy(xpath =
            "/hierarchy" +
            "/android.widget.FrameLayout" +
            "/android.widget.LinearLayout" +
            "/android.widget.FrameLayout" +
            "/android.view.ViewGroup" +
            "/android.widget.FrameLayout[2]" +
            "/android.view.ViewGroup" +
            "/android.widget.TextView")
    private WebElement title;

    public NativeBudgetActivityPageObject() {
        super("budgetActivityPage");
    }

    public String getTitle() {
        return title.getText();
    }
}
