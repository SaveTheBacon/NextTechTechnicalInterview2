package Model.Coffees;

import java.util.ArrayList;

public class Classic extends Coffee {



    public Classic(Integer price, String coffeeName) {
        super(price, coffeeName);
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("sugar");
        ingredients.add("coffee");
        ingredients.add("milk");
        this.ingredients = ingredients;

    }
}
