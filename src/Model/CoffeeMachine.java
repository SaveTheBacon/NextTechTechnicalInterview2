package Model;

import Model.Coffees.Classic;
import Model.Coffees.Coffee;
import Model.Coffees.Espresso;
import Model.Coffees.Latte;

import java.util.ArrayList;

public class CoffeeMachine {

    private Integer defaultNrOfLattes;
    private Integer defaultNrOfEspressos;
    private Integer defaultNrOfClassics;

    private Integer nrOfLattes;
    private Integer nrOfEspressos;
    private Integer nrOfClassics;

    private Integer lattePrice;
    private Integer espressoPrice;
    private Integer classicPrice;

    ArrayList<String> transactionLog;

    public CoffeeMachine(Integer defaultNrOfLattes, Integer defaultNrOfEspressos, Integer defaultNrOfClassics, Integer nrOfLattes, Integer nrOfEspressos, Integer nrOfClassics, Integer lattePrice, Integer espressoPrice, Integer classicPrice) {
        this.defaultNrOfLattes = defaultNrOfLattes;
        this.defaultNrOfEspressos = defaultNrOfEspressos;
        this.defaultNrOfClassics = defaultNrOfClassics;
        this.nrOfLattes = nrOfLattes;
        this.nrOfEspressos = nrOfEspressos;
        this.nrOfClassics = nrOfClassics;
        this.lattePrice = lattePrice;
        this.espressoPrice = espressoPrice;
        this.classicPrice = classicPrice;
        this.transactionLog = new ArrayList<>();
    }

    public Integer getDefaultNrOfLattes() {
        return defaultNrOfLattes;
    }

    public void setDefaultNrOfLattes(Integer defaultNrOfLattes) {
        this.defaultNrOfLattes = defaultNrOfLattes;
    }

    public Integer getDefaultNrOfEspressos() {
        return defaultNrOfEspressos;
    }

    public void setDefaultNrOfEspressos(Integer defaultNrOfEspressos) {
        this.defaultNrOfEspressos = defaultNrOfEspressos;
    }

    public Integer getDefaultNrOfClassics() {
        return defaultNrOfClassics;
    }

    public void setDefaultNrOfClassics(Integer defaultNrOfClassics) {
        this.defaultNrOfClassics = defaultNrOfClassics;
    }

    public Integer getNrOfLattes() {
        return nrOfLattes;
    }

    public void setNrOfLattes(Integer nrOfLattes) {
        this.nrOfLattes = nrOfLattes;
    }

    public Integer getNrOfEspressos() {
        return nrOfEspressos;
    }

    public void setNrOfEspressos(Integer nrOfEspressos) {
        this.nrOfEspressos = nrOfEspressos;
    }

    public Integer getNrOfClassics() {
        return nrOfClassics;
    }

    public void setNrOfClassics(Integer nrOfClassics) {
        this.nrOfClassics = nrOfClassics;
    }

    public ArrayList<String> getTransactionLog() {
        return transactionLog;
    }

    public void setTransactionLog(ArrayList<String> transactionLog) {
        this.transactionLog = transactionLog;
    }

    public Integer getLattePrice() {
        return lattePrice;
    }

    public void setLattePrice(Integer lattePrice) {
        this.lattePrice = lattePrice;
    }

    public Integer getEspressoPrice() {
        return espressoPrice;
    }

    public void setEspressoPrice(Integer espressoPrice) {
        this.espressoPrice = espressoPrice;
    }

    public Integer getClassicPrice() {
        return classicPrice;
    }

    public void setClassicPrice(Integer classicPrice) {
        this.classicPrice = classicPrice;
    }
}
