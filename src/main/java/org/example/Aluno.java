package org.example;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = "Não informado";
    }

    public void exibirDados(){
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("Matricula do aluno: " + this.matricula);
        System.out.println("Curso do aluno: " + this.curso);
        System.out.println("---------------------");

    }
}
