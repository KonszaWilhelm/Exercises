package javaprogrammingmasterclass.exercises;

public class NumberOfDaysInMonth {
    // write your code here
    public static boolean isLeapYear(int year) {
        boolean returnBool = false;
        if (year < 1 || year > 9999) {
            return returnBool;
        } else if (year % 4 == 0 && year % 100 != 0) {
            returnBool = true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            returnBool = true;
        }

        return returnBool;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    } else
                        return 28;

                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;


            }
        }
    }
}