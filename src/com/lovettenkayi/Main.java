package com.lovettenkayi;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Primitive Data Types

//        byte theByte = -128;
//        short theShort = 32_000;
//        int theInt = 787_838_899;
//        long theLong = 769_876_555;
//
//        float pi = 3.14F;
//        double doublePi = 3.1416;
//        boolean isAdult = true;
//
//        char nameInitial = 'L';
//
//        System.out.println(theByte);
//        System.out.println(theShort);
//        System.out.println(theInt);
//        System.out.println(theLong);
//        System.out.println(pi);
//        System.out.println(doublePi);
//        System.out.println(isAdult);
//        System.out.println(nameInitial);

        // Non-Primitive Data Types AKA reference types

//        String name = new String("Lovette Nkayi");
//
//        LocalDateTime dateTime = LocalDateTime.now();
//
//        System.out.println(name.toUpperCase());
//        System.out.println(dateTime.getMonth());

//        Differences between primitive and non-primitive data type

        int a = 10;
        int b = a;

        a = 100;

        System.out.println("- a = " + a +  " - b = " + b);

        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("Before changing alex");
        System.out.println(alex.name + " "  + mariam.name);

        mariam.name = "Mariam";

        System.out.println("After changing alex");
        System.out.println(alex.name + " "  + mariam.name);
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}