package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas;

    public Aluno(String nome, ArrayList<Double> notas) {
        this.nome = nome;
        this.notas = notas;
    }
    public Double mediaAluno() {
        Double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Double> getNotas() {
        return notas;
    }
    public void setNota(Double nota) {
        this.notas.add(nota);
    }
}
