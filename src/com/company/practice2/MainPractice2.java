package com.company.practice2;
import com.company.MainPracticeInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainPractice2 implements MainPracticeInterface {
    public void _main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(50);
        intList.add(30);
        intList.add(70);
        intList.sort(null);
        System.out.println(intList);
        intList.sort(Collections.reverseOrder());
        System.out.println(intList);
    }
}
