package myapp;

public abstract class Animal {

    //members
    protected String type;
    private String size;
    private double weight;

    //constructor
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    //abstract methods
    public abstract void move(String speed);
    public abstract void makeNoise();

}
