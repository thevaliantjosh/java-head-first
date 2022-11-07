import animals.Dog;

import java.io.FileNotFoundException;

public class FirstClass {
    public static void main(String[] args) {
        int size = 27;

        String name = "Fido";

        Dog scrappy = new Dog("Scrappy",  25);

        int sizeOfScrappy = scrappy.getSize() -5;
        if (sizeOfScrappy > 15) System.out.println(scrappy.bark(8));

//        while (x > 3){
//            myDog.play();
//        }

        int[] numList = {2, 4, 6, 8};

        System.out.println("Hello");
        System.out.printf("Dog: %s%n", scrappy.getName());

        String num = "8";

        int z = Integer.parseInt(num);

        System.out.println(z);

//        try{
//            readTheFile("myFile.txt");
//        } catch(FileNotFoundException e){
//            e.printStackTrace();
//            System.out.println("File not found");
//        }


    }
}
