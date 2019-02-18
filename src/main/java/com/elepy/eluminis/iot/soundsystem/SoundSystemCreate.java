package com.elepy.eluminis.iot.soundsystem;

import com.elepy.annotations.Inject;
import com.elepy.dao.Crud;
import com.elepy.di.ElepyContext;
import com.elepy.eluminis.external.EluminisAssistant;
import com.elepy.routes.SimpleCreate;

public class SoundSystemCreate extends SimpleCreate<SoundSystem> {

    @Inject
    private EluminisAssistant eluminisAssistant;

    @Override
    public void beforeCreate(SoundSystem objectForCreation, Crud<SoundSystem> crud, ElepyContext elepy) throws Exception {

    }

    @Override
    public void afterCreate(SoundSystem createdObject, Crud<SoundSystem> crud, ElepyContext elepy) {
        eluminisAssistant.changeSoundSystemVolume(createdObject.getAssistant().getEluminisLibraryType(), createdObject.getName(), createdObject.getVolume());

    }

}
