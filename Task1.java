package Lesson2;

import java.io.FileWriter;
import java.io.IOException;

public class Task1 implements StringWorker, Writer {
    @Override
    public void write(String value) throws IOException {
        FileWriter Temp = new FileWriter("Task1.txt");
        Temp.write("Result of working Task 1: " + value);
        Temp.close();
    }

    @Override
    public int execute(String sentence, String word) {
        int Index = 1;
        String[] Temp = sentence.split(" ");
        for (String f : Temp) {
            if (f.equals(word))
                break;
            else
                Index++;
        }
        return Index;
    }
}
