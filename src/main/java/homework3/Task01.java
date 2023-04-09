package homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        /*1. Пусть дан произвольный список целых чисел,
        удалить из него четные числа (в языке уже есть что-то готовое для этого)*/
        deleteEvenNums();
    }

    private static void deleteEvenNums() {
        List<Integer> lst = new ArrayList<>();
        int length = 6;
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            lst.add(random.nextInt(1,11));
        }

        System.out.println(lst);
        lst.removeIf(i ->(i%2==0));
        System.out.println(lst);
    }
}
