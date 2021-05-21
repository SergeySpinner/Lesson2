package Lesson2;

import java.io.FileWriter;
import java.io.IOException;

public class Task3 implements StringWorker, Writer {
    @Override
    public int execute(String sentence, String word) {
        int Index = 0;
        String[] Temp = sentence.split(word);
        for (String f : Temp)
            Index += f.length();

        return Index;
    }

    @Override
    public void write(String value) throws IOException {
        FileWriter Temp = new FileWriter("Task3.txt");
        Temp.write("Result of working Task 3: " + value);
        Temp.close();
    }
}
