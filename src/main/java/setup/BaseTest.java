package setup;

import driver.DriverHolder;
import entities.Capabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public abstract class BaseTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    @Parameters({"platformName", "udid", "browserName","appPackage","appActivity","bundleId"})
    @BeforeSuite(alwaysRun = true)
    public void setUp(
            String platformName,
            String udid,
            @Optional("") String browserName,
            @Optional("") String BundleId,
            @Optional("") String appPackage,
            @Optional("") String appActivity) throws Exception {
        Capabilities capabilities = new Capabilities(platformName, udid, browserName, BundleId, appPackage, appActivity);
        DriverHolder.createDriver(capabilities);
        LOGGER.info("Setup for appType = {}", capabilities.toString());
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        DriverHolder.driver().closeApp();
        LOGGER.info("Teared down app");
    }
}
