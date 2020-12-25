package exercises;

public class ClosestTempToZero {
    static void closetTempToZero() {
        int[] arr = {-1, -5, 6, 8, 1, 3, -1};
        int current = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            current = arr[i] * arr[i];
            if (current < min * min) {
                min = arr[i];
            }
            if (current == min * min && arr[i] > 0) {
                min = arr[i];
            }

        }
        System.out.println(min);
    }
}
