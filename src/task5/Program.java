package task5;

import java.util.Arrays;

/**
 * Написать метод, осуществляющий сортировку одномерного
 * массива подсчётом. Важное ограничение состоит в том, что для этой
 * сортировки диапазон значений исходного массива должен находиться в
 * разумных пределах, например, не более 1000.
 */

public class Program {
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 10, -3, 2, 6, 10, 11, 15, 20};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Отсортированный массив: " + Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr){
        int[] sortedArr = new int[arr.length];

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }

        int[] cont = new int[max - min + 1];
        Arrays.fill(cont, 0);

        for (int i = 0; i < arr.length; i++) {
            cont[arr[i] - min]++;
        }
        int j = 0;
        for (int i = 0; i < cont.length; i++) {
            if(cont[i] > 0){
                for (int k = 0; k < cont[i]; k++) {
                    sortedArr[j] = i + min;
                    j++;
                }
            }
        }

        return sortedArr;
    }
}
