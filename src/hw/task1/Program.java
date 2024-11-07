package hw.task1;

import java.util.Arrays;

public class Program {
    /**
     * Написать метод, возвращающий количество чётных элементов массива.
     * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
     */

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 4};
        int[] arr2 = {2, 2, 0};
        int[] arr3 = {1, 3, 5};

        System.out.println("countEvens(" + Arrays.toString(arr1) + ") -> " + countEvens(arr1));
        System.out.println("countEvens(" + Arrays.toString(arr2) + ") -> " + countEvens(arr2));
        System.out.println("countEvens(" + Arrays.toString(arr3) + ") -> " + countEvens(arr3));
    }

    public static int countEvens(int[] arr){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0)
                num++;
        }
        return num;
    }
}
