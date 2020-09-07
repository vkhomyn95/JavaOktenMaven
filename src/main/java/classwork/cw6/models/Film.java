package classwork.cw6.models;

public class Film {
    private int film_id;
    private String title;
    private String description;
    private int year;
    private int language_id;

    public Film() {
    }

    public Film(int film_id, String title, String description, int year, int language_id) {
        this.film_id = film_id;
        this.title = title;
        this.description = description;
        this.year = year;
        this.language_id = language_id;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    @Override
    public String toString() {
        return "Film{" +
                "film_id=" + film_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", language_id=" + language_id +
                '}';
    }
}
