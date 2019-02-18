package com.elepy.eluminis.iot.light;

import com.elepy.annotations.Create;
import com.elepy.annotations.PrettyName;
import com.elepy.annotations.RestModel;
import com.elepy.annotations.Unique;
import com.elepy.eluminis.iot.Assistant;

@RestModel(slug = "/lights", name = "Lights")
@Create(handler = LightCreate.class)
public class Light {
    private String id;

    @PrettyName("Name (as appeared on your Assistant)")
    @Unique
    private String name;

    @PrettyName("Brightness Level")
    @Unique
    private double brightnessLevel;

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

    public double getBrightnessLevel() {
        return brightnessLevel;
    }

    public void setBrightnessLevel(double brightnessLevel) {
        this.brightnessLevel = brightnessLevel;
    }

    public Assistant getAssistant() {
        return assistant;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }
}
