package Task5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // init variables
        Set<Integer> array = new HashSet<>();
        Random random = new Random();
        // set seed for random generator
        random.setSeed(1234567);

        //generate 100 value
        for (int i = 0; i < 100; i++) {
            // add value to set
            array.add(random.nextInt(7) + 1);
        }
        // print set
        System.out.println(array);
    }
}
