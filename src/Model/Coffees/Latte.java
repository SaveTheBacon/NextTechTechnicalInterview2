package Model.Coffees;

import java.util.ArrayList;

public class Latte extends Coffee {
    public Latte(Integer price, String coffeeName) {
        super(price, coffeeName);
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("sugar");
        ingredients.add("coffee");
        ingredients.add("milk");
        ingredients.add("cacao");
        ingredients.add("cinnamon");
        ingredients.add("water");
        this.ingredients = ingredients;
    }


}
