package com.elepy.eluminis.external.assistants;

import com.elepy.exceptions.ElepyException;
import com.elepy.eluminis.external.Assistant;

public class Siri implements Assistant {
    public void changeSoundSystemVolume(String soundSystemId, double volumeLevel) {
        throw new ElepyException("Does Siri ever really work?", 500);
    }

    public void changeLightBrightness(String lightId, double brightness) {
        throw new ElepyException("Maybe next time!", 500);
    }
}
