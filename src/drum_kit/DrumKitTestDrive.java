package drum_kit;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();

        int count = 0;


        //I want to play the topHat while the Snare is true:
        //After I play the TopHat, It turns false
        //I want to play the Snare while the topHat is false
        //After I play the Snare, it turns false
        //Looking for:
        /*bang bang bang
        * boom boom boom
        * ding ding ding
        * boom bam boom
        * Repeated 5 times
        *
        * */
        while(count < 5){
            count++;
            if(!d.getSnare() || !d.getTopHat()){
                d.setSnare(true);
                d.setTopHat(true);
            } else {
                d.playSnare();
                d.setSnare(false);
                d.playSnare();
                d.playTopHat();
                d.setTopHat(false);
                d.playTopHat();
            }//end of if/elseif/else
        }//End of While loop




    }//End of Main Class
}//End of DrumKitTestDrive
