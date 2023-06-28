package com.senac.novobanco;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(String agencia, String conta) {
        super(agencia, conta);
    }


    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public double sacar(double valorASacar) {

        if ((this.getSaldo() + this.chequeEspecial) >= valorASacar){
            super.sacar(valorASacar);
        }

        return getSaldo();
    }
}
