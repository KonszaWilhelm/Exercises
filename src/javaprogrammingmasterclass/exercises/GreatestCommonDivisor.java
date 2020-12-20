package javaprogrammingmasterclass.exercises;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;
        for (int i = first; i > 0; i--) {
            if (first % i == 0 && second % i == 0 && first % i == second % i){
                return i;
            }
        }return -1;
    }
}
