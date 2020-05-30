package scenarios;

import driver.DriverHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public abstract class BaseTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    @Parameters({"appType"})
    @BeforeSuite(alwaysRun = true)
    public void setUp(String appType) throws Exception {
        DriverHolder.createDriver(appType);
        LOGGER.info("Setup for appType = {}", appType);
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        DriverHolder.driver().closeApp();
        LOGGER.info("Teared down app");
    }
}
