package apps.webapp;

import apps.App;
import apps.webapp.pages.WebGoogleSearchResultPageObject;
import apps.webapp.pages.WebGoogleStartPageObject;

public class WebApp extends App {

    public WebApp() {
        init(
                new WebGoogleStartPageObject(),
                new WebGoogleSearchResultPageObject()
        );
    }

    public WebGoogleStartPageObject googleStartPage() {
        return (WebGoogleStartPageObject) page("googleStartPage");
    }

    public WebGoogleSearchResultPageObject googleSearchResultPage() {
        return (WebGoogleSearchResultPageObject) page("googleSearchResultPage");
    }
}
