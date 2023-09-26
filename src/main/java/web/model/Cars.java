package web.model;

public class Cars {
    private int id;
    private String name;

    private int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public Cars(){}


    public Cars(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Im a Car";
    }
}
