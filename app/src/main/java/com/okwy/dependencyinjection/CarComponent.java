package com.okwy.dependencyinjection;

import com.okwy.dependencyinjection.model.Car;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
