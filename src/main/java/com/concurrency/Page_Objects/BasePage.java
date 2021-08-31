package com.concurrency.Page_Objects;

import com.concurrency.utilities.Driver;
import com.concurrency.utilities.Mobile_Utilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    @AndroidFindBy(id = "com.etsy.android:id/btn_link")
    private MobileElement getStarted;

    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()), this);
    }


    public void clickOnGetStarted() {
        Mobile_Utilities.waitForPresence(By.id("com.etsy.android:id/btn_link"));
        getStarted.click();
    }
}
