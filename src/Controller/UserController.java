package Controller;

import Model.CoffeeMachine;
import Model.Coffees.Coffee;
import Model.Users.Admin;
import Model.Users.User;
import View.UserView;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserController {

    private User user;
    private Admin admin;
    private CoffeeMachine coffeeMachine;
    private UserView userView;

    public UserController(User user, Admin admin, UserView userView) {
        this.user = user;
        this.admin = admin;
        this.userView = userView;
    }

    private void addLog(String string, CoffeeMachine coffeeMachine){

        ArrayList<String> aux = coffeeMachine.getTransactionLog();
        aux.add(string);
        coffeeMachine.setTransactionLog(aux);
    }
    

    public void requestCoffee(User user, CoffeeMachine coffeeMachine, String coffeeName, Integer price){
        switch (coffeeName){
            case "Latte":
                if (price == coffeeMachine.getLattePrice() && coffeeMachine.getNrOfLattes() > 0){
                    coffeeMachine.setNrOfLattes(coffeeMachine.getNrOfLattes() - 1);
                    user.setMoney(user.getMoney() - price);
                    String string = userView.logBuy(user.getUserName(), coffeeName, price, true);
                    addLog(string, coffeeMachine);
                }
                else{
                    String string = userView.logFailure(user.getUserName(), true);
                    addLog(string, coffeeMachine);
                }
                break;
            case "Espresso":
                if (price == coffeeMachine.getEspressoPrice() && coffeeMachine.getNrOfEspressos() > 0){
                    coffeeMachine.setNrOfEspressos(coffeeMachine.getNrOfEspressos() - 1);
                    user.setMoney(user.getMoney() - price);
                    String string = userView.logBuy(user.getUserName(), coffeeName, price, true);
                    addLog(string, coffeeMachine);
                }
                else{
                    String string = userView.logFailure(user.getUserName(), true);
                    addLog(string, coffeeMachine);
                }
                break;
            case "Classic":
                if (price == coffeeMachine.getClassicPrice() && coffeeMachine.getNrOfClassics() > 0){
                    coffeeMachine.setNrOfClassics(coffeeMachine.getNrOfClassics() - 1);
                    user.setMoney(user.getMoney() - price);
                    String string = userView.logBuy(user.getUserName(), coffeeName, price, true);
                    addLog(string, coffeeMachine);
                }
                else{
                    String string = userView.logFailure(user.getUserName(), true);
                    addLog(string, coffeeMachine);
                }
                break;

        }
    }

    public void requestCoffee(Admin admin, CoffeeMachine coffeeMachine, String coffeeName, Integer price){
        switch (coffeeName){
            case "Latte":
                if (price == coffeeMachine.getLattePrice() && coffeeMachine.getNrOfLattes() > 0){
                    coffeeMachine.setNrOfLattes(coffeeMachine.getNrOfLattes() - 1);
                    admin.setMoney(admin.getMoney() - price);
                    String string = userView.logBuy(user.getUserName(), coffeeName, price, false);
                    addLog(string, coffeeMachine);
                }
                else{
                    String string = userView.logFailure(user.getUserName(), false);
                    addLog(string, coffeeMachine);
                }
                break;
            case "Espresso":
                if (price == coffeeMachine.getEspressoPrice() && coffeeMachine.getNrOfEspressos() > 0){
                    coffeeMachine.setNrOfEspressos(coffeeMachine.getNrOfEspressos() - 1);
                    admin.setMoney(admin.getMoney() - price);
                    String string = userView.logBuy(user.getUserName(), coffeeName, price, false);
                    addLog(string, coffeeMachine);
                }
                else{
                    String string = userView.logFailure(user.getUserName(), false);
                    addLog(string, coffeeMachine);
                }
                break;
            case "Classic":
                if (price == coffeeMachine.getClassicPrice() && coffeeMachine.getNrOfClassics() > 0){
                    coffeeMachine.setNrOfClassics(coffeeMachine.getNrOfClassics() - 1);
                    admin.setMoney(admin.getMoney() - price);
                    String string = userView.logBuy(user.getUserName(), coffeeName, price, false);
                    addLog(string, coffeeMachine);
                }
                else{
                    String string = userView.logFailure(user.getUserName(), false);
                    addLog(string, coffeeMachine);
                }
                break;

        }
    }


    public void refillCoffeeMachine(Admin admin, CoffeeMachine coffeeMachine){
        coffeeMachine.setNrOfLattes(coffeeMachine.getDefaultNrOfLattes());
        coffeeMachine.setNrOfEspressos(coffeeMachine.getDefaultNrOfEspressos());
        coffeeMachine.setNrOfClassics(coffeeMachine.getDefaultNrOfClassics());
        String string = userView.logFill(admin.getUserName());
        addLog(string, coffeeMachine);
    }

    public void listAllCoffees(Admin admin, CoffeeMachine coffeeMachine){
        if(coffeeMachine.getNrOfLattes() > 0){
            String string = userView.logView(admin.getUserName(), "latte", coffeeMachine.getNrOfLattes());
            addLog(string, coffeeMachine);
        }
        if(coffeeMachine.getNrOfClassics() > 0){
            String string = userView.logView(admin.getUserName(), "classic", coffeeMachine.getNrOfClassics());
            addLog(string, coffeeMachine);
        }
        if(coffeeMachine.getNrOfEspressos() > 0){
            String string = userView.logView(admin.getUserName(), "espresso", coffeeMachine.getNrOfEspressos());
            addLog(string, coffeeMachine);
        }
    }

    public void changePrice (Admin admin, CoffeeMachine coffeeMachine, String coffeeName, Integer price){
        switch (coffeeName){
            case "latte":
                String string = userView.logPriceChange(admin.getUserName(), coffeeName, price, coffeeMachine.getLattePrice());
                coffeeMachine.setLattePrice(price);
                addLog(string, coffeeMachine);
                break;
            case "espresso":
                String string1 = userView.logPriceChange(admin.getUserName(), coffeeName, price, coffeeMachine.getEspressoPrice());
                coffeeMachine.setEspressoPrice(price);
                addLog(string1, coffeeMachine);
                break;
            case "classic":
                String string2 = userView.logPriceChange(admin.getUserName(), coffeeName, price, coffeeMachine.getClassicPrice());
                coffeeMachine.setClassicPrice(price);
                addLog(string2, coffeeMachine);
                break;
        }
    }

    public void filterByPrice(Admin admin, CoffeeMachine coffeeMachine, Integer min, Integer max){
        if (coffeeMachine.getLattePrice() >= min && coffeeMachine.getLattePrice() <= max){
            userView.logPriceHit("latte");
        }
        if (coffeeMachine.getEspressoPrice() >= min && coffeeMachine.getEspressoPrice() <= max){
            userView.logPriceHit("espresso");
        }
        if (coffeeMachine.getClassicPrice() >= min && coffeeMachine.getClassicPrice() <= max){
            userView.logPriceHit("classic");
        }
    }
}
