package Task4;

import Task1.Animals.Animal;
import Task1.Animals.Goat;
import Task1.Animals.Wolf;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Goat("ZZZ"));
        animals.add(new Wolf("white"));

        for (Animal animal: animals) {
            animal.run();
        }
    }
}
