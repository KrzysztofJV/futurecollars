package fc.introduction.movie;

public class Movie {

    public static void main(String[] args) {
        MovieFeatures movieFeatures = new MovieFeatures("Pirates of the Caribbean: At World’s End",
                "Gore Verbinski",120,2003);

        System.out.println(movieFeatures.toString());
    }
}
