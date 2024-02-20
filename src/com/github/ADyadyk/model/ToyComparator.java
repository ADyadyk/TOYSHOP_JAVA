package com.github.ADyadyk.model;

import java.util.Comparator;

public class ToyComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        if (o1 == o2) {
            return 0;
        }
        if (o1 == null) {
            return -1; // o1 < o2
        }
        if (o2 == null) {
            return 1; // o1 > o2
        }
        return o2.getWeight() - o1.getWeight();
    }
}
