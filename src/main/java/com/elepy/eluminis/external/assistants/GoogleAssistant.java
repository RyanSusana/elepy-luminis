package com.elepy.eluminis.external.assistants;

import com.elepy.eluminis.external.Assistant;

public class GoogleAssistant implements Assistant {
    public void changeSoundSystemVolume(String soundSystemId, double volumeLevel) {
        System.out.println(String.format("Google changed volume to: %f", volumeLevel));
    }

    public void changeLightBrightness(String lightId, double brightness) {
        System.out.println(String.format("Google changed brightness to: %f", brightness));
    }
}
