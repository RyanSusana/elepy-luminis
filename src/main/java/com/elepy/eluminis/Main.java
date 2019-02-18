package com.elepy.eluminis;

import com.elepy.Elepy;
import com.elepy.admin.ElepyAdminPanel;
import com.elepy.eluminis.external.EluminisAssistant;
import com.github.fakemongo.Fongo;
import com.mongodb.DB;

public class Main {
    public static void main(String[] args) {
        Fongo fongo = new Fongo("eluminis");
        DB eluminisDB = fongo.getDB("eluminis");

        new Elepy()
                .registerDependency(DB.class, eluminisDB)//.connectDB(DB) works too
                .registerDependency(new EluminisAssistant())
                .onPort(6827)
                .addModelPackage("com.elepy.eluminis.iot")
                .addExtension(new ElepyAdminPanel())
                .start();
    }
}
