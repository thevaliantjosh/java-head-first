package episodes;

public class Episode {
    //Instance Variables
    private int seriesNumber;
    private int episodeNumber;

    private String episodeName;

    private String seriesName;

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

    public String getSeriesName(){
        return seriesName;
    }

    public void setSeriesName(String seriesName){
        this.seriesName = seriesName;
    }

    public String getEpisodeName(){
        return episodeName;
    }

    public void setEpisodeName(String episodeName){
        this.episodeName = episodeName;
    }
    //Constructors

    public Episode(){

    }

    public Episode(int seriesNumber, int episodeNumber, String seriesName, String episodeName){
        this.seriesNumber = seriesNumber;
        this.episodeNumber = episodeNumber;
        this.seriesName = seriesName;
        this.episodeName = episodeName;
    }

    //Methods

    public String playEpisode(Episode playingEpisode){
       int seriesNumber = this.seriesNumber;
       int episodeNumber = this.episodeNumber;
       String seriesName = this.seriesName;
       String episodeName = this.episodeName;

       String episodeDetails = "Your watching Season " + seriesNumber + ", Episode " + episodeNumber + ": " + "\"" + episodeName + "\"" + " of " + seriesName;

        return episodeDetails;
    }

}
