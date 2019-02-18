package com.elepy.eluminis.iot;


import com.elepy.annotations.PrettyName;
import com.elepy.eluminis.external.AssistantType;

/**
 * This acts as a decorator enum for {@link AssistantType} with Elepy Specific annotations.
 * Remember we have to pretend like we can't change the Eluminis Library
 */
public enum Assistant {
    @PrettyName("Siri") SIRI(AssistantType.SIRI),
    @PrettyName("Google Assistant") GOOGLE(AssistantType.GOOGLE_ASSISTANT),
    @PrettyName("Amazon Alexa") ALEXA(AssistantType.AMAZON_ALEXA);

    private final AssistantType eluminisLibraryType;

    Assistant(AssistantType libraryType) {
        this.eluminisLibraryType = libraryType;
    }

    public AssistantType getEluminisLibraryType() {
        return eluminisLibraryType;
    }
}
