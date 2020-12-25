package javaprogrammingmasterclass.exercises;

public class NumberPalindrome {
    public static boolean isPalindrome (int number){
        int initialVal = number;
        int num = 0;
        while(number != 0){
            num += number % 10;
            num *= 10;
            number /= 10;
        }
        if (num / 10 == initialVal)
            return true;

        return false;
    }
}
