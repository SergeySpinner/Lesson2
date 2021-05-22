package Lesson2;

public class ConsoleWriter implements Writer {
    @Override
    public void write(String value) {
        System.out.println(value);
    }
}
