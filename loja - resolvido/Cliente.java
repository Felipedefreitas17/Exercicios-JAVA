package com.senac.loja;

public class Cliente extends Pessoa {
    private String telefone;
    public Cliente(String cpf, String email, String nome) {
        super(cpf, email, nome);
    }

    @Override
    public String toString() {
        return this.getNome() + " - " + this.getCpf();
    }
}
