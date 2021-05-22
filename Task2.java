package Lesson2;

public class Task2 implements StringWorker {
    @Override
    public int execute(String sentence, String word) {
        int Index = 0;
        String[] Temp = sentence.split(" ");
        for (String f : Temp)
            if (f.equals(word))
                Index++;
        return Index;
    }
}
