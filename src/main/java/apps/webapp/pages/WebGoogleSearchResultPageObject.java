package apps.webapp.pages;

import apps.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebGoogleSearchResultPageObject extends PageObject {

    @FindBy(xpath = "//div[@id='rso']/div")
    private List<WebElement> results;

    public WebGoogleSearchResultPageObject() {
        super("googleSearchResultPage");
    }

    public boolean isResultNotEmpty() {
        return !results.isEmpty();
    }
}
