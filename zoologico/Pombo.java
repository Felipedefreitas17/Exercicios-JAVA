package com.senac.zoologico;

public class Pombo implements Animal{
    @Override
    public void emitirSom() {
        System.out.println("PRU");
    }

    @Override
    public void nascer() {
        System.out.println("OVO 19 DIAS");
    }
}
