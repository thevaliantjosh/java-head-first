package episodes;

public class EpisodeTestDrive {
    public static void main(String[] args) {
        Episode consumed = new Episode(5, 6, "The Walking Dead", "Consumed");
        System.out.println(consumed.playEpisode(consumed));

    }
}
