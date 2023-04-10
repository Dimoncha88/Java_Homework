package homework4;

import java.util.LinkedList;

public class Task02 {
    public static void main(String[] args) {
        /*2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
         который вернет “перевернутый” список.*/

        reverseList();
    }

    private static void reverseList() {
        LinkedList<String> input = new LinkedList<>();
        input.add("1");
        input.add("2");
        input.add("3");
        input.add("4");
        input.add("5");
        System.out.println(input);

        LinkedList<String> reverse = new LinkedList<>();
        for (int i = input.size()-1; i >= 0; i--) {
            reverse.add(input.get(i));
        }
        System.out.println(reverse);
    }
}
