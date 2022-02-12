/**
 * Student Name     : Fikrath Hassan
 * Student Number   : A00254511
 * Program          : Mobile Application Development (MAPD)
 */

public class DiceGame {
    public static void main(String[] args) {
        
        // Creating default constructor of Die class
        System.out.println();
        System.out.println("Creating a default d6...");
        Die d6 = new Die();

        // Creating constructor with name and side of Die class
        System.out.println("Creating a d20...");
        Die d20 = new Die("d20", 20);

        System.out.println("Creating percentile die (a special d10)...");
        Die d10 = new Die("Percentile", 10);

        // Prints each dice's current value
        System.out.println("The current side up for " + d6.getType() + " is " + d6.getCurrentSide());
        System.out.println("The current side up for " + d20.getType() + " is " + d20.getCurrentSide());
        System.out.println("The current side up for " + d10.getType() + " is " + d10.getCurrentSide());
        System.out.println();

        System.out.println("Testing the roll method");
        System.out.println();

        System.out.println("Rolling the " + d6.getType() + "...");
        d6.roll();
        System.out.println("The new value is " + d6.getCurrentSide());

        System.out.println("Rolling the " + d20.getType() + "...");
        d20.roll();
        if (d20.getCurrentSide() == 20) {
            System.out.println("YAY! It's a " + d20.getCurrentSide());
        } else {
            System.out.println("The current side up for " + d20.getType() + " is " + d20.getCurrentSide());
        }

        System.out.println("Rolling the " + d10.getType() + "...");
        d10.roll();
        System.out.println("The new value is " + d10.getCurrentSide());
        System.out.println();

        // Setting current side value manually
        System.out.println("Setting the d20 to show 20...");
        d20.setCurrentSide(20);
        System.out.println("The side up is now " + d20.getCurrentSide() + ". Finally.");
        System.out.println();

        // Creating 5 different dices of 6 side's and show how rolls it takes to get same kind
        System.out.println("-----");
        System.out.println("BONUS");
        System.out.println("-----");
        System.out.println("Creating 5 d6...");
        Die d6_1 = new Die();
        Die d6_2 = new Die();
        Die d6_3 = new Die();
        Die d6_4 = new Die();
        Die d6_5 = new Die();

        int totalNumOfRolls = 1;
        boolean diceMatched = false;
        
        // Check whether first roll get same kind of sides
        if (d6_1.getCurrentSide() == d6_2.getCurrentSide() &&  d6_1.getCurrentSide() == d6_3.getCurrentSide() 
                && d6_1.getCurrentSide() == d6_4.getCurrentSide() && d6_1.getCurrentSide() == d6_5.getCurrentSide()) {
            diceMatched = true;
        }

        // Roll until all dice get same kind of side
        while (!diceMatched) {
            d6_1.roll();
            d6_2.roll();
            d6_3.roll();
            d6_4.roll();
            d6_5.roll();
            totalNumOfRolls++;
            if (d6_1.getCurrentSide() == d6_2.getCurrentSide() &&  d6_1.getCurrentSide() == d6_3.getCurrentSide() 
                && d6_1.getCurrentSide() == d6_4.getCurrentSide() && d6_1.getCurrentSide() == d6_5.getCurrentSide()) {
                diceMatched = true;
            }
        }
        System.out.println("YAHTZEE! It took " + totalNumOfRolls + " rolls");
        System.out.println();

    }

}