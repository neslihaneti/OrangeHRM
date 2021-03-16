package com.orangehrm.stepdefinitions;

import com.orangehrm.base.ConfigReader;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSD {

    //sd;step definition

    @Given("I am on the Login Page")
    public void iAmOnTheLoginPage() {
        Assert.assertEquals("OrangeHRM", LoginPage.verifyTitle());
    }

    @When("I enter correct username in the username field")
    public void iEnterCorrectUsernameInTheUsernameField() {
    LoginPage.enterUserName(ConfigReader.getProperty("username"));
    }

    @And("I enter correct password in the password field")
    public void iEnterCorrectPasswordInThePasswordField() {
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
    LoginPage.clickLoginBtn();
    }


    @Then("I see the home page")
    public void iSeeTheHomePage() {
        Assert.assertEquals("OrangeHRM", HomePage.verifyTitle());
    }

    @When("I enter incorrect username in the username field")
    public void iEnterInCorrectUsernameInTheUsernameField() {
        LoginPage.enterUserName(ConfigReader.getProperty("username_invalid"));
    }

    @And("I enter incorrect password in the password field")
    public void iEnterInCorrectPasswordInThePasswordField() {
        LoginPage.enterPassword(ConfigReader.getProperty("password_invalid"));
    }

    @Then("I see the error message on the login page")
    public void verifyErrorMessage(){
        Assert.assertEquals("Invalid credentials",LoginPage.getErrorMessage());
    }


}
