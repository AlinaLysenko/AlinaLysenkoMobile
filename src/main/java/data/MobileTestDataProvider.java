package scenarios;

import entities.Profile;
import org.testng.annotations.DataProvider;

public class MobileTestDataProvider {
    @DataProvider
    public Object[][] correctProfile() {
        return new Object[][]{
                {Profile.builder().email("test@test.com").username("testname").password("testtest").build()

                }
        };
    }

    @DataProvider
    public Object[][] googleRequest() {
        return new Object[][]{
                {new String ("EPAM")}
        };
    }
}
