package fc.introduction.taskTwo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\krzys\\Desktop\\futurecollars\\Lesson6\\src\\main\\java\\fc\\" +
                "introduction\\taskTwo\\data.txt");

        writeToFile(file.getPath(), "Kurs\n" +
                "Java\n" +
                "Lekcja 6\n" +
                "Pliki\n" +
                "Wyjątki\n" +
                "Pliki\n" +
                "Koniec pliku");

        EverySecondLine everySecondLine = new EverySecondLine();
        everySecondLine.printTheEverySecondLineInTheFile(file);
    }

    public static void writeToFile(String pathToFile, String text) {
        try {
            Files.writeString(Paths.get(pathToFile), text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

