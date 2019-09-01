package com.company;

public class exercise14 {
    public static void main(String[] args) {
        String s1 = "kobyla ma maly bok";
        String s2 = "";
        String s3 = s1.replaceAll(" ", "");

        for (int i = s3.length() - 1; i >= 0; i--) {
            s2 += s3.charAt(i);
        }
        if (s3.equals(s2)) {
            System.out.println(s1 + " is palindrome");
        } else {
            System.out.println(s1 + " is not a palindrome");
        }
    }
}