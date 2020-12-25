package exercises;

import java.util.ArrayList;
import java.util.List;

public class DecimalToHexa {

    static void convertDecToHex(int dec) {
        List<Object> hexValue = new ArrayList<>();
        while (dec > 0) {
            int remainder = dec % 16;
            switch (remainder) {
                default:
                    hexValue.add(remainder);
                    break;
                case 10:
                    hexValue.add('A');
                    break;
                case 11:
                    hexValue.add('B');
                    break;
                case 12:
                    hexValue.add('C');
                    break;
                case 13:
                    hexValue.add('D');
                    break;
                case 14:
                    hexValue.add('E');
                    break;
                case 15:
                    hexValue.add('F');
                    break;

            }
            dec = dec / 16;
        }
        for (int i = hexValue.size() - 1; i >= 0; i--) {
            System.out.print(hexValue.get(i));
        }
    }

    static int convertHexToDec(String hex) {
        int sum = 0;
        int counter = 0;

        for (int i = hex.length() - 1; i >= 0; i--) {
            if (hex.charAt(i) == 'F') {
                sum += 15 * Math.pow(16, counter);
                counter++;
            } else if (hex.charAt(i) == 'E') {
                sum += 14 * Math.pow(16, counter);
                counter++;
            } else if (hex.charAt(i) == 'D') {
                sum += 13 * Math.pow(16, counter);
                counter++;
            } else if (hex.charAt(i) == 'C') {
                sum += 12 * Math.pow(16, counter);
                counter++;
            } else if (hex.charAt(i) == 'B') {
                sum += 11 * Math.pow(16, counter);
                counter++;
            } else if (hex.charAt(i) == 'A') {
                sum += 10 * Math.pow(16, counter);
                counter++;
            } else {
                sum += (Integer.parseInt(hex.substring(i, i + 1))) * Math.pow(16, counter);
                counter++;
            }
        }
        return sum;
    }

}
