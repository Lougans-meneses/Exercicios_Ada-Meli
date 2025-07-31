package org.example;

public class ContaEspecial extends ContaBancaria{

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo, limite);
    }

    @Override
    public boolean sacar(double valor) {
        double saldoDisponivel = getSaldo() + getLimite();
        if (valor <= saldoDisponivel) {
            alterarSaldo(getSaldo() - valor);
            System.out.println("Saque especial de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saque de R$" + valor + " não realizado. Valor excede o limite.");
            return false;
        }
    }
}
