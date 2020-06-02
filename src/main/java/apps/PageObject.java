package apps;

import driver.DriverHolder;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public abstract class PageObject {

    private final String name;

    protected PageObject(String name) {
        this.name = name;
        PageFactory.initElements(new AppiumFieldDecorator(DriverHolder.driver()), this);
    }

    public String name() {
        return name;
    }
}
