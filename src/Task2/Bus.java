package Task2;

public class Bus extends Truck {
    public Bus() {
        System.out.println("Bus - constructor");
    }

    static {
        System.out.println("Bus - static Block");
    }
}
