package com.baltiqa;

public class Math {

    /**
     * This is an example of a badly formatted method that checks if a number is a prime number.
     * @param number the number to be checked
     */
    public void isPrimeNumber(int number) {
        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}