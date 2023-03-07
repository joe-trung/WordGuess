package com.github.zipcodewilmington;


import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
    public static void main(String[] args) {

    }

    public static String[] wordList() {
        String [] wordList = {"cowboy", "problem", "love", "console","blood", "money","school","sample","license","zipcode"};
        return wordList;
    }

    public static String getRandomWord(String[] wordlist){
        Random i = Random

    }
    public static int getNumberOfTries(String guessingWord) {
        int numberOfTries = guessingWord.length();
        return numberOfTries;
    }

    public static boolean compareGuess(char guessedChar, String guessingWord) {
        boolean guess = false;
        String[] temp = guessingWord.split("");
        for (int i =0; i<temp.length;i++) {
            if (temp[i] == guessedChar) {
                guess = true;

            }
            System.out.println("Hoorey! your letter is in the word");
        }
        return guess;
    }

    public static char getGuessCharacter() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your guessed letter:");
    }


} //HANG MAN OUTER CLASS
