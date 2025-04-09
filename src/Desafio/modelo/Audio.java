package Desafio.modelo;

import java.time.Duration;

public class Audio {
    private String title;
    private Duration duration;
    private int TotalReproductions;
    private int likes;
    private String genre;
    private int recomendation;

    public void curtir() {
        likes++;
    }
    public void reproduzir() {
        TotalReproductions++;
    }

    public int getRecomendation() {
        return recomendation;
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getLikes() {
        return likes;
    }

    public int getTotalReproductions() {
        return TotalReproductions;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
