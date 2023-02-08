package pool_puzzle;

public class EchoTestDrive {
    public static void main(String[] args) {
        Echo echo = new Echo();




        while(echo.getCount() < 5){
            int theCount = echo.getCount();
            echo.setNumberOfOs(theCount);
            int theNumberOfOs = echo.getNumberOfOs();
            String theOs = echo.getTheOs().repeat(theNumberOfOs);
            echo.hello(theOs);

        }
    }

    //Write a program that will say Hello, but repeat the Hello based on the number you provide, and add o's to the end of hello base on that count, the amount of o's should decrease bases on that repeated number







}//End of EchoTestDrive Class
