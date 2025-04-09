package Desafio.modelo;

public class MinhasPreferidas {

    public void incluir(Audio audio) {
        if(audio.getRecomendation() > 0) {
            System.out.println("Adicionando " + audio.getTitle() + " à lista de preferidos.");
        } else {
            System.out.println("O áudio " + audio.getTitle() + " não é recomendado.");
        }
    }
}
