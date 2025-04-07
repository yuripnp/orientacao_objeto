package model;

public class Movie {
    private String title;
    private boolean includedPlain;
    private int releaseYear;
    private String genre;
    private Double rating;
    private Double ratingSum;
    private Double totalRatings;


    public void exibir() {
        System.out.println("Título: " + title);
        System.out.println("Ano de Lançamento: " + releaseYear);
        System.out.println("Gênero: " + genre);
        System.out.println("Avaliação: " + rating);
    }

    public void avalia(Double nota) {
        if (nota >= 0 && nota <= 10) {
            ratingSum += nota;
            totalRatings++;
            rating = ratingSum / totalRatings;
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
        }
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isIncludedPlain() {
        return includedPlain;
    }
    public void setIncludedPlain(boolean includedPlain) {
        this.includedPlain = includedPlain;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Double getRating() {
        return rating;
    }
    public Double getRatingSum() {
        return ratingSum;
    }
    public Double getTotalRatings() {
        return totalRatings;
    }

}
