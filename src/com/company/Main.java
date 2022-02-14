package com.company;

public class Main {
    public static void main(String[] args) {
        MainPracticeInterface Run = MainPracticeFactory.Get(2);
        Run._main(args);
    }
}
