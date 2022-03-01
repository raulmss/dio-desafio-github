package com.company;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    protected List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void addConta(Conta conta){
        contas.add(conta);
        System.out.println("Conta numero" + conta.numero + "adicionada com Sucesso!");
    }
    
    public void listContas(){
        System.out.println("****** Listando todas as contas do Banco ******");
        for (Conta conta:contas) {
            conta.imprimirExtrato();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
