package com.senac.novobanco;

abstract class Conta {
    private String agencia;
    private String conta;
    private double saldo;

    public Conta(String agencia, String conta) {
        this.agencia = agencia;
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valorAdepositar) {
        this.saldo += valorAdepositar;
        return this.saldo;
    }

    public double sacar(double valorASacar) {
        this.saldo -= valorASacar;
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta: "
                + this.getConta() + " - Agencia: "
                + this.getAgencia() + " - Saldo: "
                + this.getSaldo();
    }
}
