package View;

import java.util.ArrayList;

public class UserView {

    public String logBuy(String username, String coffeeName, Integer price, Boolean userTrue){
        if (userTrue) {
            String string = "User " + username + "bought one " + coffeeName + " for " + price + ".";
            System.out.println(string);
            return string;
        }
        else{
            String string = "Admin " + username + "bought one " + coffeeName + " for " + price + ".";
            System.out.println(string);
            return string;
        }

    }

    public String logFailure(String username, Boolean userTrue){
        if (userTrue) {
            String string = "User " + username + "failed to buy an espresso.";
            System.out.println(string);
            return string;
        }
        else{
            String string = "Admin " + username + "failed to buy an espresso.";
            System.out.println(string);
            return string;
        }
    }

    public String logFill(String username){
        String string = "Admin " + username + " filled up a vending machine.";
        System.out.println(string);
        return string;
    }

    public String logView(String username, String coffeeName, Integer nrOfCoffees){
        String string = "Admin " + username + " checked for " + coffeeName + ", found " + nrOfCoffees + ".";
        System.out.println(string);
        return string;
    }

    public String logPriceChange(String username, String coffeeName, Integer newPrice, Integer oldPrice){
        String string = "Admin " + username + " changed the price of " + coffeeName + " from " + oldPrice + " to " + newPrice + ".";
        System.out.println(string);
        return string;
    }

    public String logPriceHit(String coffeeName){
        String string = coffeeName + " is between our desired price points.";
        System.out.println(string);
        return string;
    }


}
