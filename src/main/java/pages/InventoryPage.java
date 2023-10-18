package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class InventoryPage {

    public SelenideElement inventoryList = $(byClassName("inventory_list"));

}
