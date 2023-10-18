package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;
import pages.InventoryPage;

import java.time.Duration;

public class InventorySteps extends BaseSteps{
    @Then("^I am on the page Inventory$")
    public void iAmOnThePageInventory() {
        inventoryPage.inventoryList.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }
}
