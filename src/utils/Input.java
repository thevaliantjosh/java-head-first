package utils;

import java.util.Random;

public class Input {
    private Random generator = new Random();


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
