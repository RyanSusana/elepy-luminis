package com.elepy.eluminis.iot.light;

import com.elepy.annotations.Inject;
import com.elepy.dao.Crud;
import com.elepy.di.ElepyContext;
import com.elepy.eluminis.external.EluminisAssistant;
import com.elepy.routes.SimpleCreate;

public class LightCreate extends SimpleCreate<Light> {
    @Inject
    private EluminisAssistant eluminisAssistant;

    @Override
    public void beforeCreate(Light objectForCreation, Crud<Light> crud, ElepyContext elepy) throws Exception {

    }

    @Override
    public void afterCreate(Light createdObject, Crud<Light> crud, ElepyContext elepy) {
        eluminisAssistant.changeLightBrightness(createdObject.getAssistant().getEluminisLibraryType(), createdObject.getName(), createdObject.getBrightnessLevel());
    }
}
