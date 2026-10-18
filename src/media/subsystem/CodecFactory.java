package media.subsystem;

public class CodecFactory {
    public String extractCodec(String targetFormat) {
        System.out.println("[CodecFactory] Selecting codec for format: " + targetFormat);
        if (targetFormat.equalsIgnoreCase("mp4")) {
            return "H.264 / AAC";
        } else if (targetFormat.equalsIgnoreCase("ogg")) {
            return "Vorbis";
        }
        return "Generic Codec";
    }
}