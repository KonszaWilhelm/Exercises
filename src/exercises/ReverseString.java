package exercises;

public class ReverseString {
    static void reverseString(String a) {
        StringBuilder sb = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            sb.append(a.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
