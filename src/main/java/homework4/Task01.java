package homework4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*1. Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.*/

        acceptAndSaveStrings();
    }

    private static void acceptAndSaveStrings() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> input = new LinkedList<>();
        while (true) {
            System.out.printf("Введите строку:");
            String text = in.nextLine();
            String[] array = new String[]{text};
            input.add(text);
            System.out.println(input);

            if (text.equals("print")) {
                input.removeLast();
                input.addFirst(input.pollLast());
                input.offer(input.get(1));
                input.remove(input.get(1));
            }

            if (text.equals("revert")) {
                input.removeLast();
                input.removeLast();
            }
            System.out.println(input);
        }
    }
}
