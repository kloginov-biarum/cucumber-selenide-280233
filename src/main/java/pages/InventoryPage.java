package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class InventoryPage {

    public SelenideElement inventoryList = $(byClassName("inventory_list"));

    public ElementsCollection inventoryItems = $$(byClassName("inventory_item"));


    public SelenideElement sortDropdown = $(byClassName("product_sort_container"));
    public SelenideElement nameAtoZ = $("[value='az']");

    public ElementsCollection inventoryNames = $$(byClassName("inventory_item_name"));

    public SelenideElement priceLowToHigh = $(byCssSelector("[value='lohi']"));

    public ElementsCollection inventoryPrices = $$(By.className("inventory_item_price"));

}
