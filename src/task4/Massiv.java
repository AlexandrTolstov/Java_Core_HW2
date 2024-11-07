package task4;

public class Massiv {
    private int[] array;

    public int[] addElement(int[] arr, int num){
        array = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        array[arr.length] = num;
        return array;
    }

    public int[] addElement(int[] arr, int num, int pos){
        array = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            array[i] = arr[i];
        }
        array[pos] = num;
        for (int i = pos + 1; i < array.length; i++) {
            array[i] = arr[i - 1];
        }
        return array;
    }
}
