public class BottlesOfBeer {
    public static String bottlesOfBeer(int numberOfBeers){
        String bottlesOfBeer = "Bottles of Beer";
        String onTheWall = "On The Wall";
        String takeOneDown = "Take one Down, pass it around!";
        int originalBeerAmount = numberOfBeers;
        while(numberOfBeers > 0){

            System.out.printf("%d %s %s, %d %s.%n %s%n", numberOfBeers, bottlesOfBeer, onTheWall, numberOfBeers, bottlesOfBeer, takeOneDown);
            numberOfBeers--;
            if (numberOfBeers > 0){

                System.out.printf("%d %s %s!%n", numberOfBeers, bottlesOfBeer, onTheWall);
                System.out.println("----------------------------------------------------");

            } else {
                System.out.println("No More bottles of beer on the Waaaaaallll!!");
            }
        }
        return "No more bottles of beer on the wall!";
    }
    public static void main(String[] args) {
        //Make a program that will sing the "bottles of bear song" counting down from 10

        bottlesOfBeer(10);

    }
}
