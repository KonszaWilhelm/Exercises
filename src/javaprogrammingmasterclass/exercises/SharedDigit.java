package javaprogrammingmasterclass.exercises;

public class SharedDigit {
    public static boolean hasSharedDigit(int numOne, int numTwo) {
        if (numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99) {
            return false;
        }
        if (numOne % 10 == numTwo % 10 || numOne / 10 % 10 == numTwo % 10 || numTwo / 10 % 10 == numOne % 10 || numTwo / 10 % 10 == numOne / 10 % 10)
            return true;
        else
            return false;
    }
}
