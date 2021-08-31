package com.concurrency.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    private static AppiumDriver driver;

    public static AppiumDriver get() {
        if (driver == null) {
            String platform = Configuration_Reader.get("platform");
            switch (platform) {
                case "android":
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setCapability("platformName", "Android");
                    desiredCapabilities.setCapability("platformVersion", "7.0");
                    desiredCapabilities.setCapability("deviceName", "Android_Emulator");
                    desiredCapabilities.setCapability("app", "/Users/yusufbayer/AppiumReact/android/app/release/app-release.apk");
                    try {
                        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                default:
                    throw new RuntimeException("Driver is not implemented yet!");
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
