public class Shuffle1 {
    public static void main(String[] args) {
        int x = 3;

        while(x > 0){
            if(x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if(x == 2){
                System.out.print("b c");

            }
            if ( x == 1){
                System.out.print("d\n");
                x = x - 1;
            }

        }

        int x1 = 1;
        while ( x1 < 10){
            x1++;
            if(x1 > 3){
                System.out.println("big x");
            }
        }

        int y = 5;
        while(y > 1){
            y--;
            if (y < 3){
                System.out.println("small y");
            }
        }





    }//End of Main method
}//End of Shuffle Class
