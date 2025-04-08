package calculadora;

public class Recomendacao {

    public void recomendar(Classificavel classificavel) {
        if (classificavel.getClassificacao() > 0) {
            System.out.println("Recomendado!");
        } else {
            System.out.println("Não recomendado.");
        }
    }
}
