package Task3;

public class Queue <T> {
    private Object[] queue;
    private int size = 1;
    private int counter = 0;

    public Queue() {
        this.queue = new Object[size];
    }

    public void add(T element) {
        if (this.counter == this.size) {
            this.size += 1;
            Object[] temp = this.queue;
            this.queue = new Object[size];
            for (int i = 0; i < temp.length; i++) {
                this.queue[i] = temp[i];
            }
        }
        this.pushElement(element);
    }

    public void showElements() {
        for (Object t: this.queue) {
            System.out.println(t);
        }
    }

    public void delete() {
        --this.size;
        Object[] temp = this.queue;
        this.queue = new Object[this.size];
        for (int i = 0; i < this.size; i++) {
            this.queue[i] = temp[i + 1];
        }
        --counter;
    }

    private void pushElement(T element) {
        this.queue[counter] = element;
        ++counter;
    }



}

class Main {
    public static void main(String[] args) {
        Queue<Integer> test = new Queue<Integer>();
        for (int i = 0; i < 15; i++) {
            test.add(i);
        }

        test.showElements();

        for (int i = 0; i < 2; i++) {
            test.delete();
        }
        System.out.println("#############################################################");
        test.showElements();
    }
}