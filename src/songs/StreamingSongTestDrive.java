package songs;

public class StreamingSongTestDrive {
    public static void main(String[] args) {
        //Instantiating StreamingSong object
        StreamingSong comeTogether = new StreamingSong();
        //Assigning values title, artist, and duration
        comeTogether.setTitle("Come Together");
        comeTogether.setArtist("The Beatles");
        comeTogether.setDuration(4.19);
        StreamingSong.play(comeTogether.getDuration());
        StreamingSong.printDetails(comeTogether.getTitle(), comeTogether.getArtist());

        //Creating an object and using the constructor to assign the values

        StreamingSong theMetal = new StreamingSong("The Metal", "Tenacious D", 2.45);
        StreamingSong.play(theMetal.getDuration());
        StreamingSong.printDetails(theMetal.getTitle(), theMetal.getArtist());
    }
}
