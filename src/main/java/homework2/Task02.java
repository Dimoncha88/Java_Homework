package homework2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task02 {
    public static void main(String[] args) {
        /*2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
        и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.*/

        MakeAndWriteToFile();
    }

    private static void MakeAndWriteToFile() {
        String input = "TEST ";
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(input.repeat(100)));

        try (PrintWriter pw = new PrintWriter("src/main/java/homework2/Test.txt");) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

