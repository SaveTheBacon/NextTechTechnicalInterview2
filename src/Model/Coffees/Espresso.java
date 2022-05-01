package Model.Coffees;

import java.util.ArrayList;

public class Espresso extends Coffee{
    public Espresso(Integer price, String coffeeName) {
        super(price, coffeeName);
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("sugar");
        ingredients.add("coffee");
        ingredients.add("milk");
        ingredients.add("water");
        ingredients.add("whipped cream");
        this.ingredients = ingredients;
    }
}
