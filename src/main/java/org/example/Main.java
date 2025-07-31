package org.example;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("João", "99999-9999");
        Contato contato2 = new Contato("Maria", "88888-8888");

        contato1.atualizarTelefone("97777-7777");

        System.out.println(contato1.obterContatoFormatado());
        System.out.println(contato2.obterContatoFormatado());
    }
}