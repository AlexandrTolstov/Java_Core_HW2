package task4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        /**
         * Написать функцию добавления элемента в конец массива таким
         * образом, чтобы она расширяла массив при необходимости.
         */

        int[] array = {1, 5, 6, 5, 8};
        Massiv mass = new Massiv();

        System.out.println(Arrays.toString(mass.addElement(array, 9)));
        System.out.println(Arrays.toString(mass.addElement(array, 9, 3)));
    }
}
