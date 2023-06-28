package com.senac.generics;

import com.senac.folhadepagamento.*;
import com.senac.generics.ListaDeGenerics;
import com.senac.loja.Colaborador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TesteGenerics {
    public static void main(String[] args) {


        Endereco endereco = new Endereco("Rua 0","São Paulo","10","NA", Estado.SP);
        Departamento departamento = new Departamento("Tecnologia");
        Gerente gerente = new Gerente("Maria Silva","000000000",new Date(),endereco, EstadoCivil.DIVORCIADO,Formacao.POS,departamento,20000,"9999");
        departamento.setGerente(gerente);




        Generics<Integer,Integer> generics = new Generics<>(1,2);
        Generics<String, Boolean> generics2 = new Generics<>("Maria", true);
        Generics<Character, String> generics3 = new Generics<>('C',"CASA");
        Generics<Gerente, String> generics4 = new Generics<>(gerente,"CASA");

        System.out.println(generics.toString());
        System.out.println(generics2.toString());
        System.out.println(generics3.toString());
        System.out.println(generics4.toString());

        List<Generics> listaDePalavras = new ArrayList<>();
        listaDePalavras.add(generics3);
        listaDePalavras.add(generics2);
        listaDePalavras.add(generics4);

        listaDePalavras.forEach(g -> System.out.println(g.toString()));


    }
}
