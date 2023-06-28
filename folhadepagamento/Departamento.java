package com.senac.folhadepagamento;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nomeDoDepartamento;
    private Gerente gerente;
    private List<Colaborador> colaboradorList = new ArrayList<>();

    public Departamento(String nomeDoDepartamento) {
        this.nomeDoDepartamento = nomeDoDepartamento;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public void incluirFuncionario(Colaborador colaborador){
        this.colaboradorList.add(colaborador);
    }

    public String getNomeDoDepartamento() {
        return nomeDoDepartamento;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public List<Colaborador> getColaboradorList() {
        return colaboradorList;
    }

    @Override
    public String toString() {
        return " " +  nomeDoDepartamento + " - Gerente: " + gerente.getNome()  ;
    }
}
