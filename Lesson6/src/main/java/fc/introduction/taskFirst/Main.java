package fc.introduction.taskFirst;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\krzys\\Desktop\\futurecollars\\Lesson6\\src\\main\\java\\fc\\introduction\\taskFirst\\data.txt");

        FileReader fileReader = new FileReader();
        fileReader.writeToFileWatchIt(file.getPath(), """
                Kurs
                Java
                Lekcja 6
                Pliki
                Wyjątki
                Pliki
                Koniec pliku""");
    }
}

