package step_definitions;

import io.cucumber.java.en.*;

public class Shoppingcart {
    @Given("Frank is on the {string} page")
    public void frank_is_on_the_page(String string) {
        System.out.println("Frank is on the page");
    }

    @When("Frank moves the {string} to the shopping cart")
    public void frank_moves_the_to_the_shopping_cart(String string) {
        System.out.println("Frank moves item to the shopping cart");
    }

    @Then("the {string} is added to his shopping cart")
    public void the_is_added_to_his_shopping_cart(String string) {
        System.out.println("Item is added to shopping cart");
    }
}
