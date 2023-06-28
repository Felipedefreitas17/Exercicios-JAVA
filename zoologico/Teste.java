package com.senac.zoologico;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Animal animal;

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i){
            case 1: animal = new Gato(); break;
            case 2: animal = new Humano(); break;
            default: animal = new Pombo(); break;
        }

        animal.emitirSom();



    }




}
