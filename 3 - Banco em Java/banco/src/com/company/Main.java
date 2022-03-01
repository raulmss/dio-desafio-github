package com.company;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco(); // Novo banco
        Cliente cliente = new Cliente("Raul"); //Novo Cliente

        //Novas contas criadas
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);
        //Adição das contas na lista do banco
        banco.addConta(cc);
        banco.addConta(poupanca);
        //Impressão de informações
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        //Lista as contas
        banco.listContas();
    }
}
