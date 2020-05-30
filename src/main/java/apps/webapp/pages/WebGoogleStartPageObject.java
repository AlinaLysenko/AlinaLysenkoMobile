package apps.webapp.pages;

import apps.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebGoogleStartPageObject extends PageObject {

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@class='Tg7LZd']")
    private WebElement findButton;

    public WebGoogleStartPageObject() {
        super("googleStartPage");
    }

    public void search(String request) {
        searchBox.sendKeys(request);
        findButton.click();
    }
}
