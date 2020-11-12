package Task1;

import Task1.Animals.Animal;
import Task1.Animals.Goat;
import Task1.Animals.Wolf;
import Task1.Food.Chicken;
import Task1.Food.Grass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Chicken chicken = new Chicken("123");
        Grass grass = new Grass("321");
        Wolf wolf = new Wolf("black");
        Goat goat = new Goat("Zoiy");
        Animal[] animals = {wolf, goat};

        for (Animal animal: animals) {
            animal.run();
        }
        System.out.println("________________________________________________");
        System.out.println("Wolf eat chicken " + wolf.eat(chicken));
        System.out.println("Wolf eat grass " + wolf.eat(grass));

        System.out.println("________________________________________________");

        System.out.println("Goat eat grass " + goat.eat(grass));
        System.out.println("Goat eat chicken " + goat.eat(chicken));

    }
}
