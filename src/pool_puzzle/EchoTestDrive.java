package pool_puzzle;

public class EchoTestDrive {
    public static void main(String[] args) {
        Echo echo = new Echo();

        echo.setCount(5);


        while(echo.getCount() < 5){
            int theCount = echo.Count();
            int numberOfOs = echo.getNumberOfOs();
            String theOs = echo.getTheOs().repeat(numberOfOs);
            echo.hello(theOs) ;
            theCount--;
        }
    }

    //Write a program that will say Hello, but repeat the Hello based on the number you provide, and add o's to the end of hello base on that count, the amount of o's should decrease bases on that repeated number







}//End of EchoTestDrive Class
