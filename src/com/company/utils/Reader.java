package com.company.utils;

import java.util.Scanner;

public class Reader {
    private static Scanner scanPolegadas;

    public static float scannearPolegadas(){
        scanPolegadas = new Scanner(System.in);
        Print.printMsgPolegadas();
        float polegadas = scanPolegadas.nextFloat();

        return polegadas;
    }
}
