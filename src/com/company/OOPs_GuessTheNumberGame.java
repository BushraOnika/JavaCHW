package com.company;

import java.util.Random;
import java.util.Scanner;

/*
           Create a class Game , Which allows a user to play "Guess the Number"
          game once . Game should have the following methods
          1.Constructor to generate a random number
          2.takeUserInput ()to take a user input of number
          3.isCorrectNumber() to detect whether the number entered by the user is user
          4.getter and setter for noOfGuesses
          Use properties such as noOfGuesses(int) etc to get this task done!
          */
class Game {
  int noOfGuesses=0;
   int computerRandom;
   int guessNum;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public Game() {
        Random number = new Random();
       computerRandom = number.nextInt(100);

    }
    public void takeUserInput(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Take Any number to guess the Computer generating random number from 1 to 100 ");
        guessNum= sc.nextInt();
    }
    public boolean isCorrectNumber(){
       // noOfGuesses++;
        if (guessNum==computerRandom){
            System.out.printf("You won in %d Attempts Hurray!!",noOfGuesses);
            return true;

        }
        else if (guessNum>computerRandom){
            System.out.println("Alas!!Your guess is greater than the computer selecting number ");
            noOfGuesses++;
            return false;

        }
        else{
            System.out.println("Your number is less than the computer selecting number alas!!");
            noOfGuesses++;
            return false;

        }


    }
}

public class OOPs_GuessTheNumberGame {
    public static void main(String[] args) {
        Game game = new Game();
        boolean b = false;
       while (!b) {
            game.takeUserInput();
           b=game.isCorrectNumber();
            //System.out.println(b);
        }


    }
}
