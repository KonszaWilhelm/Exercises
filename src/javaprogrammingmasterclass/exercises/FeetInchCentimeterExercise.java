package javaprogrammingmasterclass.exercises;

public class FeetInchCentimeterExercise {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double value = 0;
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            //1 foot = 30.48 centimeters 1 inch = 2.54 centimeters
            value = (feet * 30.48) + (inches * 2.54);
            return value;
        } else
            return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feet = 0;
        if (inches >= 0) {

            feet = (inches / 12); //10.25

            System.out.println(String.format("%.2f",calcFeetAndInchesToCentimeters((int) feet, (feet % 10) * 10)));
            return feet;
        } else
            return -1;


    }
}
