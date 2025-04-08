package model;

import calculadora.Classificavel;

import java.time.Duration;

public class Movie extends Titulo implements Classificavel {

    @Override
    public int getClassificacao() {
        return 0;
    }
}
