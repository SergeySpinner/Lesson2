package Lesson2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String Sentence = "I like walking in the park", Word = "in";

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();

        Scanner reader = new Scanner(System.in);

        System.out.println("What task do you want to perform?" +
                "\n1) Task 1\n2) Task 2\n3) Task 3");

        switch (reader.nextInt()) {
            case 1: {
                System.out.println("You want to print the results or write in the file?" +
                        "\n1) Print\n2) Write in the file");
                if (reader.nextInt() == 1)
                    System.out.println(task1.execute(Sentence, Word));
                else
                    task1.write(String.valueOf(task1.execute(Sentence, Word)));
            }
            break;
            case 2: {
                System.out.println("You want to print the results or write in the file?" +
                        "\n1) Print\n2) Write in the file");
                if (reader.nextInt() == 1)
                    System.out.println(task2.execute(Sentence, Word));
                else
                    task1.write(String.valueOf(task2.execute(Sentence, Word)));
            }
            break;
            case 3: {
                System.out.println("You want to print the results or write in the file?" +
                        "\n1) Print\n2) Write in the file");
                if (reader.nextInt() == 1)
                    System.out.println(task3.execute(Sentence, Word));
                else
                    task1.write(String.valueOf(task3.execute(Sentence, Word)));
            }
        }
    }
}
