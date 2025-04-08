package model;

import calculadora.Classificavel;

public class Episode implements Classificavel {
    private String title;
    private int season;
    private int episodeNumber;
    private Serie serie;
    private int totalViews;


    public String getTitle() {
        return title;
    }

    public int getSeason() {
        return season;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public Serie getSerie() {
        return serie;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setSeason(int season) {
        this.season = season;
    }
    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    public int getTotalViews() {
        return totalViews;
    }
    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getClassificacao() {
        if (this.totalViews > 1000) {
            return 4;
        }
        return 0;
    }
}
