package com.lovettenkayi;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.Date;

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

//        int a = 10;
//        int b = a;
//
//        a = 100;
//
//        System.out.println("- a = " + a +  " - b = " + b);
//
//        Person alex = new Person("alex");
//        Person mariam = alex;
//
//        System.out.println("Before changing alex");
//        System.out.println(alex.name + " "  + mariam.name);
//
//        mariam.name = "Mariam";
//
//        System.out.println("After changing alex");
//        System.out.println(alex.name + " "  + mariam.name);
//        Naming Variables

//        int subscriberCount = 1_000_000; // is easy to read this than
//
//        int subscribercount = 1_000_000; //this makes it difficult to read

        // String Class
//        String name =  new String("Thedev.init");
//        System.out.println(name.toUpperCase()); //toUpperCase() is a method of an object
//        System.out.println(name.charAt(0));
//        String code = new String("dev");
//        System.out.println(name.contains(code));
//        System.out.println(name.equals(code));

        // Packages and imports
//        String name = new String(""); //Any import from java.lang does not get imported
//        Date date = new Date();
//        java.sql.Date dateSql = new java.sql.Date(1);
//        LocalDate localDate = LocalDate.now();
//        LocalDateTime localDateTime = LocalDateTime.now();

        // Reserved Keywords
        // class, package, static, void, public, final
            // Arithmetic Operations
//        int ten = 10;
//        int two = 2;
//
//        int addition = ten + two;
//        int subtract = ten - two;
//        int multiply = ten * two;
//        int modulus = ten % two;
//
//        System.out.println(addition);
//        System.out.println(subtract);
//        System.out.println(multiply);
//        System.out.println(modulus);

    // Math
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(-10, 2.5));
        System.out.println(Math.min(30, 25));
        System.out.println((int) Math.pow(5, 2));
        System.out.println((int) Math.sqrt(25));
        System.out.println(Math.PI);
    }

//    static class Person {
//        String name;
//
//        Person(String name) {
//            this.name = name;
//        }
//    }
}