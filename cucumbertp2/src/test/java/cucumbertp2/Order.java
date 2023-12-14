package cucumbertp2;

import java.util.List;
import java.util.ArrayList;

public class Order {

    private String owner;
    private String target;
    private List<String> cocktailsList = new ArrayList<String>();

    public void declareOwner(String someone) {
        this.owner = someone;
    }

    public void declareTarget(String someone) {
        this.target = someone;
    }

    public List<String> getCocktails() {
        return this.cocktailsList;
    }
}
