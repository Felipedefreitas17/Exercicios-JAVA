package com.senac.exceptions;

public class Divisao {
    public static void main(String[] args) {
        try{
            int i = 10/0;
        }catch (Exception e){
            System.out.println("Você tentou dividir por 0");
        }

        try{
            int i = 10/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Executa sempre");
        }

    }
}
