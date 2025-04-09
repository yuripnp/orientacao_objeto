package Desafio.modelo;

public class Podcast extends Audio {
    private String host;
    private String guest;
    private String description;

    public Podcast(String title, String host, String guest, String description) {
        super.setTitle(title);
        this.host = host;
        this.guest = guest;
        this.description = description;
    }

    @Override
    public int getRecomendation() {
        if(this.getLikes() > 5) {
            return 5;
        } else if (this.getLikes() > 3) {
            return 3;
        } else if (this.getLikes() > 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
