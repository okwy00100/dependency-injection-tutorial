package com.okwy.dependencyinjection.model;

import javax.inject.Inject;

public class Wheels {

//    @Inject
//    public Wheels() {
//    }

    //Suppose we do not own this class hence we can't annotate it with @Inject
    private Rims rims;
    private Tires tires;
    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
