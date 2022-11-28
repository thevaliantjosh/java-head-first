package animals;

public class AnimalHouse {
    public static void main(String[] args) {
        Dog denver = new Dog("Denver", "Labrador Retriever", 50);

        System.out.println(denver.bark(2));

        denver.play(denver.getName());

        System.out.println(denver.getSize());
    }
}
