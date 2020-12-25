package javaprogrammingmasterclass.arrays;

import java.util.Scanner;

public class Arrays {
    private int[] intArr;
    Scanner scanner;

    public Arrays() {
        this.scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you would like to add:");
        int arrayLength = scanner.nextInt();
        this.intArr = scanNumbers(arrayLength);
    }

    private int[] scanNumbers(int arrLength) {

        int[] intArr = new int[arrLength];
        int counter = 0;
        System.out.println("Enter your numbers: ");
        while (arrLength > 0) {
            intArr[counter] = scanner.nextInt();
            counter++;
            arrLength--;
        }
        return intArr;
    }

    public double getAverage() {
        double average = 0;
        int sum = 0;
        int arrLength = this.intArr.length;
        for (int i = 0; i < arrLength; i++) {
            sum += this.intArr[i];
            average = (double) sum / arrLength;
        }

        return average;
    }

    public int[] sortArray() {
        int[] sortArray = this.intArr.clone();
        int temp;
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = i + 1; j < sortArray.length; j++) {
                if (sortArray[i] > sortArray[j]) {
                    temp = sortArray[i];
                    sortArray[i] = sortArray[j];
                    sortArray[j] = temp;
                }

            }
        }

        return sortArray;
    }

    public int[] getIntArr() {
        return intArr;
    }
}

