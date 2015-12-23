package javaBasics.javaInheritance;

public class InheritanceMaster {
    private String name;
    private int length;
    private int weight;
    private int legs;

    // Basic constructor
    public InheritanceMaster(String name, int length, int weight, int legs){
        this.name = name;
        this.legs = legs;
        this.weight = weight;
        this.legs = legs;
    }

    // Specify methods

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
}
