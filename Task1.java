package Lesson2;

public class Task1 implements StringWorker {

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
