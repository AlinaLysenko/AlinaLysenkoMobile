package scenarios;

import apps.webapp.WebApp;
import driver.DriverHolder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.PropertyLoader;

import static org.assertj.core.api.Assertions.assertThat;

public class WebMobileTests extends BaseTest {

    @Test(groups = {"web"},
            dataProviderClass = MobileTestDataProvider.class,
            dataProvider = "googleRequest",
            description = "Make sure that google request has not empty result")
    public void simpleWebTest(String request) {

        WebApp app = new WebApp();

        DriverHolder.driver().get(PropertyLoader.getProperty("url"));

        new WebDriverWait(DriverHolder.driver(), 10)
                .until(
                        wd -> ((JavascriptExecutor) wd)
                                .executeScript("return document.readyState")
                                .equals("complete")
                );

        app.googleStartPage().search(request);
        assertThat(app.googleSearchResultPage().isResultNotEmpty()).isTrue();
    }
}
