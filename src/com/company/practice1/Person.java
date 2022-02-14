package com.company.practice1;

public class Person {
    private String name;
    private static String species = "Homo sapiens";

    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static String getSpecies() {
        return species;
    }
}
