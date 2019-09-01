package com.company;

public class exercise16 {
    public static void main(String[] args) {
        String sentence = "the quick brown fox jumped over the lazy dog";
        String[] words = sentence.split(" "); //tablica wypełni się słowami
        String searchedWord = "jumped";
        int index = -1; //bo chcemy potem wypisac ten index
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(searchedWord)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Nie znaleziono wyrazu w podanym zdaniu.");
        } else {
            System.out.println("Słowo 'jumped' znajduje się na pozycji: " + index);
        }
    }
}