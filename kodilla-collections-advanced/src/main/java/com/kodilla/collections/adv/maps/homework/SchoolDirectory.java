package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        Principal john = new Principal("John", "Stevenson");
        Principal jessie = new Principal("Jessie", "Pinkman");
        Principal bart = new Principal("Bart", "Simpson");

        School abrahamLincoln = new School("Akademia Rolniczo Hutnicza", 22, 30, 18);
        School johnKennedy = new School("PWR", 35, 37, 32);
        School MIT = new School("MIT", 11, 12, 14);

        school.put(john, abrahamLincoln);
        school.put(jessie, johnKennedy);
        school.put(bart, MIT);

        for (Map.Entry<Principal, School> principalEntry : school.entrySet())
            System.out.println(principalEntry.getKey().getFirstname() + " "
                    + principalEntry.getKey().getLastname() + " principal of: "
                    + principalEntry.getValue().getSchoolName() + " - "
                    + principalEntry.getValue().getSum() + " students");
    }
}
