package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Usando o construtor completo
        Aluno aluno1 = new Aluno("Ana Silva", "2025001", "Engenharia");

        // Usando o construtor com nome e curso
        Aluno aluno2 = new Aluno("Carlos Souza", "Direito");

        aluno1.exibirDados();
        aluno2.exibirDados();
    }
}