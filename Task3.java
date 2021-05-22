package Lesson2;

public class Task3 implements StringWorker {
    @Override
    public int execute(String sentence, String word) {
        int Index = 0;
        String[] Temp = sentence.split(word);
        for (String f : Temp)
            Index += f.length();

        return Index;
    }
}
