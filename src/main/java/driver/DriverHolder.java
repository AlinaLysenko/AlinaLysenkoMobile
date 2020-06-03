package driver;

import entities.Capabilities;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("rawtypes")
public class DriverHolder {

    private static AppiumDriver driver;

    public static AppiumDriver createDriver(Capabilities GivenCapabilities) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities(GivenCapabilities.toMap());
        driver = new AppiumDriver(
                new URL(System.getProperty("ts.appium")),
                capabilities);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static AppiumDriver driver() {
        return driver;
    }
}
