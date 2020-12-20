package javaprogrammingmasterclass.exercises;

public class LeapYear {
    public static boolean isLeapYear(int year){
        boolean returnBool = false;
        if (year < 1 || year > 10000) {
            return returnBool;
        } else if(year % 4 == 0 && year % 100 != 0){
            returnBool = true;
        } else if(year % 100 == 0 && year % 400 == 0){
            returnBool = true;
        }

        return returnBool;
    }
}
