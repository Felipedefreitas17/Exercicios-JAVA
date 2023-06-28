package com.senac.folhadepagamento;

import java.util.Date;

public class Gerente extends ColaboradorComissionado{
    private String centroDeCusto;

    private static final double COMISSAO = 0.20;

    public Gerente(String nome, String cpf, Date dataDeNascimento, Endereco endereço, EstadoCivil estadoCivil, Formacao formação, Departamento departamento, double salario, String centroDeCusto) {
        super(nome, cpf, dataDeNascimento, endereço, estadoCivil, formação, departamento, salario);
        this.centroDeCusto = centroDeCusto;
    }

    public String getCentroDeCusto() {
        return centroDeCusto;
    }


    @Override
    public double calculoDeSalario() {
        System.out.println("Calculo de Salario - Gerente");
        return this.getSalario() + this.getTotalVendas() * COMISSAO;
    }
}
