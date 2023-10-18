package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SelenideElement usernameInputField = $(byId("user-name"));

    public SelenideElement passwordInputFiled = $(byId("password"));

    public SelenideElement loginButton = $(byId("login-button"));



}
