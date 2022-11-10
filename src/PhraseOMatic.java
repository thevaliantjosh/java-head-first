import arrays_of_strings.StringArrays;
import utils.Input;

import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {
        Input random = new Input();
        StringArrays myArray = new StringArrays();
        int oneLength = myArray.wordListOne.length;
        int twoLength = myArray.wordListTwo.length;
        int threeLength = myArray.wordListThree.length;

        int rand1 = random.getGenerator().nextInt(oneLength);
        int rand2 = random.getGenerator().nextInt(twoLength);
        int rand3 = random.getGenerator().nextInt(threeLength);

        String phrase = myArray.wordListOne[rand1] + " " + myArray.wordListTwo[rand2] + " " + myArray.wordListThree[rand3];

        System.out.printf("What we need is a %s", phrase);

    }
}
