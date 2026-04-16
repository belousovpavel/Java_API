package com.example.lesson6;

public class Plate {

    private int food;

    public Plate(){
        this(100);
    }

    public Plate(int food) {
        if (food < 0){
            throw new IllegalArgumentException("Invalid food");
        }
        this.food = food;
    }

    public void increaseFood(int foodToIncrease) {
        if (foodToIncrease > 0) {
            this.food += foodToIncrease;
        }
    }

    public boolean decreaseFood(int food) {
        if (this.food >= food) {
            this.food -= food;
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "(" + food + ")";
    }
}
