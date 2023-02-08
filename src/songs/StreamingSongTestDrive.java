package songs;

public class StreamingSongTestDrive {
    public static void main(String[] args) {
        StreamingSong comeTogether = new StreamingSong();
        comeTogether.setTitle("Come Together");
        comeTogether.setArtist("The Beatles");
        comeTogether.setDuration(4.19);
        StreamingSong.play(comeTogether.getDuration());
        StreamingSong.printDetails(comeTogether.getTitle(), comeTogether.getArtist());
    }
}
