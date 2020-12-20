package exercises;

import java.util.ArrayList;
import java.util.List;

public class DecimalToOctal {

    static void convertDecToOct(int dec) {
        List<Object> octValue = new ArrayList<>();
        while (dec > 0) {
            int remainder = dec % 8;
            octValue.add(remainder);
            dec = dec / 8;
        }
        for (int i = octValue.size() - 1; i >= 0; i--) {
            System.out.print(octValue.get(i));
        }
    }

    static int convertOctToDec(int oct) {
        int sum = 0;
        int rem = 0;
        int counter = 0;
        while (oct > 0) {
            rem = oct % 10;
            sum += (rem * Math.pow(8, counter));
            oct /= 10;
            counter++;
        }
        return sum;
    }
}
