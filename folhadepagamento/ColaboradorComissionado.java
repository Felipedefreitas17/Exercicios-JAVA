package com.senac.folhadepagamento;

import java.util.Date;

public class ColaboradorComissionado extends Colaborador{
    private double totalVendas;

    public ColaboradorComissionado(String nome, String cpf, Date dataDeNascimento, Endereco endereço, EstadoCivil estadoCivil, Formacao formação, Departamento departamento, double salario) {
        super(nome, cpf, dataDeNascimento, endereço, estadoCivil, formação, departamento, salario);
    }

    public void adicionarVenda(double venda){
        this.totalVendas+=venda;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
}
