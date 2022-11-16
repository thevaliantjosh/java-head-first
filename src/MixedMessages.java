import java.util.Arrays;

public class MixedMessages {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        //result: 11 34 59
//        while(x < 5){
//           x++;
//           y = y + x;
//
//            System.out.print(x + "" + y + " ");
//            x++;
//
//        }


        //result: 00 11 21 32 42
//        while(x < 5){
//            y = x - y;
//
//            System.out.print(x + "" + y + " ");
//            x++;
//
//        }

        //result: 02 14 25 36 47
//        while(x < 5){
//            y = y + 2;
//            if (y > 4){
//                y = y - 1;
//            }
//            System.out.print(x + "" + y + " ");
//            x++;
//        }

        //result: 02 14 36 48

//        while(x < 5){
//            if (y < 5){
//                x = x + 1;
//                if (y < 3){
//                    x = x - 1;
//                }
//            }
//            y = y + 2;
//            System.out.print(x + "" + y + " ");
//            x++;
//        }


        /*Get this output:
        a noise
        annoys
        an oyster
        My attempt
        * */
//        while(x < 4){
//            if (x < 1){
//                System.out.print("a");
//            }
//            x++;
//            if(x > 0){
//                System.out.print(" ");
//            }
//
//            if(x == 1){
//               System.out.print("noise");
//            }
//            if(x > 1){
//                System.out.print("annoys");
//
//            }
//            System.out.println();
//            x++;
//
//            if (x > 3 ){
//                System.out.print("an ");
//                System.out.print("oyster");
//            }
//
//
//        }


        //The answer form the book

        while(x < 4){
            System.out.print("a");
            if(x < 1){
                System.out.print(" ");
            }
            System.out.print("n");
            if(x > 1){
                System.out.print(" oyster");
                x = x + 2;
            }
            if(x == 1){
                System.out.print("noys");
            }
            if(x < 1){
                System.out.print("oise");
            }
            System.out.println();
            x++;
        }












    }//End of Main Method
}//End of MixedMessages Class
