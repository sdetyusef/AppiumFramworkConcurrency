package com.concurrency.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.concurrency.Page_Objects.Login_Page;
import com.concurrency.utilities.Mobile_Utilities;

public class Login_Steps {

    Login_Page loginPage = new Login_Page();

    @Given("user clicks on get started")
    public void user_clicks_on_get_started() {
        loginPage.clickOnGetStarted();
    }

    @When("user try to log in with invalid credentials")
    public void user_try_to_log_in_with_invalid_credentials() {
        loginPage.login();
        Mobile_Utilities.wait(10);//for demo
    }

    @Then("user verifies that the error message is displayed")
    public void user_verifies_that_the_error_message_is_displayed() {

    }

}
