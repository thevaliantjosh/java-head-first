public class BottlesOfBeer {
    public static void bottlesOfBeer(int numberOfBeers){
        String bottlesOfBeer = "Bottles of Beer";
        String onTheWall = "On The Wall";
        String takeOneDown = "Take one Down, pass it around!";
        while(numberOfBeers > 0){

            if(numberOfBeers > 1){
                System.out.printf("%d %s %s, %d %s.%n %s%n", numberOfBeers, bottlesOfBeer, onTheWall, numberOfBeers, bottlesOfBeer, takeOneDown);
            } else {
                System.out.printf("%d %s %s, %d %s.%n %s%n", numberOfBeers, "Bottle of Beer", onTheWall, numberOfBeers, "Bottle of Beer", takeOneDown);
            }
            numberOfBeers--;
            if (numberOfBeers > 1){

                System.out.printf("%d %s %s!%n", numberOfBeers, bottlesOfBeer, onTheWall);
                System.out.println("----------------------------------------------------");


            } else if (numberOfBeers == 1){
                System.out.printf("%d Bottle of Beer %s%n", numberOfBeers, onTheWall);
                System.out.println("----------------------------------------------------");

            }  else {
                System.out.println("No More bottles of beer on the Waaaaaallll!!");
            }
        }//End of While loop
    }//End of Bottles of Beer Method
    public static void main(String[] args) {
        //Make a program that will sing the "bottles of bear song" counting down from any number

        bottlesOfBeer(99);

    }
}
