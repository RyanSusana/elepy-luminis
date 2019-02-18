package com.elepy.eluminis.iot.light;

import com.elepy.annotations.Inject;
import com.elepy.dao.Crud;
import com.elepy.di.ElepyContext;
import com.elepy.eluminis.external.EluminisAssistant;
import com.elepy.routes.SimpleUpdate;

public class LightUpdate extends SimpleUpdate<Light> {

    @Inject
    private EluminisAssistant eluminisAssistant;

    @Override
    public void beforeUpdate(Light beforeVersion, Crud<Light> crud, ElepyContext elepy) throws Exception {

    }

    @Override
    public void afterUpdate(Light beforeVersion, Light updatedVersion, Crud<Light> crud, ElepyContext elepy) {
        eluminisAssistant.changeLightBrightness(updatedVersion.getAssistant().getEluminisLibraryType(), updatedVersion.getName(), updatedVersion.getBrightnessLevel());

    }
}
