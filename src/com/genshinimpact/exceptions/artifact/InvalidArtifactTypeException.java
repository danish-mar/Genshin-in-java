package com.genshinimpact.exceptions.artifact;

import com.genshinimpact.artifact.*;
public class InvalidArtifactTypeException extends Exception {
    private ArtifactType expectedType;
    private ArtifactType actualType;

    public InvalidArtifactTypeException(ArtifactType expectedType, ArtifactType actualType) {
        super("Invalid artifact type. Expected: " + expectedType + ", Received: " + actualType);
        this.expectedType = expectedType;
        this.actualType = actualType;
    }

    // Getters for expectedType and actualType if needed
}

