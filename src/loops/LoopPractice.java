package loops;

public class LoopPractice {
    public static void main(String[] args) {
        int x = 1;
        int three = 3;

        System.out.println("Before the loop");

        while(x < 4){
            System.out.println("In the loop");
            System.out.printf("Value of x is: %d%n", x);
            x += 1;
        }

        System.out.println("################");
        System.out.println("Outside the Loop");

        if (three == 3){
            System.out.println("The variable \"three\" equals 3");
        }

        System.out.println("################");

        if (three == 3){
            System.out.println("The variable \"three\" equals 3");
            three++;
            System.out.println(three);
            if (three == 4){
                System.out.println("The variable \"three\" is now 4");
                three++;
                System.out.println(three);
                if (three > 4) {
                    System.out.println("The variable \"three\" is greater than 4");
                }
            }
        }

        System.out.printf("\"three\" now equals: %d%n", three);


        if(x != 1){
            x = 1;
        }

        System.out.println(x);
        while(x < 3){
            System.out.print("Doo");
            System.out.print("Bee");
            x++;
        } if (x == 3){
            System.out.print("Do\n");
        }

        System.out.println(x);





    }
}
