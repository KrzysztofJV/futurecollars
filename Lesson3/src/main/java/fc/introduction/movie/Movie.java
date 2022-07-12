package fc.introduction.movie;

public class Movie {

    private String title;
    private String directorNameAndSurname;
    private int movieDuration;
    private int yearProduction;

    public Movie(String title, String directorNameAndSurname, int movieDuration, int yearProduction) {
        this.title = title;
        this.directorNameAndSurname = directorNameAndSurname;
        this.movieDuration = movieDuration;
        this.yearProduction = yearProduction;
    }

    @Override
    public String toString() {
        return "MovieFeatures{" +
                "title='" + title + '\'' +
                ", nameAndSurnameDirector='" + directorNameAndSurname + '\'' +
                ", duration=" + movieDuration +
                ", productionYear=" + yearProduction +
                '}';
    }
}
