package javaprogrammingmasterclass.exercises;

public class ThreeAndFive {
    public static void sumOfThreeAndFive() {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0 && counter < 5) {
                System.out.println("Num divisible by three and five = " + i);
                sum += i;
                counter++;

            }

        }
        System.out.println(sum);
    }
}
