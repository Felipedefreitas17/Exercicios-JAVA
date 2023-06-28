package com.senac.novobanco;

public class Teste {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("059","90000");
        contaCorrente.setChequeEspecial(5000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("059","70000");

        Banco banco = new Banco();

        banco.cadastrarConta(contaCorrente);
        banco.cadastrarConta(contaPoupanca);

        banco.depositar("90000",10000);
        banco.depositar("70000",50000);

        banco.getContas().values().forEach(conta -> System.out.println(conta.toString()));

        banco.sacar("90000",14000);
        banco.sacar("70000",60000);
//        contas após o saque
//      dentro do for each, expressão lambda
        System.out.println("Contas pós saque");
        banco.getContas().values().forEach(conta -> System.out.println(conta.toString()));

        banco.debitarTarifa();

//        contas após as tarifas
        System.out.println("Contas pós tarifas");
        banco.getContas().values().forEach(conta -> System.out.println(conta.toString()));

    }
}
