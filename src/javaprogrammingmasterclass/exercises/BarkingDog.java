package javaprogrammingmasterclass.exercises;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        boolean returnType = false;
        if (hourOfDay < 0 || hourOfDay > 23) {
            returnType = false;
        }
        else if ((hourOfDay < 8 || hourOfDay > 22) && barking) {
            returnType = true;
        }
        return returnType;
    }
}
