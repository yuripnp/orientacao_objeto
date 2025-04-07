import model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Pessoa pessoa = new Pessoa();
        Musica musica = new Musica();
        Calculadora calculadora = new Calculadora();
        Carro carro = new Carro();
        Produto produto = new Produto();
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(10.0);
        notas.add(8.0);
        notas.add(9.0);
        Aluno aluno = new Aluno("Lucas", notas);
        System.out.println(aluno.mediaAluno());



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
