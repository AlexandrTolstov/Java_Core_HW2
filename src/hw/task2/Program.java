package hw.task2;

import java.util.Arrays;

/**
 * Написать функцию, возвращающую разницу между самым большим
 * и самым ма- леньким элементами переданного не пустого массива.
 */

public class Program {
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 10, -3, 2, 6, 10, 11, 15, 20};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Разница между самым маленьким и большим элементом: " + diffMaxMin(arr));
    }
    public static int diffMaxMin(int[] arr){
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

        return max - min;
    }
}
