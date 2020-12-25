package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DisplayUniqueThreeDigitNumber {
    public static void randomThreeDigitNumber() {
        Random random = new Random();
        int randomNum;
        int randomNum1;
        int randomNum2;
        int counter = 0;
        int numPassed;
        List<Integer> randomNums = new ArrayList<>();

        while (counter == randomNums.size()) {
            randomNum = random.nextInt((4 - 1) + 1) + 1;
            randomNum1 = random.nextInt((4 - 1) + 1) + 1;
            randomNum2 = random.nextInt((4 - 1) + 1) + 1;
            numPassed = ((randomNum * 10) + randomNum1) * 10 + randomNum2;
            if (randomNum != randomNum1 && randomNum1 != randomNum2 && randomNum != randomNum2 && !randomNums.contains(numPassed)) {
                System.out.println(randomNum + "" + randomNum1 + "" + randomNum2);
                counter++;
                randomNums.add(numPassed);
            } else
                continue;
        }
        System.out.println(counter);




    }
}
