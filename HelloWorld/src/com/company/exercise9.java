package com.company;

public class exercise9 {
    public static void main(String[] args) {
        String allel1 = "a";
        String allel2 = "b";

        if((allel1.equalsIgnoreCase("A") && allel2.equalsIgnoreCase("B")) || (allel1.equalsIgnoreCase("B") && allel2.equalsIgnoreCase("A"))) {
            System.out.println("Grupa krwii to: AB");
        } else if ((allel1.equalsIgnoreCase("A") && allel2.equalsIgnoreCase("A")) || (allel1.equalsIgnoreCase("A") && allel2.equalsIgnoreCase("0")) || allel1.equalsIgnoreCase("0") && allel2.equalsIgnoreCase("A")) {
            System.out.println("Grupa krwii to: A");
        } else if((allel1.equalsIgnoreCase("B") && allel2.equalsIgnoreCase("B")) || (allel1.equalsIgnoreCase("B") && allel2.equalsIgnoreCase("0")) || allel1.equalsIgnoreCase("0") && allel2.equalsIgnoreCase("B")) {
            System.out.println("Grupa krwii to: B");
        } else if ((allel1.equalsIgnoreCase("0") && allel2.equalsIgnoreCase("0"))) {
            System.out.println("Grupa krwii to: 0");
        } else {
            System.out.println("Grupa krwii to: ufo");
        }
    }
}