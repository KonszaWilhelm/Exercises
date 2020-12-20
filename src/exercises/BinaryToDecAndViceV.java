package exercises;


public class BinaryToDecAndViceV {

    protected static StringBuilder decimalToBinary(int binOne) {
        StringBuilder convertedBin = new StringBuilder();
        StringBuilder reversedBin = new StringBuilder();
        int temp;
        while (binOne > 0) {
            temp = binOne % 2;
            convertedBin.append(temp);
            binOne /= 2;
        }
        for (int i = convertedBin.length() - 1; i >= 0; i--) {
            reversedBin.append(convertedBin.charAt(i));
        }
        return reversedBin;
    }

    protected static int binaryToDecimal(int dec) {
        String one = Integer.toString(dec);
        int[] bin = new int[one.length()];
        int sum = 0;
        int counter = 0;
        for (int i = one.length() - 1; i >= 0; i--) {
            bin[counter] = Character.getNumericValue(one.charAt(i));
            sum += bin[counter] * Math.pow(2, counter);
            counter++;
        }
        return sum;
    }


}
