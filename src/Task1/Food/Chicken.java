package Task1.Food;

public class Chicken implements MeetFood {
    private String weight;

    public Chicken(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
