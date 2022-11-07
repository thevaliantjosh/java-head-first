package animals;

public class Dog {

    //Variables
    private String name;

    private int size;

    //Getters and Setters

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }



    //Constructors
    public Dog(){

    }
    public Dog(String name, int size){
        this.name = name;
        this.size = size;
    }


    //Methods

    public String bark(int count){
        String bark = "Woof Woof";
        return bark.repeat(count);
    }




}//End of Dog Class
