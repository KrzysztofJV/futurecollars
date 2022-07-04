package fc.introduction.taskFive;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\krzys\\Desktop\\futurecollars\\Lesson6\\src\\main\\java\\fc\\" +
                "introduction\\taskFive\\data.txt");

        InvertedText invertedText = new InvertedText();

        invertedText.printInvertedEnteredTextIntoTheFile(file.getPath(), """
                Kurs
                Java
                Lekcja 6
                Pliki
                Wyjątki
                Pliki
                Koniec pliku""");
    }
}
