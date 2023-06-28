package com.senac.cadastro;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PessoaFisicaJuridica pessoaFisicaJuridica;

        System.out.println("Deseja cadastrar PF / PJ");
        int escolha = scanner.nextInt();
        if (escolha == 1){
            pessoaFisicaJuridica = new PessoaFisica();
        }else {
            pessoaFisicaJuridica = new PessoaJuridica();
        }

        System.out.println(pessoaFisicaJuridica.calculoIR());

    }




}
