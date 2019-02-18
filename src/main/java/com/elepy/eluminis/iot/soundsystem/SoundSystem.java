package com.elepy.eluminis.iot.soundsystem;

import com.elepy.annotations.Number;
import com.elepy.annotations.PrettyName;
import com.elepy.annotations.RestModel;
import com.elepy.annotations.Unique;
import com.elepy.eluminis.iot.Assistant;

@RestModel(slug = "/sounds", name = "Sound Systems")
public class SoundSystem {

    private String id;

    @PrettyName("Name (as appeared on your Assistant)")
    @Unique
    private String name;

    @PrettyName("Volume")
    @Number(minimum = 0, maximum = 100)
    private double volume;

    @PrettyName("Assistant")
    private Assistant assistant;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Assistant getAssistant() {
        return assistant;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }
}
