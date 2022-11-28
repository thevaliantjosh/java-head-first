import animals.Dog;

import java.io.FileNotFoundException;
import java.util.Random;

public class FirstClass {
    public static void main(String[] args) {
        Random generator = new Random();

        int size = 27;

        String name = "Fido";

        Dog scrappy = new Dog("Scrappy", "Border Collie",  25);

        int sizeOfScrappy = scrappy.getSize() -5;

//        System.out.println(sizeOfScrappy);
//        if (sizeOfScrappy > 15) System.out.println(scrappy.bark(8));

        int[] numList = {2, 4, 6, 8};

        int randomIndex = generator.nextInt(numList.length);
        System.out.println(randomIndex);
        while (numList[randomIndex] > 0){
            numList[randomIndex]--;
            scrappy.play(scrappy.getName());
        }



//        System.out.println("Hello");
//        System.out.printf("Dog: %s%n", scrappy.getName());

//        String num = "8";

//        int z = Integer.parseInt(num);

//        System.out.println(z);

//        try{
//            readTheFile("myFile.txt");
//        } catch(FileNotFoundException e){
//            e.printStackTrace();
//            System.out.println("File not found");
//        }


    }
}
