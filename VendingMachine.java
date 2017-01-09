/**
 * Simulation of Vending Machine Functionality
 * 
 * @Thomas Zimmerman
 * @v0.1
 */

import java.util.*;
import java.text.*;

public class VendingMachine {

    private int inventory;
    private static final int cost = 125;
    private double tsales;
    private int cbalance;
    private String messoutput;
    private double sales;
    
        public VendingMachine() {
        inventory = 0;
        tsales = 0;
        cbalance = 0;
        messoutput = "Sold Here: Ice Cold Mountain Dew!";
    }

    public VendingMachine(int units) {
        inventory = units;
        tsales = 0;
        cbalance = 0;
    }

    public int getprice() {
        return cost;
    }

    int getcredit() {
        return cbalance;
    }

    void insertmoney(int amount) {
        cbalance = cbalance + amount;
    }

    int getInventory() {
        return inventory;
    }

    public double getsales()
    {
        return sales;
    }

    void setstock(int amt) {
        inventory = amt;
    }

    public void restock(int amt) {
        inventory = inventory + amt;
    }

    public void makeselection() {

        if (cbalance < cost) {
            System.out.println("Credits Inputted: " + cbalance);
            System.out.println("Price of One Can: " + cost);
            System.out.println("");
            System.out.println("");
        } else if (cbalance == cost) {
            System.out.println("Now Dispensing a Mountain Dew!");
            System.out.println("");
            System.out.println("");
            inventory = inventory - 1;
            cbalance = 0;
            tsales = tsales + cost;
        } else if (cbalance > cost) {
            System.out.println("Now Dispensing a Mountain Dew!");
            System.out.println("Your Change Is: " + (cbalance - cost) 
                + " credits");
            System.out.println("");
            System.out.println("");
            inventory = inventory - 1;
            cbalance = 0;
            tsales = tsales + cost;

        }
    }

    public void showmessoutput() {
        System.out.println(messoutput);
    }

    public String tocurrency(int total) {
        int dollars = total / 100;
        int cents = total % 100;

        if (cents < 10) {
            return "$" + dollars + ".0" + cents;
        } else {
            return "$" + dollars + "." + cents;
        }
    }

    @Override
    public String toString() {
        return "Your Credits Are: \t" + cbalance
        + "\nCans Left in Inventory: \t" + inventory
        + "\n";
    }
}
