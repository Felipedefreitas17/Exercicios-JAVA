package edu.senac.banco;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("42000000000");

        System.out.println(cliente.getEndereco());


        Endereco endereco = new Endereco("RUA DOS BOBOS","0","N/A","SAO PAULO","SP","05000000");

        Cliente clienteNumeroDois = new Cliente("6347236742","MARIA SILVA",endereco);

        System.out.println(new Date("12/13/2022"));
    }
}
