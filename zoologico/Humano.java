package com.senac.zoologico;

public class Humano implements Animal{
    @Override
    public void emitirSom() {
        System.out.println("FALA");
    }

    @Override
    public void nascer() {
        System.out.println("GESTACAO 9 MESES");
    }
}
