package hw.task3;

import java.util.Arrays;

/**
 * Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
 */

public class Program {
    public static void main(String[] args) {
        int[] arr1 = {2, 6, 9, 10, -3, 2, 0, 0, 11, 15, 20};
        int[] arr2 = {2, 6, 9, 10, -3, 2, 6, 10, 11, 15, 20};

        System.out.println("Какие-то из соседних элементов в массиве равны 0: " + Arrays.toString(arr1) + " -> " + ifNeighborZero(arr1));
        System.out.println("Какие-то из соседних элементов в массиве равны 0: " + Arrays.toString(arr2) + " -> " + ifNeighborZero(arr2));
    }

    public static boolean ifNeighborZero(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 0 && arr[i+1] == 0)
                return true;
        }
        return false;
    }
}
