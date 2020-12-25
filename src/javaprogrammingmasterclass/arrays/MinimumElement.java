package javaprogrammingmasterclass.arrays;

import java.util.Scanner;

public class MinimumElement {
    // write code here
    private  Scanner scanner = new Scanner(System.in);

     public int readInteger(){
        int userInput = scanner.nextInt();
        return userInput;
    }

     public int[] readElements(int count){
        int[] arr = new int [count];
        int temp = 0;
        while(count > 0){
            arr[temp] = scanner.nextInt();
            temp++;
            count--;
        }
        return arr;
    }

     public int findMin(int[] arr){
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}