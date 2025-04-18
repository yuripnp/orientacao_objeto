import calculadora.CalculadoraDeTempo;
import calculadora.Classificavel;
import calculadora.Recomendacao;
import model.*;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Pessoa pessoa = new Pessoa();
        Musica musica = new Musica();
        Serie serie = new Serie();
        serie.setSeasons(5);
        serie.setEpisodes(50);
        serie.setStatus("Finalizada");
        serie.setEpisodesForseason(10);
        serie.setDuration(Duration.ofMinutes(45));
        serie.setTitle("Breaking Bad");
        serie.setReleaseYear(2008);
        serie.setGenre("Drama");
        serie.exibir();

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        Duration tempoTotal = calculadoraDeTempo.calcularTempoTotal(serie.getSeasons(), serie.getEpisodes(), serie);
        System.out.println("Tempo total da série: " + tempoTotal.toHours() + " horas");
        Calculadora calculadora = new Calculadora();
        Carro carro = new Carro();
        Produto produto = new Produto();
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(10.0);
        notas.add(8.0);
        notas.add(9.0);
        Aluno aluno = new Aluno("Lucas", notas);
        System.out.println(aluno.mediaAluno());
        Recomendacao recomendacao = new Recomendacao();

        Episode episode = new Episode();
        episode.setTitle("Pilot");
        episode.setSeason(1);
        episode.setEpisodeNumber(1);
        episode.setSerie(serie);
        episode.setTotalViews(1500);
        System.out.println("Classificação do episódio: " + episode.getClassificacao());
        recomendacao.recomendar(episode);





        produto.setCategoria("Eletrônicos");
        produto.setNome("Smartphone");
        produto.setPreco(1500.00);
        System.out.println(produto.calcularDesconto(new BigDecimal(10)));

        carro.setAnoFabricacao(2000);
        carro.modelo = "Fusca";
        carro.setCor("azul");
        carro.anosCarro();

        musica.setTitulo("Bohemian Rhapsody");
        musica.setArtista("Queen");
        musica.setGenero("Rock");
        musica.setAnoLancamento(LocalDate.of(1975, 10, 31));
        musica.avaliar(9.0);
        musica.avaliar(7.5);
        musica.avaliar(10.0);
        musica.exibirFicha();

        calculadora.dobro(34.0);

        pessoa.exibirMensagem();
    }
}
