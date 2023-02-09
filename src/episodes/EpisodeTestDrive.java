package episodes;

public class EpisodeTestDrive {
    public static void main(String[] args) {
        Episode consumed = new Episode(5, 6, "The Walking Dead", "Consumed");
        consumed.playEpisode(consumed);

        Episode totalRickall = new Episode(2, 4, "Total Rickall", "Rick and Morty");

        totalRickall.playEpisode(totalRickall);
    }
}
