package guessing_game;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class GuessGame {
//GuessGame has three instance variables for the three Player objects
    //Creating and assigning three Player Objects.
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();

    public void startGame(){
//Declare three variables to hold the three guesses the Player makes.
        int p1Guess = 0;
        int p2Guess = 0;
        int p3Guess = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        Random random = new Random();
        int targetNumber = random.nextInt(10 + 1);

        System.out.println("I'm thinking of a number between 0 and 10");

        while(true){
            System.out.printf("###Number to guess is %d####%n", targetNumber);
            //Calling Each Players Guess Method, and setting it to the number variable in the Player Class
            p1.setNumber(p1.guess());
            p2.setNumber(p2.guess());
            p3.setNumber(p3.guess());

            //Getting the random number that was set by calling the guess method
            p1Guess = p1.getNumber();
            p2Guess = p2.getNumber();
            p3Guess = p3.getNumber();
            System.out.printf("Player one guessed %d%n Player two guessed %d%n Player Three guessed %d%n", p1Guess, p2Guess, p3Guess);

            //Checking Each players guess to see if it matches the Target Number
            if(p1Guess == targetNumber){
                p1IsRight = true;

            } if(p2Guess == targetNumber){
                p2IsRight = true;
            } if(p3Guess == targetNumber){
                p3IsRight = true;
            }

            //If player one OR Player two OR player three is right
            if(p1IsRight || p2IsRight || p3IsRight){
                System.out.println("We have a Winner!");
                if (p1IsRight){
                    String player1Correct = "Player one Got it Right! With a guess of " + p1Guess + "!";
                    System.out.printf(player1Correct + "%n");
                } if (p2IsRight){
                    String player2Correct = "Player Two Nailed it! With a guess of " + p2Guess + "!";
                    System.out.printf(player2Correct + "%n");
                }if (p3IsRight){
                    String player3Correct = "Player Three Crushed it! With a guess of " + p3Guess + "!";
                    System.out.printf(player3Correct + "%n");
                }
                System.out.println("Game is Over! Thank you for playing!");
                break;
            } else {
                System.out.println("There were no correct guesses. Players will have to try again!");
            }//End of if/Else

        }//End of While Loop


    }//End of Start Game Method

}//End of GuessGame Class
