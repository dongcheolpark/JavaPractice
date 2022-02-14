package com.company.practice1;
import com.company.MainPracticeInterface;

public class MainPractice1 implements MainPracticeInterface { //클래스, 상속 연습
    public void _main(String[] args) {
        Person myPerson = new Person("John");
        System.out.println(myPerson.getName());
        System.out.println(Person.getSpecies());

        Student Joe = new Student("Joe",4.0);
        System.out.println(Joe.getName());
        System.out.println(Joe.getGpa());
    }
}
