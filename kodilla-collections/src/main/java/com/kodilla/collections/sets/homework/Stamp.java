package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampSize;
    private String stampedStatus;

    public Stamp (String stampName, String stampSize, String stampedStatus) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.stampedStatus = stampedStatus;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampSize() {
        return stampSize;
    }

    public String getStampedStatus() {
        return stampedStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(stampName, stamp.stampName) && Objects.equals(stampSize, stamp.stampSize) && Objects.equals(stampedStatus, stamp.stampedStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, stampedStatus);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize='" + stampSize + '\'' +
                ", stampedStatus='" + stampedStatus + '\'' +
                '}';
    }
}
