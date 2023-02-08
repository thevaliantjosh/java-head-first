package pool_puzzle;

public class Echo {

    //Instance Variables

    private int count;

    private int numberOfOs;

    private String theOs = "o";

    //Getters and Setters

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNumberOfOs() {
        return numberOfOs;
    }

    public void setNumberOfOs(int numberOfOs) {
        this.numberOfOs = numberOfOs;
    }

    public String getTheOs() {
        return theOs;
    }

    public void setTheOs(String theOs) {
        this.theOs = theOs;
    }

    //Constructors

    public Echo(){

    }

    public Echo(int count, String theOs){
        this.count = count;
        this.theOs = theOs;
    };


    //Methods





    public void hello(String theOs){
        String addTheOs = theOs;
        System.out.println("hello" + addTheOs);
    }

}
