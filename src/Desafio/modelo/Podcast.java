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
