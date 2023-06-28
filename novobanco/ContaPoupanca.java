package com.senac.novobanco;

public class ContaPoupanca extends  Conta{

    public ContaPoupanca(String agencia, String conta) {
        super(agencia, conta);
    }

    @Override
    public double sacar(double valorASacar) {
        if (this.getSaldo() >= valorASacar){
            super.sacar(valorASacar);
        }
        return this.getSaldo();
    }
}
