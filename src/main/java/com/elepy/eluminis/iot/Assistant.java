package com.elepy.eluminis.iot;


import com.elepy.eluminis.external.AssistantType;

/**
 * This acts as a decorator enum for {@link AssistantType} with Elepy Specific annotations.
 * Remember we have to pretend like we can't change the Eluminis Library
 */
public enum Assistant {
    SIRI(AssistantType.SIRI),
    GOOGLE(AssistantType.GOOGLE_ASSISTANT),
    ALEXA(AssistantType.AMAZON_ALEXA);

    private final AssistantType eluminisLibraryType;

    Assistant(AssistantType libraryType) {
        this.eluminisLibraryType = libraryType;
    }

    public AssistantType getEluminisLibraryType() {
        return eluminisLibraryType;
    }
}
