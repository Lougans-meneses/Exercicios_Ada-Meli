package org.example;

public class ContaBancaria {
    private int numero;
    private double saldo;
    private double limite;

    public ContaBancaria(int numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saque de R$" + valor + " não realizado. Saldo insuficiente.");
            return false;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void alterarSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }
}
