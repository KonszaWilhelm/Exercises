package javaprogrammingmasterclass.arrays;


import java.util.Arrays;

public class ReverseArray {
    // write code here
    public static void reverse(int[] arr) {

        int maxIndex = arr.length - 1;
        int temp;
        System.out.println("Array = " + Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2 ; i++) {
            temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;


        }
        System.out.println("Array = " + Arrays.toString(arr));

    }
}
