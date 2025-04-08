package Desafio.modelo;

public class Music extends Audio {
    private String artist;
    private String album;
    private String releaseDate;

    public Music(String title, String artist, String album, String releaseDate) {
        super.setTitle(title);
        this.artist = artist;
        this.album = album;
        this.releaseDate = releaseDate;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
