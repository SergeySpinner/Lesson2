package Lesson2;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 implements StringWorker, Writer {
    @Override
    public int execute(String sentence, String word) {
        int Index = 0;
        String[] Temp = sentence.split(" ");
        for (String f : Temp)
            if (f.equals(word))
                Index++;
        return Index;
    }

    @Override
    public void write(String value) throws IOException {
        FileWriter Temp = new FileWriter("Task2.txt");
        Temp.write("Result of working Task 2: " + value);
        Temp.close();
    }
}
