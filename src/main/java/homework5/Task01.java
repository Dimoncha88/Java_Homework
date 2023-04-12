package homework5;

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        /*1. Реализуйте структуру телефонной книги с помощью HashMap,
        учитывая, что 1 человек может иметь несколько телефонов.*/

        phoneBook();
    }

    private static void phoneBook() {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("9111232323", "Иванов");
        phoneBook.put("9111232324", "Петров");
        phoneBook.put("9111232325", "Сидоров");
        phoneBook.put("9111232326", "Иванов");

        phoneBook.forEach((key, value) -> System.out.printf("%s\t%s%n", key, value));
    }
}
