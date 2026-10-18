# Facade Pattern — Media Conversion System

This project demonstrates the **Facade Structural Design Pattern** in Java (JDK 17). It provides a simplified interface (`MediaConversionFacade`) to wrap and coordinate a complex subsystem of media processing classes.

## Project Structure

```text
src/
└── media/
    ├── subsystem/               # Complex subsystem classes
    │   ├── MetadataReader.java
    │   ├── BitrateReader.java
    │   ├── AudioMixer.java
    │   └── CodecFactory.java
    ├── MediaConversionFacade.java # Facade class
    └── Main.java                # Client application