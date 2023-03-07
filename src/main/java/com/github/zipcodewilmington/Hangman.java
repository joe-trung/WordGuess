package com.github.zipcodewilmington;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collection;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
    public static void main(String[] args) {
        String randomWord = getRandomWord(wordList());
        int numberOfGuesses = getNumberOfTries(randomWord);
        for (int i = 1;i<=numberOfGuesses;i++) {
            String guessChar = getGuessCharacter();
            String[] locationArray = guessLocation(randomWord, guessChar);
            for (int j = 1;i<=numberOfGuesses;j++) {
                if (randomWord.split("")[i].equals(locationArray[j])){
            }

        }
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

    public static String[] guessLocation(String guessedChar, String guessingWord) {
        String location = "";
        String[] temp = guessingWord.split("");
        for (int i =0; i<temp.length;i++) {
            if (guessedChar == temp[i]) {
                location = location + i;
            }
        }
        return location.split("");
    }

    public static String getGuessCharacter() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please guess a letter in the word:");
        String guessChar = in.nextLine();
        return guessChar;
    }


} //HANG MAN OUTER CLASS
