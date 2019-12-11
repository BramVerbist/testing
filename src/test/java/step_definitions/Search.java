package step_definitions;

import io.cucumber.java.en.*;

public class Search {
    @Given("Frank is on the search page")
    public void frank_is_on_the_search_page() {
        System.out.println("Frank is on the search page");
    }

    @When("Frank searcher for {string}")
    public void frank_searcher_for(String string) {
        System.out.println("Frank searches for an item");
    }

    @Then("Frank gets to see the item {string}")
    public void frank_gets_to_see_the_item(String string) {
        System.out.println("Frank gets to see the item");
    }
}
