package javaprogrammingmasterclass.exercises;

public class Prime {
    public static boolean isPrime(int num) {
        if (num == 1 || num == 0) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void challenge() {
        int primesFound = 0;
        for (int i = 0; i <= 1_000; i++) {
            if (isPrime(i)) {
                primesFound++;
                System.out.println(i);
            }
            if(primesFound == 1000)
                break;
        }
        System.out.println("There are " + primesFound + " prime numbers found");
    }
}
