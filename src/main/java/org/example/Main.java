package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(113, 2000, 5000);
        ContaEspecial c2 = new ContaEspecial(225, 1500, 2500);

        System.out.println("=== Conta Bancária ===");
        c1.sacar(1500);
        c1.depositar(500);
        c1.consultarSaldo();

        System.out.println("\n=== Conta Especial ===");
        c2.sacar(4000);
    }
}