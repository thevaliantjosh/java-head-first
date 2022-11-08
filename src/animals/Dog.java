package animals;

import java.util.Random;

public class Dog {

    //Variables
    private String name;

    private int size;

    //Getters and Setters

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }



    //Constructors
    public Dog(){

    }
    public Dog(String name, int size){
        this.name = name;
        this.size = size;
    }


    //Methods

    public String bark(int count){
        String bark = "Woof Woof";
        return bark.repeat(count);
    }

    public void play(String doggo){
        Random random = new Random();
        int doggoActivity = random.nextInt(6);
//        System.out.println(doggoActivity);
        switch(doggoActivity){
            case 1:
                System.out.printf("%s chases a ball%n", doggo);
            break;
            case 2:
                System.out.printf("%s chews a bone%n", doggo);
            break;
            case 3:
                System.out.printf("%s chases his tail%n", doggo);
            break;
            case 4:
                System.out.printf("%s fetches a ball%n", doggo);
            break;
            case 5:
                System.out.printf("%s does a trick!%n", doggo);
            break;
            default:
                System.out.printf("%s takes a nap%n", doggo);
        }

    }



}//End of Dog Class
