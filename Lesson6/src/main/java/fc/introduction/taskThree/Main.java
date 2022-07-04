package fc.introduction.taskThree;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\krzys\\Desktop\\futurecollars\\Lesson6\\src\\main\\java\\fc\\" +
                "introduction\\taskThree\\data.txt");

        Counter counter = new Counter();

        counter.countsTheNumberOfCharactersOfTheTextEnteredIntoTheFile(file.getPath(), """
                Kurs
                Java
                Lekcja 6
                Pliki
                Wyjątki
                Pliki
                Koniec pliku""");
    }
}
