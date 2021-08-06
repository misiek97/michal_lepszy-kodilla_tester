package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private String schoolName;
    private List<Double> classQuantitys = new ArrayList<>();

    public School(String schoolName, double... classQuantitys) {
        this.schoolName = schoolName;
        for (double classQuantity : classQuantitys)
            this.classQuantitys.add(classQuantity);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public double getSum() {
        double sum = 0;
        for (double classQuantity : classQuantitys)
            sum += classQuantity;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "classQuantitys=" + classQuantitys +
                '}';
    }
}
