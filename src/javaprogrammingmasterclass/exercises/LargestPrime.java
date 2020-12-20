package javaprogrammingmasterclass.exercises;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        int largestPrimeFactor = 0;
        int counter = 0;
        if (number <= 1) {
            return -1;
        } else if (number == 2) {
            return 2;
        } else {
            for (int i = 2; i <= number; i ++) { // loops through factors of num
                if (number % i == 0) {

                    for (int j = 2; j <= i; j++) { //checks if factor is prime or not

                        if (i % j == 0) {
                            counter++;
                        }
                    }
                    if (counter == 1)
                        if (largestPrimeFactor < i) {
                            largestPrimeFactor = i;

                        }

                }
                counter = 0;
            }

        }
        return largestPrimeFactor;
    }
}
