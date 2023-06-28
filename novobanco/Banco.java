package com.senac.novobanco;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    Map<String, Conta> contas = new HashMap<>();

    public Conta cadastrarConta(Conta conta){
       return contas.put(conta.getConta(),conta);
    }

    public double depositar(String numeroDaConta, double valorAdepositar){
        return contas.get(numeroDaConta).depositar(valorAdepositar);
    }

    public double sacar(String numeroDaConta, double valorAsacar){
        Conta conta = contas.get(numeroDaConta);
        conta.sacar(valorAsacar);
        contas.put(numeroDaConta,conta);
        return conta.getSaldo();
    }

    public Map<String, Conta> getContas() {
        return contas;
    }

    public void debitarTarifa(){
        contas.values().forEach(conta -> conta.sacar(3.50));
    }
}
