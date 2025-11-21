package com.example.serie6.model;

public class Serie {
    public int calcular(int limite) {
        int suma = 0;
        for (int i = 0; i <= limite; i += 6) {
            suma += i;
        }
        return suma;    
    }
}
