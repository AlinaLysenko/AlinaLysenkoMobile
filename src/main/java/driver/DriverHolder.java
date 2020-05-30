package driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.PropertyLoader;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("rawtypes")
public class DriverHolder {

    private static AppiumDriver driver;

    public static AppiumDriver createDriver(String appType) throws Exception {
        DesiredCapabilities capabilities = appType.equals("web")
                ? webCapabilities()
                : nativeCapabilities();

        driver = new AppiumDriver(
                new URL(System.getProperty("ts.appium")),
                capabilities);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static AppiumDriver driver() {
        return driver;
    }

    private static DesiredCapabilities nativeCapabilities() {
        Map<String, String> capabilities = defaultCapabilities();
        capabilities.put("app", new File(PropertyLoader.getProperty("app")).getAbsolutePath());
        return new DesiredCapabilities(capabilities);
    }

    private static DesiredCapabilities webCapabilities() {
        Map<String, String> capabilities = defaultCapabilities();
        capabilities.put("browserName", PropertyLoader.getProperty("browserName"));
        capabilities.put("chromedriverDisableBuildCheck", "true");
        return new DesiredCapabilities(capabilities);
    }

    private static Map<String, String> defaultCapabilities() {
        return new HashMap<String, String>() {{
            put("platformName", PropertyLoader.getProperty("platformName"));
            put("deviceName", PropertyLoader.getProperty("deviceName"));
        }};
    }
}
