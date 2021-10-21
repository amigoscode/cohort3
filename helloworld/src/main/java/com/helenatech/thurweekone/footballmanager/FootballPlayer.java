package com.helenatech.thurweekone.footballmanager;

import java.util.Objects;

public class FootballPlayer {
    private String name;
    private int shirtNumber;

    public FootballPlayer(String name, int shirtNumber) {
        this.name = name;
        this.shirtNumber = shirtNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", shirtNumber=" + shirtNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballPlayer that = (FootballPlayer) o;
        return shirtNumber == that.shirtNumber && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shirtNumber);
    }
}
