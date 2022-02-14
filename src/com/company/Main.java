package com.company;

public class Main {
    public static void main(String[] args) {
        MainPracticeInterface Run = MainPracticeFactory.Get(Integer.parseInt(args[0]));
        Run._main(args);
    }
}
