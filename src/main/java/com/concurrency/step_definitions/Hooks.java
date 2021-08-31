package com.concurrency.step_definitions;

import io.cucumber.java.After;
import com.concurrency.utilities.Driver;

public class Hooks {
    @After
    public void teardown() {
        Driver.closeDriver();
    }

}
