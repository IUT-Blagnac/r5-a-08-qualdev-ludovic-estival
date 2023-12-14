package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    static String isItFriday(String today) {
        if(today.equals("Friday")){
            return "TGIF";
        }
        return "Nope";
    }

    private String today;
    private String response;

    // Scénario - It is Friday yet
    @Given("today is Sunday")
    public void today_is_sunday() {
        today = "Sunday";
    }

    @When("I ask if today is Friday")
    public void i_ask_if_today_is_friday() {
        response = isItFriday(today);
    }

    @Then("the response is {string}")
    public void the_response_is(String string) {
       assertEquals(string, response);
    }

    // Scénario - Friday is Friday
    @Given("today is Friday")
    public void today_is_friday() {
        today = "Friday";
    }

    @When("I ask wether it's Friday yet")
    public void i_ask_wether_its_friday_yet() {
        response = isItFriday(today);
    }

    @When("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, response);
    }

}