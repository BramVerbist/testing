package step_definitions;

import io.cucumber.java.en.*;

public class Login {
    @Given("Frank is not logged in")
    public void frank_is_not_logged_in() {
        System.out.println("Frank is not logged in");
    }

    @Given("Frank is on the login page")
    public void frank_is_on_the_login_page() {
        System.out.println("Frank is on the login page");
    }

    @Given("Frank has an account")
    public void frank_has_an_account() {
        System.out.println("Frank has an account");
    }

    @When("Frank logs in with his correct username: {string} and corresponding password: {string}")
    public void frank_logs_in_with_his_correct_username_and_corresponding_password(String string, String string2) {
        System.out.println("Frank logs in");
    }

    @Then("Frank gets logged in")
    public void frank_gets_logged_in() {
        System.out.println("Frank gets logged in");
    }
}
