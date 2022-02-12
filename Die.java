/**
 * Student Name     : Fikrath Hassan
 * Student Number   : A00254511
 * Program          : Mobile Application Development (MAPD)
 */

import java.util.Random;

public class Die {

    private String type;
    private int num_of_sides;
    private int current_side;

    // Default constructor
    public Die() {
        this.type = "d6";
        this.num_of_sides = 6;
        roll();
    }

    // Constructor with number of sides
    public Die(int num_of_sides) {
        this.type = "d6";
        this.num_of_sides = num_of_sides;
        roll();
    }

    // Constructor with name and number of sides
    public Die(String type, int num_of_sides) {
        this.type = type;
        this.num_of_sides = num_of_sides;
        roll();
    }

    /**
     * Method to roll a dice with specified number of sides
     */
    public void roll() {
        Random random = new Random();
        this.current_side = random.nextInt((this.num_of_sides+1) - 1) + 1;
    }

    /**
     * Getters and setters for each variable
     */
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setNumOfSides(int num_of_sides) {
        this.num_of_sides = num_of_sides;
    }

    public int getNumOfSides() {
        return this.num_of_sides;
    }

    public void setCurrentSide(int current_side) {
        this.current_side = current_side;
    }

    public int getCurrentSide() {
        return this.current_side;
    }
    
}