package exercises;

public class CountElementsOfString {
    static void countElementsOfString(String a) {


        int characterCounter = 0, spaceCounter = 0, numCounter = 0, otherCharCounter = 0;
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')) {
                characterCounter++;
            } else if (a.charAt(i) == ' ' || a.charAt(i) == '\n' || a.charAt(i) == '\t') {
                spaceCounter++;
            } else if (Character.isDigit(a.charAt(i))) {
                numCounter++;
            } else {
                otherCharCounter++;

            }

        }
        System.out.printf("Number of characters: %d %nNumber of spaces: %d %nNumber of numeric values: %d %nNumber of other characters: %d", characterCounter, spaceCounter, numCounter, otherCharCounter);
    }

}
