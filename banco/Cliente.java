package edu.senac.banco;

public class Cliente {
    private String CPF;
    private String nome;
    private String email;
    private Endereco endereco;

    public Cliente(String cpf){
        this.CPF = cpf;
    }

    public Cliente(String cpf, String nome){
    }

    public Cliente(String cpf, String nome, Endereco endereco){
        this.CPF = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return  this.endereco;
    }
}
