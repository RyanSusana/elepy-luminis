package com.elepy.eluminis.external.assistants;

import com.elepy.eluminis.external.Assistant;

public class AmazonAlexa implements Assistant {
    public void changeSoundSystemVolume(String soundSystemId, double volumeLevel) {
        System.out.println(String.format("Alexa changed volume to: %f", volumeLevel));
    }

    public void changeLightBrightness(String lightId, double brightness) {
        System.out.println(String.format("Alexa changed brightness to: %f", brightness));
    }
}
