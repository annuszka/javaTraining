package com.company;

public class exercise2 {
    public static void main(String[] args) {
        String lorem = " Lorem Ipsum ";
        System.out.println("oryginał: " + lorem);
        System.out.println("bez spacji: " + lorem.trim());
        System.out.println("duże litery: " + lorem.toUpperCase());
        System.out.println("małe litery: " + lorem.toLowerCase());
        System.out.println("długość: " + lorem.length());

        boolean isEmpty = lorem.isEmpty();
        System.out.println("czy puste: " + isEmpty);

    }
}