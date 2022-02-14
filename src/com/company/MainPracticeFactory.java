package com.company;

import com.company.practice1.MainPractice1;
import com.company.practice2.MainPractice2;

public class MainPracticeFactory {
    public static MainPracticeInterface Get(Integer x) {
        switch (x) {
            case 1:
                return new MainPractice1();
            case 2:
                return new MainPractice2();
            default:
                break;
        }
        return null;
    }
}
