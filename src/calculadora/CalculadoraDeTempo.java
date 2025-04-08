package calculadora;

import model.Titulo;

import java.time.Duration;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public Duration calcularTempoTotal(int temporadas, int episodios, Titulo titulo) {
        int totalEpisodios = temporadas * episodios;
        tempoTotal = (int) (totalEpisodios * titulo.getDuration().toMinutes());
        return Duration.ofMinutes(tempoTotal);
    }

    // Método para calcular o tempo total de um filme sobrecarga e polimofismo
    public Duration calcularTempoTotal(Titulo titulo) {
        return titulo.getDuration();
    }
}
