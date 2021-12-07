package com.company.utils;

import com.company.services.Calculator;

public class Print {

    final static String MSG_POLEGADAS = "Insira a medida em polegadas: ";
    final static String MSG_RESULTS = "A medida de %.2f polegadas equivale a %.2f centímetros.";

    public static void printMsgPolegadas() {
        System.out.print(MSG_POLEGADAS);
    }

    public static void printMsgResults(float polegadas){
        System.out.printf(MSG_RESULTS, polegadas, Calculator.cm(polegadas));

    }
}
