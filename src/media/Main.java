package media;

public class Main {
    public static void main(String[] args) {
        MediaConversionFacade converter = new MediaConversionFacade();

        converter.convert("funny_cat_video.mov", "mp4");
        converter.convert("podcast_episode.wav", "ogg");
    }
}