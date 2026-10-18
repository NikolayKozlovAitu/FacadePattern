package media;

import media.subsystem.AudioMixer;
import media.subsystem.BitrateReader;
import media.subsystem.CodecFactory;
import media.subsystem.MetadataReader;

public class MediaConversionFacade {
    private final MetadataReader metadataReader;
    private final BitrateReader bitrateReader;
    private final AudioMixer audioMixer;
    private final CodecFactory codecFactory;

    public MediaConversionFacade() {
        this.metadataReader = new MetadataReader();
        this.bitrateReader = new BitrateReader();
        this.audioMixer = new AudioMixer();
        this.codecFactory = new CodecFactory();
    }

    public void convert(String fileName, String targetFormat) {
        System.out.println("=== Starting conversion: " + fileName + " to " + targetFormat + " ===");

        metadataReader.read(fileName);
        int bitrate = bitrateReader.analyzeBitrate(fileName);
        String codec = codecFactory.extractCodec(targetFormat);
        audioMixer.fixAudio(fileName);

        System.out.println("[MediaConversionFacade] Applied codec (" + codec + ") with bitrate " + bitrate + " kbps");
        System.out.println("=== Conversion completed! New file: " + fileName.split("\\.")[0] + "." + targetFormat + " ===\n");
    }
}