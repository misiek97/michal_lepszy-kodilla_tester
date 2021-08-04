package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Butterfly", "1x1.5 cm", "yes"));
        stamps.add(new Stamp("Seaset", "3x2 cm", "no"));
        stamps.add(new Stamp("Car crash", "2x2 cm", "no"));
        stamps.add(new Stamp("Butterfly", "1x1.5 cm", "yes"));

        System.out.println(stamps.size());
        for (Stamp order : stamps)
            System.out.println(order);
    }
}
