package steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.qameta.allure.selenide.AllureSelenide;
import pages.InventoryPage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseSteps {

    LoginPage loginPage = new LoginPage();

    InventoryPage inventoryPage = new InventoryPage();




}
