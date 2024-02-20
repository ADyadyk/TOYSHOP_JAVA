package com.github.ADyadyk.model;

public class Toy{
    private int id_toy;
    private String name;
    private int weight;

    public Toy() {
    }

    public Toy(int id_toy, String name, int weight) {
        this.id_toy = id_toy;
        this.name = name;
        this.weight = weight;
    }

    public int getId_toy() {
        return id_toy;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "id=" + id_toy +
                ", name=" + name +
                ", weight=" + weight;
    }
}
