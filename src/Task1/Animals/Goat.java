package Task1.Animals;

import Task1.Food.Food;
import Task1.Food.HerbFood;

public class Goat implements Herbivores {
    private String name;

    @Override
    public boolean eat(Food food) {
        return food instanceof HerbFood;
    }

    @Override
    public void run() {
        System.out.println("Швидкість бігу - 15км/год");
    }

    public Goat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
