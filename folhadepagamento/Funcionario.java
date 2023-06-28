package com.senac.folhadepagamento;

import java.util.Date;

public class Funcionario extends ColaboradorComissionado{

    private static final double COMISSAO = 0.15;
    public Funcionario(String nome, String cpf, Date dataDeNascimento, Endereco endereço, EstadoCivil estadoCivil, Formacao formação, Departamento departamento, double salario) {
        super(nome, cpf, dataDeNascimento, endereço, estadoCivil, formação, departamento, salario);
    }

    @Override
    public double calculoDeSalario() {

        System.out.println("Calculo de Salario - Funcionario");

        return this.getSalario() + this.getTotalVendas() * COMISSAO;
    }
}
