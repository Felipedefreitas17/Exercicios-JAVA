package com.senac.folhadepagamento;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Colaborador {
   private String nome;
   private String cpf;
   private Date dataDeNascimento;
   private Endereco endereço;
   private EstadoCivil estadoCivil;
   private Formacao formação;
   private Departamento departamento;
   private double salario;

   public Colaborador(String nome, String cpf, Date dataDeNascimento, Endereco endereço, EstadoCivil estadoCivil, Formacao formação, Departamento departamento, double salario) {
      this.nome = nome;
      this.cpf = cpf;
      this.dataDeNascimento = dataDeNascimento;
      this.endereço = endereço;
      this.estadoCivil = estadoCivil;
      this.formação = formação;
      this.departamento = departamento;
      this.salario = salario;
   }

   public double getSalario() {
      return salario;
   }

   public String getNome() {
      return nome;
   }

   public String getCpf() {
      return cpf;
   }

   public Date getDataDeNascimento() {
      return dataDeNascimento;
   }

   public Endereco getEndereço() {
      return endereço;
   }

   public EstadoCivil getEstadoCivil() {
      return estadoCivil;
   }

   public Formacao getFormação() {
      return formação;
   }

   public Departamento getDepartamento() {
      return departamento;
   }

   public double calculoDeSalario() {
      System.out.println("Calculo de Salario - Colaborador");

      return this.getSalario() ;
   }

   @Override
   public String toString() {
      SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
      return   "\n"+nome + '\'' +
              "\t\ncpf= '" + cpf + '\'' +
              "\t\ndataDeNascimento= " + sf.format(dataDeNascimento) +
              "\t\nendereço= " + endereço +
              "\t\nestadoCivil= " + estadoCivil +
              "\t\nformação= " + formação +
              "\t\ndepartamento= " + departamento +
              "\t\nSalario Base= " + salario +
              "\t\nSalario com Comissão= " + this.calculoDeSalario() ;
   }
}
