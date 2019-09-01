package com.company;

public class exercise13 {
    public static void main(String[] args) {
        String s = "blablabaaa";
        int numberOfRepeats = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                numberOfRepeats++;
            }
        }
        System.out.println(numberOfRepeats);
    }
}