package com.senac.folhadepagamento;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
//        carga de dados
        Endereco endereco = new Endereco("Rua 0","São Paulo","10","NA",Estado.SP);
        Departamento departamento = new Departamento("Tecnologia");
        Gerente gerente = new Gerente("Maria Silva","000000000",new Date(),endereco,EstadoCivil.DIVORCIADO,Formacao.POS,departamento,20000,"9999");
        departamento.setGerente(gerente);
        departamento.incluirFuncionario(gerente);
        gerente.adicionarVenda(60000);

        Funcionario funcionario1 = new Funcionario("Joaquina Ferreira","1111111",new Date(),endereco,EstadoCivil.SOLTEIRO,Formacao.SUPERIOR,departamento,2000);
        funcionario1.adicionarVenda(10000);

        Funcionario funcionario2 = new Funcionario("Mario Sergio","222222",new Date(),endereco,EstadoCivil.SOLTEIRO,Formacao.SUPERIOR,departamento,2000);
        funcionario2.adicionarVenda(1999);
        funcionario2.adicionarVenda(5000);

        Estagiario estagiario = new Estagiario("Ana Luiza","222222",new Date(),endereco,EstadoCivil.SOLTEIRO,Formacao.MEDIO,departamento,1000);

        departamento.incluirFuncionario(funcionario1);
        departamento.incluirFuncionario(funcionario2);
        departamento.incluirFuncionario(estagiario);

//        imprimir lista de funcionarios


        System.out.println("---Folha de Pagamento---");
//       // lambda
        departamento.getColaboradorList().forEach(colaborador -> System.out.println(colaborador.toString()));


    }

  }
