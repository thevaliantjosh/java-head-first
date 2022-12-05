package guessing_game;

import utils.Input;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Player {

    //Instance Variables
    private int number;

    private String player;


    //Getters and Setters

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPlayer(){
        return player;
    }

    public void setPlayer(String player){
        this.player = player;
    }

    //Constructors

    public Player(){

    }

    public Player(int number, String player){
        this.number = number;
        this.player = player;
    }

    //Methods

    public int guess(){
        Random random = new Random();
        return random.nextInt(10 + 1);
    }

}//End of Player Class

