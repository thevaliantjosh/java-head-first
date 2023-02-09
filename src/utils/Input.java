package utils;

import java.util.Random;
import java.util.Scanner;

public class Input {

    //Instance Variables
    private Random generator = new Random();

    Scanner scanner = new Scanner(System.in);


    public Random getGenerator() {
        return generator;
    }

    public void setGenerator(Random generator) {
        this.generator = generator;
    }

    public Input(){
        this.generator = getGenerator();
    }

}
