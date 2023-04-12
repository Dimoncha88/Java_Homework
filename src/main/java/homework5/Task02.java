package homework5;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        /*2. Пусть дан список сотрудников:
         *
         * Написать программу, которая найдёт и выведет повторяющиеся
         * имена с количеством повторений. Отсортировать по убыванию популярности.*/

        findAndCountDuplicateNames();
    }

    private static void findAndCountDuplicateNames() {
        Map<String, String> workersList = new HashMap<>();
        workersList.put("Иванов", "Иван");
        workersList.put("Петрова", "Светлана");
        workersList.put("Белова", "Кристина");
        workersList.put("Мусина", "Анна");
        workersList.put("Крутова", "Анна");
        workersList.put("Юрин", "Иван");
        workersList.put("Лыков", "Петр");
        workersList.put("Чернов", "Павел");
        workersList.put("Чернышов", "Петр");
        workersList.put("Федорова", "Мария");
        workersList.put("Светлова", "Марина");
        workersList.put("Савина", "Мария");
        workersList.put("Рыкова", "Мария");
        workersList.put("Лугова", "Марина");
        workersList.put("Владимирова", "Анна");
        workersList.put("Мечников", "Иван");
        workersList.put("Петин", "Петр");
        workersList.put("Ежов", "Иван");

        List<String> names = new ArrayList<>(workersList.values());
        System.out.println(names);
        Map<String, Integer> countNames = new HashMap<>();
        List<String> duplicates = new ArrayList<>();
        names.forEach(n -> {
            if (countNames.containsKey(n)) {
                countNames.put(n, countNames.get(n) + 1);
            } else {
                countNames.put(n, 1);
            }
        });
        countNames.keySet().forEach(k -> {
            if (countNames.get(k) > 1) {
                duplicates.add(k);
            }
        });
        System.out.println(countNames);
    }
}
