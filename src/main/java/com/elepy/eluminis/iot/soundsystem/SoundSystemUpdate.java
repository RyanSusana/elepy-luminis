package com.elepy.eluminis.iot.soundsystem;

import com.elepy.annotations.Inject;
import com.elepy.dao.Crud;
import com.elepy.di.ElepyContext;
import com.elepy.eluminis.external.EluminisAssistant;
import com.elepy.routes.SimpleUpdate;

public class SoundSystemUpdate extends SimpleUpdate<SoundSystem> {

    @Inject
    private EluminisAssistant eluminisAssistant;

    @Override
    public void beforeUpdate(SoundSystem beforeVersion, Crud<SoundSystem> crud, ElepyContext elepy) throws Exception {

    }

    @Override
    public void afterUpdate(SoundSystem beforeVersion, SoundSystem updatedVersion, Crud<SoundSystem> crud, ElepyContext elepy) {

        eluminisAssistant.changeSoundSystemVolume(updatedVersion.getAssistant().getEluminisLibraryType(), updatedVersion.getName(), updatedVersion.getVolume());
    }
}
