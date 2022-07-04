package fc.introduction.taskFour;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\krzys\\Desktop\\futurecollars\\Lesson6\\src\\main\\java\\fc\\" +
                "introduction\\taskFour\\data.txt");

        WordToFind result = new WordToFind();

        result.searchingForTheEnteredWordInTheText(file.getPath(), """
                Kurs
                Java
                Lekcja 6
                Pliki
                Wyjątki
                Pliki
                Koniec pliku""","Java");
    }
}
