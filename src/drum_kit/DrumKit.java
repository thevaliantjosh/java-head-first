package drum_kit;

public class DrumKit {

    private boolean topHat = true;

    private boolean snare = true;

    public void setTopHat(boolean topHat){
        this.topHat = topHat;
    }

    public boolean getTopHat(){
        return topHat;
    }

    public void setSnare(boolean snare) {
        this.snare = snare;
    }

    public boolean getSnare() {
        return snare;
    }

    //Constructors

    public DrumKit(){

    }

    public DrumKit(boolean topHat, boolean snare){
        this.topHat = topHat;
        this.snare = snare;
    }

    //Methods

    public void playSnare(){
        if (snare){
            System.out.println("bang bang bang bang");
        } else if (!snare){
            System.out.println("boom boom boom");
        }

    }

    public void playTopHat(){
        if(topHat){
            System.out.println("ding ding ding ding");
        } else if (!topHat){
            System.out.println("boom bam boom");
        }

    }




}//End of DrumKit Class



