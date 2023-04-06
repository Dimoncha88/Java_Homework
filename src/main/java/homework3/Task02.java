package homework3;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        /*2. Задан целочисленный список ArrayList. Найти минимальное, максимальное
        и среднее арифметическое из этого списка.*/
        findMinMaxArithMean();
    }

    private static void findMinMaxArithMean() {
        List<Integer> lst = new ArrayList<>();
        int lenght = 6;
        Random random = new Random();
        for (int i = 0; i < lenght; i++) {
            lst.add(random.nextInt(1,10));
        }

        System.out.println(lst);

        System.out.println("Минимальное значение = " + Collections.min(lst));
        System.out.println("Максимальное значение = " + Collections.max(lst));

        Integer[] arr = lst.toArray(new Integer[lst.size()]);
        System.out.println("Среднее арифметическое значение = " + (Arrays.stream(arr)
                .mapToDouble(Integer::intValue)
                .sum()) / arr.length);
    }
}
