package fc.introduction.taskFirst;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    public void writeToFileWatchIt(String pathToFile, String text) {
        try {
            Files.writeString(Paths.get(pathToFile), text);
            System.out.println(text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
