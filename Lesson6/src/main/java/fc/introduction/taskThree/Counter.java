package fc.introduction.taskThree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Counter {

    public void countsTheNumberOfCharactersOfTheTextEnteredIntoTheFile(String pathToFile, String text) {
        try {
            Files.writeString(Paths.get(pathToFile), text);
            System.out.println(text);
            System.out.println();
            System.out.println("The number of characters of this text is: " + text.length());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
