package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class LoginSteps extends BaseSteps{

    @Given("^I open Login page$")
    public void iOpenLoginPage() {
        open("https://www.saucedemo.com/");
    }

    @When("^I input \"([^\"]*)\" to username field$")
    public void iInputToUsernameField(String usernameValue)  {
        loginPage.usernameInputField.setValue(usernameValue);
    }

    @And("^input \"([^\"]*)\" to password field$")
    public void inputToPasswordField(String passwordValue)  {
        loginPage.passwordInputFiled.setValue(passwordValue);
    }

    @When("^I push the Login button$")
    public void iPushTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("^error message about locked user is displayed$")
    public void errorMessageAboutLockedUserIsDisplayed() {
        loginPage.errorMessage.shouldBe(visible).shouldHave(text("Sorry, this user has been locked out."));
    }

    @Then("^error message about invalid user with text \"([^\"]*)\" is displayed$")
    public void errorMessageAboutInvalidUserWithTextIsDisplayed(String expectedMessageText)  {
    loginPage.errorMessage.shouldBe(visible).shouldHave(text(expectedMessageText));
    }

}
