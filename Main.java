package com.company;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setAge(24);
        System.out.println(person1.getAge());
        person1.setFirstName("Jonathan");
        System.out.println(person1.getFirstName());
        person1.setLastName("Traverse");
        System.out.println(person1.getLastName());

    }
}
