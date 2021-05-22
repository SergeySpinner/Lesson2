package Lesson2;

import java.io.IOException;

public class FileWriter implements Writer{

    @Override
    public void write(String value) throws IOException {
        java.io.FileWriter Temp = new java.io.FileWriter("Task1.txt");
        Temp.write("Result of working Task 1: " + value);
        Temp.close();
    }
}
