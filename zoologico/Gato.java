package com.senac.zoologico;

public class Gato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("MIAU");
    }

    @Override
    public void nascer() {
        System.out.println("GESTACAO 2 MESES");
    }
}
