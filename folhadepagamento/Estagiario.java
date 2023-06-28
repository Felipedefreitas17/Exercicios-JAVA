package com.senac.folhadepagamento;

import java.util.Date;

public class Estagiario extends Colaborador{
    public Estagiario(String nome, String cpf, Date dataDeNascimento, Endereco endereço, EstadoCivil estadoCivil, Formacao formação, Departamento departamento, double salario) {
        super(nome, cpf, dataDeNascimento, endereço, estadoCivil, formação, departamento, salario);
    }
}
