package com.company;

public class exercise6 {
    public static void main(String[] args) {

        long minutes = 3500000;
        long days;
        long years;
        int minutesInYear = 60 * 24 * 365;
        int minutesInDay = 60 * 24;
        years = minutes / minutesInYear;
        days = (minutes % minutesInYear) /minutesInDay;

        System.out.println(minutes + " minut to " + years + " lat i " + days + " dni");
    }
}