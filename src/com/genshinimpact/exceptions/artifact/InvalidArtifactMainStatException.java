package com.genshinimpact.exceptions.artifact;
import com.genshinimpact.artifact.*;
public class InvalidArtifactMainStatException extends Exception {
    private ArtifactType expectedType;
    private StatType expectedStat;
    private StatType actualStat;

    public InvalidArtifactMainStatException(ArtifactType expectedType, StatType expectedStat, StatType actualStat) {
        super("Invalid main stat for artifact type: " + expectedType + ". Expected: " + expectedStat + ", Received: " + actualStat);
        this.expectedType = expectedType;
        this.expectedStat = expectedStat;
        this.actualStat = actualStat;
    }

    // Getters for all fields
}