package exercicio08;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private int idade;
    private String matricula;
    private String curso;
    private List<Double> notas;

    public Aluno(String nome, int idade, String matricula, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            notas.add(nota);
            System.out.println("Nota adicionada com sucesso.");
        } else {
            System.out.println("Nota inválida. Digite um valor entre 0 e 10.");
        }
    }

    public double calcularMedia() {

        if (notas.isEmpty()) {
            return 0;
        }

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }

    public boolean verificarAprovacao() {
        return calcularMedia() >= 7.0;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public List<Double> getNotas() {
        return new ArrayList<>(notas);
    }
}