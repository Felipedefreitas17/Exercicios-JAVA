package com.senac.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Erros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();


            System.out.println(dividir(valor1,valor2));

    }

    public static int dividir(int valor1, int valor2){
        int resultado =0;

        int[] vetor =new int[2];

        try {
           resultado = valor1 / valor2;
           vetor[3]=resultado;
        }catch (ArithmeticException e){
           resultado = valor1;
        }catch (Exception e){
            resultado = 1;
            System.out.println("Deu algum erro: " + e.getMessage());
        }finally {
            if(resultado ==1){
                System.out.println("Finally, sempre passo aqui - Erro 1");
            }else {
                System.out.println("Finally, sempre passo aqui - Erro 2");
            }

        }

        return resultado;

    }

}
