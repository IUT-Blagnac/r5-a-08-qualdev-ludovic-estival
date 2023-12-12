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

    // Scénario - Example
    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    // Scénario - It is Friday yet
    @Given("today is Sunday")
    public String today_is_sunday() {
        return "Sunday";
    }

    @When("I ask if today is Friday")
    public void i_ask_if_today_is_friday() {
    }

    @Then("the response is {string}")
    public void the_response_is(String string) {
       assertEquals(string, isItFriday(today_is_sunday()));
    }

    // Scénario - Friday is Friday
    @Given("today is Friday")
    public String today_is_friday() {
        return "Friday";
    }

    @When("I ask wether it's Friday yet")
    public void i_ask_wether_its_friday_yet() {
        
    }

    @When("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, isItFriday(today_is_friday()));
    }

}