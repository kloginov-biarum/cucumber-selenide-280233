package steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InventoryPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static java.lang.Double.parseDouble;
import static java.util.Collections.sort;
import static org.junit.Assert.assertEquals;

public class InventorySteps extends BaseSteps{
    @Then("^I am on the page Inventory$")
    public void iAmOnThePageInventory() {
        inventoryPage.inventoryList.shouldBe(visible, Duration.ofSeconds(10));
    }

    @And("^(\\d+) items are displayed$")
    public void itemsAreDisplayed(int expectedQuantity) {
        inventoryPage.inventoryItems.filter(visible).shouldHave(size(expectedQuantity));
    }

    @When("^I choose sort option by name A-Z$")
    public void iChooseSortOptionByNameAZ() {
        inventoryPage.sortDropdown.shouldBe(visible).click();
        inventoryPage.nameAtoZ.shouldBe(visible).click();
    }

    @Then("^all items sorted by name alphabetically$")
    public void allItemsSortedByNameAlphabetically() {
        List<String> actualNames = new ArrayList<>();
        for (SelenideElement itemName: inventoryPage.inventoryNames) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);
        //assertEquals("Items have NOT sorted alphabetically", actualNames, expectedNames);
        inventoryPage.inventoryNames.shouldHave(exactTexts(expectedNames));
    };

    @When("^I choose sort option by price from low to high$")
    public void iChooseSortOptionByPriceFromLowToHigh() {
        inventoryPage.sortDropdown.shouldBe(visible).click();
        inventoryPage.priceLowToHigh.shouldBe(visible).click();
    }


    @Then("^all items sorted by price from low to high$")
    public void allItemsSortedByPriceFromLowToHigh() {
        List<Double> actualPrices = new ArrayList<>();
        for (SelenideElement itemPrice: inventoryPage.inventoryPrices) {
            actualPrices.add(parseDouble(itemPrice.getText().substring(1)));
        }
        List<Double> expectedPrices = new ArrayList<>(actualPrices);
        sort(expectedPrices);
        assertEquals("Items have NOT sorted by price from low to high", actualPrices, expectedPrices);
    }
}
