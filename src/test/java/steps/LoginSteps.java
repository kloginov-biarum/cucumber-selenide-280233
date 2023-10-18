package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LoginPage;

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
}
