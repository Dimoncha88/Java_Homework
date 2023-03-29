package Homework1.task1;
public class MainClassFromTask1 {
    //    1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
    public static void main(String[] args) {
        findMinMaxElInArrow();
    }

    private static void findMinMaxElInArrow() {
        int[] arr = new int[]{25, 2, 54, 42, 21};
        int maxNumber = arr[0];
        int minNumber = arr[1];
        int maxEl = 0;
        int minEl = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
                maxEl = i;
            } else if (arr[i] <= minNumber) {
                minNumber = arr[i];
                minEl = i;
            }
        }
        System.out.printf("Максимальный элемент в массиве %d\n", maxEl);
        System.out.printf("Минимальный элемент в массиве %d", minEl);
    }
}
