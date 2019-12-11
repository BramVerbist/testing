package step_definitions;

import io.cucumber.java.en.*;

public class FreeShipping {
    @Given("Frank is on the checkout")
    public void frank_is_on_the_checkout() {
        System.out.println("Frank is on the checkout");
    }

    @Given("the subtotal of the items is equal to or higher than {int} euro")
    public void the_subtotal_of_the_items_is_equal_to_or_higher_than_euro(Integer int1) {
        System.out.println("the subtotal of the items is equal to or higher than a certain amount");
    }

    @When("Frank pays for the items")
    public void frank_pays_for_the_items() {
        System.out.println("Frank pays for the items");
    }

    @Then("the shipping is free")
    public void the_shipping_is_free() {
        System.out.println("the shipping is free");
    }

    @Given("the subtotal of the items is less than {int} euro")
    public void the_subtotal_of_the_items_is_less_than_euro(Integer int1) {
        System.out.println("the subtotal of the items is less than a certain amount");
    }

    @Then("the shipping is not free")
    public void the_shipping_is_not_free() {
        System.out.println("the shipping is not free");
    }
}
