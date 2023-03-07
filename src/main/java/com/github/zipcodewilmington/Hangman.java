package com.github.zipcodewilmington;


import java.util.*;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {


    public static void main(String[] args) {
        main1();
    }
    public static void main1() {
        String randomWord = getRandomWord(wordList());
        int numberOfGuesses = getNumberOfTries(randomWord);
        String[] updatedGuessArray = getBlankString(randomWord, numberOfGuesses);

        for (int i=0; i<numberOfGuesses;i++) {
            System.out.println("\nYou have "+(numberOfGuesses-i)+" letter guesses remain \n");
            String guessedChar = getGuessCharacter();
            for (int k=0; k<numberOfGuesses;k++) {
                if (guessedChar.equals(randomWord.split("")[k])) {
                    updatedGuessArray[k] = guessedChar;
                }
            }
            System.out.println("\nCurrent Guess:"+ Arrays.toString(updatedGuessArray));
        }
        System.out.println("**********NOW GUESS THE WORD. ONLY ONE CHANCE********* \n");
        Scanner scan = new Scanner(System.in);
        String guessWord = scan.nextLine();
        if (guessWord.equals(randomWord)) {
            System.out.println("$$$$$$$ GREAT! YOU GOT THE WORD $$$$$$$$$");
        } else {
            System.out.println("OOPS! BETTER LUCK NEXT TIME");
        }
        doAgain();
    }

    public static void doAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDo you want to play again? (y or n)");
        String response = scanner.nextLine();
        if (response.equals("y")) main1();
    }

    private static String[] getBlankString(String randomWord, int numberOfGuesses) {
        String[] updatedGuessArray = new String[numberOfGuesses];
        System.out.println("Word to be guessed: "+randomWord);
        for (int j=0;j<numberOfGuesses;j++) {
            updatedGuessArray[j] = "-";
        }
        return updatedGuessArray;
    }

    public static String[] wordList() {
        String [] wordList = {"cowboy", "problem", "love", "console","blood", "money","school","sample","license","zipcode"};
        return wordList;
    }

    public static String getRandomWord(String[] wordlist){
        int i = (int) Math.floor(Math.random()*12+1);
        return wordlist[i];
    }
    public static int getNumberOfTries(String guessingWord) {
        int numberOfTries = guessingWord.length();
        return numberOfTries;
    }

// NOT USED
//    public static String[] guessLocation(String guessedChar, String guessingWord) {
//        String location = "";
//        String[] temp = guessingWord.split("");
//        for (int i =0; i<temp.length;i++) {
//            if (guessedChar == temp[i]) {
//                location = location + i;
//            }
//        }
//        return location.split("");
//    }

    public static String getGuessCharacter() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please guess a letter in the word:");
        String guessChar = in.nextLine();
        return guessChar;
    }


} //HANG MAN OUTER CLASS
