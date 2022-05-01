package Model.Coffees;

import java.util.ArrayList;

public abstract class Coffee {

    Integer price;
    String coffeeName;
    ArrayList<String> ingredients;

    public Coffee(Integer price, String coffeeName) {
        this.price = price;
        this.coffeeName = coffeeName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
}
