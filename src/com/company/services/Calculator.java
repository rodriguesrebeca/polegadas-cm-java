package com.company.services;

public class Calculator {

    public static float cm(float polegadas){
        final float CONVERSOR_CM = 2.54f;
        return polegadas * CONVERSOR_CM;
    }
}
