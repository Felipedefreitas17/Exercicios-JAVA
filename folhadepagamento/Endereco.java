package com.senac.folhadepagamento;


public class Endereco {


    private String nomeRua;
    private String cidade;
    private  String numero;
    private  String complemento;
    private Estado estado;

    public Endereco() {
    }

    public Endereco(String nomeRua, String cidade, String numero, String complemento, Estado estado) {
        this.nomeRua = nomeRua;
        this.cidade = cidade;
        this.numero = numero;
        this.complemento = complemento;
        this.estado = estado;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco:" + nomeRua + '\'' +
                ", '" + numero +
                ", " + complemento +
                ", " + cidade +
                ", " + estado ;
    }
}
