package com.okwy.dependencyinjection.model;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    /**
     * Car class member variables
     * */
    private Engine engine;
    private Wheels wheels;


    /**
     * Car class constructor injection
     * */
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    /**
     * Method to just check if class has been instantiated
     * */
    public void drive(){
        Log.d(TAG, "Driving... ");
    }
}
