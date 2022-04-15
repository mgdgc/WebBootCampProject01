package xyz.ridsoft.theater.vo;

public class MovieVO {

    public String movie_id;
    public String movie_name;
    public String director;
    public String type;
    public String moviecol;

    public MovieVO(String movie_id, String movie_name, String director, String type, String moviecol) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.director = director;
        this.type = type;
        this.moviecol = moviecol;
    }

    public MovieVO(String movie_name, String director, String type) {
        this(null, movie_name, director, type, null);
    }

    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMoviecol() {
        return moviecol;
    }

    public void setMoviecol(String moviecol) {
        this.moviecol = moviecol;
    }
}
