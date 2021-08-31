package com.concurrency.Page_Objects;

import com.concurrency.utilities.Mobile_Utilities;
import com.concurrency.utilities.Configuration_Reader;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class Login_Page extends BasePage {
    @AndroidFindBy(id = "com.etsy.android:id/edit_username")
    private MobileElement emailOrUsernameElement;

    @AndroidFindBy(id = "com.etsy.android:id/edit_password")
    private MobileElement passwordElement;

    @AndroidFindBy(id = "com.etsy.android:id/button_signin")
    private MobileElement signInBtnElement;


    public void login() {
        String email = Configuration_Reader.get("email");
        String password = Configuration_Reader.get("password");

        Mobile_Utilities.waitForPresence(By.id("com.etsy.android:id/edit_username"));

        emailOrUsernameElement.sendKeys(email);
        passwordElement.sendKeys(password);

        signInBtnElement.click();
    }
}
