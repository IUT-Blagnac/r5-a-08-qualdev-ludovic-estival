package cucumbertp2;

import io.cucumber.java.en.*;
import java.util.List;
import static org.junit.Assert.*;

public class StepDefinitions {
    private Order order;
    
    @Given("{string} who wants to buy a drink")
    public void someone_wants_to_buy_a_drink(String someone) {
        order = new Order();
        order.declareOwner(someone);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_someone(String someone) {
        order.declareTarget(someone);
    }

    @Then("there is {int} cocktail in the order")
    public void there_is_a_number_of_cocktail_in_the_order(int number) {
        List<String> cocktails = order.getCocktails();
        assertEquals(number, cocktails.size());
    }

}
