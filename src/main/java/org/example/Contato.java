package org.example;


public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void atualizarTelefone(String novoTelefone){
        this.telefone = novoTelefone;
    }

    public String obterContatoFormatado(){
        return "Nome: " + nome + " - Telefone: " + telefone;
    }

}
