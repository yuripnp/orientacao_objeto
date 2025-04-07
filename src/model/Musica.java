package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Musica {
    private String genero;
    private Double avaliacao = 0.0;
    private String artista;
    private LocalDate anoLancamento;
    private String titulo;
    private Double numeroAvaliacoes = 0.0;
    private Double somaAvaliacoes = 0.0;

    public void exibirFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
    }

    public void avaliar(Double nota) {
        if (nota >= 0 && nota <= 10) {
            somaAvaliacoes += nota;
            numeroAvaliacoes++;
            BigDecimal bd = new BigDecimal(somaAvaliacoes / numeroAvaliacoes);
            bd = bd.setScale(1, BigDecimal.ROUND_HALF_UP);
            avaliacao = bd.doubleValue();
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
        }
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public LocalDate getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(LocalDate anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



}
