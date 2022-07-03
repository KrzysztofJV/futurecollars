package fc.introduction.taskTwo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EverySecondLine {

    public void printTheEverySecondLineInTheFile(File file) {
        int lineNumber = 0;
        String line = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    if ((line = bufferedReader.readLine()) == null) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (lineNumber % 2 == 0) {
                    System.out.println(line);
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
