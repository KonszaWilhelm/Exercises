package javaprogrammingmasterclass.exercises;

public class NumberToWords {
    public static void numberToWords(int number) {
        int lastDigit = 0;
        int rev = reverse(number);
        int digitCountNum = getDigitCount(number);
        int revNumDigitCount = getDigitCount(reverse(number));
        if (number == 0) {
            System.out.println("Zero");
        } else if (number > 0) {
            while (rev > 0) {
                lastDigit = rev % 10;
                rev /= 10;

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;

                }

            }

            if (digitCountNum > revNumDigitCount) {
                for (int i = revNumDigitCount; i < digitCountNum; i++) {
                    System.out.println("Zero");
                }
            }

        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber += number % 10;
            reversedNumber *= 10;
            number /= 10;
        }
        if (number < 0) {
            return -(reversedNumber / 10);

        } else
            return reversedNumber / 10;
    }

    public static int getDigitCount(int number) {
        int digitCount = 0;
        if (number == 0) {
            digitCount = 1;
        } else if (number > 0) {
            while (number > 0) {
                digitCount++;
                number /= 10;
            }
        } else
            digitCount = -1;
        return digitCount;
    }
}
