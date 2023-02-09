package episodes;
import java.util.Scanner;

public class Episode {
    //Instance Variables
    private int seriesNumber;
    private int episodeNumber;

    private String episodeName;

    private String seriesName;

    Scanner scanner = new Scanner(System.in);

    //Getters and Setters

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }
    //Constructors

    public Episode() {

    }

    public Episode(int seriesNumber, int episodeNumber, String seriesName, String episodeName) {
        this.seriesNumber = seriesNumber;
        this.episodeNumber = episodeNumber;
        this.seriesName = seriesName;
        this.episodeName = episodeName;
    }

    //Methods

    public void playEpisode(Episode playingEpisode) {
        int seriesNumber = playingEpisode.seriesNumber;
        int episodeNumber = playingEpisode.episodeNumber;
        String seriesName = playingEpisode.seriesName;
        String episodeName = playingEpisode.episodeName;

        String episodeDetails = "Your watching Season " + seriesNumber + ", Episode " + episodeNumber + ": " + "\"" + episodeName + "\"" + " of " + seriesName;
        System.out.println(episodeDetails + "\n");
        skipIntro();
    }

    public void skipIntro() {
        System.out.println("## Skip Intro? Y/N ##");
        String skipIntro = scanner.nextLine();
        String seriesName = this.seriesName;
        String episodeName = this.episodeName;
        if (skipIntro.equalsIgnoreCase("y")) {
            System.out.printf("Intro Skipped. Enjoy %s.%n", seriesName);
        } else if (skipIntro.equalsIgnoreCase("n")) {
            System.out.printf("Playing Intro. Enjoy %s!%n", episodeName);
        }

    }
}//End of Episode Class
