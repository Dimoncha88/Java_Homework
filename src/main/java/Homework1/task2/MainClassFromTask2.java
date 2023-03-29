package Homework1.task2;

import java.util.Arrays;

public class MainClassFromTask2 {
    /*2. Дан массив nums = [3,2,2,3] и число val = 3.
    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    Таким образом, первые несколько (или все) элементов массива должны быть отличны
    от заданного, а остальные - равны ему.*/
    public static void main(String[] args) {
        MoveElToEnd();
    }
    private static void MoveElToEnd() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] resArr = moveElToEnd(nums, val);
        System.out.println(Arrays.toString(resArr));
    }
    private static int[] moveElToEnd(int[] arr, int value) {
        int leftEl = 0;
        int rightEl = arr.length - 1;
        int item;
        while (leftEl < rightEl) {
            if (arr[rightEl] == value) {
                rightEl--;
            }
            if (arr[leftEl] == value) {
                item = arr[leftEl];
                arr[leftEl] = arr[rightEl];
                arr[rightEl] = item;
            }
            leftEl++;
        }
        return arr;
    }
}
