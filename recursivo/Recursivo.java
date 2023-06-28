package com.senac.recursivo;

public class Recursivo {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
        contarAte(100);
    }

    public static int contarAte(int numero){
        if (numero <= 0){
            System.out.println(numero);
            return numero;
        }else{
            System.out.println(numero);
            return contarAte(numero -1);
        }
    }

    public static int fatorial(int numero){
      return numero > 1 ?
               fatorial(numero - 1) * numero:
               numero ;
    }
}
