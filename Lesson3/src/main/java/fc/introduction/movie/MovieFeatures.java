package fc.introduction.movie;

public class MovieFeatures {

    private String title;
    private String nameAndSurnameDirector;
    private int duration;
    private int productionYear;

    public MovieFeatures(String title, String nameAndSurnameDirector, int duration, int productionYear) {
        this.title = title;
        this.nameAndSurnameDirector = nameAndSurnameDirector;
        this.duration = duration;
        this.productionYear = productionYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameAndSurnameDirector() {
        return nameAndSurnameDirector;
    }

    public void setNameAndSurnameDirector(String nameAndSurnameDirector) {
        this.nameAndSurnameDirector = nameAndSurnameDirector;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "MovieFeatures{" +
                "title='" + title + '\'' +
                ", nameAndSurnameDirector='" + nameAndSurnameDirector + '\'' +
                ", duration=" + duration +
                ", productionYear=" + productionYear +
                '}';
    }
}
