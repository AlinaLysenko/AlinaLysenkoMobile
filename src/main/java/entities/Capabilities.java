package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import utils.PropertyLoader;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
public class Capabilities {
    String platformName;
    String udid;
    String browserName;
    String appPackage;
    String appActivity;
    String bundleId;

    public Map<String, String> toMap(){
        return new HashMap<String, String>() {{
            put("platformName", platformName);
            put("udid", udid);
            if (!browserName.equals("")) put("browserName", browserName);
            if (!appPackage.equals("")) put("appPackage", appPackage);
            if (!appActivity.equals("")) put("appActivity", appActivity);
            if (!bundleId.equals("")) put("bundleId", bundleId);
        }};
    }
}
