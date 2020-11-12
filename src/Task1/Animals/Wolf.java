package Task1.Animals;

import Task1.Food.Food;
import Task1.Food.MeetFood;

public class Wolf implements Herbivores {
    private String color;

    public static String asd;

    @Override
    public boolean eat(Food food) {
        return food instanceof MeetFood;
    }

    @Override
    public void run() {
        System.out.println("Швидкість бігу - 45км/год");
    }


    public Wolf(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
            this.color = color;
    }
}
