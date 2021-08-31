package com.concurrency.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mobile_Utilities {
    private static WebDriverWait wait = new WebDriverWait(Driver.get(), 20);

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitForPresence(By by) {

        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
