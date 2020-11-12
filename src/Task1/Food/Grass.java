package Task1.Food;

public class Grass implements HerbFood {
    private String weight;

    public Grass(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
