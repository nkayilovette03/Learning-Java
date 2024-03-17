package com.lovettenkayi;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.Date;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

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
//        System.out.println(Math.abs(-10));
//        System.out.println(Math.max(-10, 2.5));
//        System.out.println(Math.min(30, 25));
//        System.out.println((int) Math.pow(5, 2));
//        System.out.println((int) Math.sqrt(25));
//        System.out.println(Math.PI);

    // Comparison Operators
//        int lovette = 21;
//        int loveline = 26;
//
//        System.out.println(lovette > loveline);
//        System.out.println(lovette >= loveline);
//        System.out.println(lovette < loveline);
//        System.out.println(lovette <= loveline);
//        System.out.println(lovette == loveline);
//        System.out.println(lovette != loveline);

//        boolean isAdult = false;
//        boolean isStudent = true;
//        boolean isMember = true;
//
//        System.out.println(isAdult && isStudent);
//        System.out.println(!isAdult || isStudent);
//        System.out.println((!isAdult && isStudent) && isMember);

    // If statements
//    int age = 90;
//
//    if(age >= 18) {
//        System.out.println("Hooray..., i am an adult");
//    } else if (age >= 16 && age < 18) {
//        System.out.println("I am almost an adult");
//    } else {
//        System.out.println("I am not an adult");
//    }

    // Ternary Operator
//    int age = 17;
//
//    String message = age >= 18 ?
//            "Hooray..., I am an adult" :
//            age >= 16 || age <= 17  ?
//                    "I am almost an adult" :
//                    "I am not an adult";
//
//        System.out.println(message);
    // Switch Statement
//        String gender = "FEMALE".toLowerCase();

//        if(gender.equals("FEMALE")){
//            // DO something
//        } else if(gender.equals("MALE")) {
//            // DO something
//        } else if(gender.equals("PREFER_NOT_TO_SAY")){
//            // DO another thing
//        } else {
//
//        }


//        switch (gender) {
//            case "FEMALE":
//                System.out.println("I am a female");
//                break;
//            case "MALE":
//                System.out.println("I am a male");
//                break;
//            case "PREFER_NOT_TO_SAY":
//                System.out.println("I prefer not to say");
//                break;
//            default:
//                System.out.println("Unknown gender");
//
//        }

    // Arrays
//        int [] numbers = {2, 0, 1, 100, 36};
//        String [] names = {"Lovette", "Desmond"};

//        numbers[0] = 2;
//        numbers[1] = zero;
//        numbers[2] = one;

//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(names));
//        System.out.println(names.length);
        // Loops
//        int [] numbers = {2, 0, 1, 3, 100, 79, 4, 90, 77};
//        String [] names = {"Lovette", "Stega"};
//
//        Arrays.stream(numbers).forEach(System.out::println);
//        Arrays.stream(names).forEach(System.out::println);
//
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        // Break and Continue
//        String [] names = {"Anna", "Ali", "Bob", "Mike"};
//
//        for(String name: names) {
////            if(name.equals("Bob")) {
////                break;
////            }
//            if(name.startsWith("A")) {
//                continue;
//            }
//            System.out.println(name);
//        }

        // While Loop
//
//        int count = 0;
//
//        while (count <= 20) {
//            System.out.println("Count " + count);
//            count++;
//        }
        // Do While Loops
//        int count = 21;
//
//        do {
//            System.out.println(count);
//            count++;
//        } while(count <= 20);

        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println(userName + " you were born in " + year);
    }

//    static class Person {
//        String name;
//
//        Person(String name) {
//            this.name = name;
//        }
//    }
}