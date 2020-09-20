package com.okwy.dependencyinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.okwy.dependencyinjection.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /**
     * Field injection
     * */
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();

        /**
         * This line of code is used when capitalizing on Constructor injection
         * */
        //car = carComponent.getCar();

        /**
         * This line of code is used when capitalizing on Field injection
         * */
        carComponent.inject(this);

        car.drive();

    }
}