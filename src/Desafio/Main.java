package Desafio;

import Desafio.modelo.MinhasPreferidas;
import Desafio.modelo.Music;
import Desafio.modelo.Podcast;

public class Main {
    public static void main(String[] args) {
        Music music = new Music("Song Title", "Artist Name", "Album Name", "Release Date");
        music.setGenre("Pop");
        for (int i = 0; i < 10; i++) {
            music.reproduzir();
        }
        for (int i = 0; i < 3; i++) {
            music.curtir();
        }

        Podcast podcast = new Podcast("Podcast Title", "Host Name", "Guest Name", "Podcast Description");
        podcast.setGenre("Technology");
        for (int i = 0; i < 5; i++) {
            podcast.reproduzir();
        }
        for (int i = 0; i < 2; i++) {
            podcast.curtir();
        }
        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.incluir(music);
        minhasPreferidas.incluir(podcast);
    }
}
