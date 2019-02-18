package com.elepy.eluminis.external;

import com.elepy.eluminis.external.assistants.AmazonAlexa;
import com.elepy.eluminis.external.assistants.GoogleAssistant;
import com.elepy.eluminis.external.assistants.Siri;

import java.util.EnumMap;
import java.util.Map;

/**
 * A Delegation Assistant.
 */
public final class EluminisAssistant {
    private Map<AssistantType, Assistant> assistants;

    public EluminisAssistant() {
        assistants = new EnumMap<>(AssistantType.class);

        assistants.put(AssistantType.SIRI, new Siri());
        assistants.put(AssistantType.AMAZON_ALEXA, new AmazonAlexa());
        assistants.put(AssistantType.GOOGLE_ASSISTANT, new GoogleAssistant());

    }

    public void changeSoundSystemVolume(AssistantType assistantType, String soundSystemId, double volumeLevel) {
        assistants.get(assistantType).changeSoundSystemVolume(soundSystemId, volumeLevel);
    }

    public void changeLightBrightness(AssistantType assistantType, String lightId, double brightness) {
        assistants.get(assistantType).changeLightBrightness(lightId, brightness);
    }

}
