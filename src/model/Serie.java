package model;

import java.time.Duration;

public class Serie extends Titulo{
    private int seasons;
    private int episodes;
    private String status;
    private int episodesForseason;
    private Duration duration;

    public int getSeasons() { return seasons; }
    public void setSeasons(int seasons) { this.seasons = seasons; }
    public int getEpisodes() { return episodes; }
    public void setEpisodes(int episodes) { this.episodes = episodes; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public int getEpisodesForseason() { return episodesForseason; }
    public void setEpisodesForseason(int episodesForseason) { this.episodesForseason = episodesForseason; }
    public Duration getDuration() { return duration; }
    public void setDuration(Duration duration) { this.duration = duration; }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Número de temporadas: " + seasons);
        System.out.println("Número de episódios: " + episodes);
        System.out.println("Status: " + status);
        System.out.println("Duração média dos episódios: " + duration.toMinutes() + " minutos");
    }
}
